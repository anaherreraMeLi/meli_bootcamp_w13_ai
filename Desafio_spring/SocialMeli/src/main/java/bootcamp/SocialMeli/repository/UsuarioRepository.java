package bootcamp.SocialMeli.repository;

import bootcamp.SocialMeli.model.Post;
import bootcamp.SocialMeli.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UsuarioRepository implements IRepository {

    private List<User> users;

    public UsuarioRepository() {
        users = new ArrayList<>();
        users.add(new User("Jorge", "De Michiel", false));
        users.add(new User("Pablo", "Perez", false));
        users.add(new User("Victoria", "Lopez", true));
        users.add(new User("Caludia", "Suarez", true));
    }

    @Override
    public User getUserById(int id) {
        return users.stream()
                .filter(i -> i.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public List<User> followedUser(User user) {
        return users.stream()
                .filter(u -> u.isFollower(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<Post> getLastPostTwoWeekAgo(int userId) {
        return users.stream().filter(u -> u.isFollower(getUserById(userId))).flatMap(u -> u.getPosteos().stream())
                .filter(l -> l.getDate().isAfter(LocalDate.now().minusWeeks(2))).collect(Collectors.toList());
    }

    @Override
    public User findUserByLastName(String lastname) {
        return users.stream().filter(u->u.getLastname().equals(lastname)).findFirst().orElse(null);
    }

    @Override
    public void save(User created) {
        users.add(created);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public List<User> findAllVendedores() {
        return users.stream().filter(u->u.isSeller())
                .collect(Collectors.toList());
    }


}
