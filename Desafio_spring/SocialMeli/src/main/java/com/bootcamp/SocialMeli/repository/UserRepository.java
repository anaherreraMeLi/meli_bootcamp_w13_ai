package com.bootcamp.SocialMeli.repository;

import com.bootcamp.SocialMeli.exception.UserAlreadyExistsException;
import com.bootcamp.SocialMeli.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository implements IUserRepository{
    Map<Integer, User> users = new HashMap<>();

    public UserRepository() {
        this.add(1, "Juan", false);
        this.add(2, "Pedro", false);
        this.add(3, "Agustina", true);
        this.add(4, "Azul", true);
    }

    @Override
    public Optional<User> find(int userId) {
        if (!this.users.containsKey(userId)) return Optional.empty();
        return Optional.of(this.users.get(userId));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList(this.users.values());
    }

    @Override
    public User add(int userId, String userName, boolean isSeller) {
        User user = new User(userId, userName, isSeller);
        if (this.users.containsKey(userId)) throw new UserAlreadyExistsException(userId);
        this.users.put(userId, user);
        return user;
    }
}
