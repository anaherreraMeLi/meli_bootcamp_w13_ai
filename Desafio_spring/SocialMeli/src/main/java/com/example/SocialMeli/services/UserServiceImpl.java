package com.example.SocialMeli.services;

import com.example.SocialMeli.dto.UserFollowersDTO;
import com.example.SocialMeli.entities.User;
import com.example.SocialMeli.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean saveFollow(int user_id, int toFollow) throws Exception {
        User user = userRepository.getById(user_id);
        if(user == null) throw new Exception();
        return this.userRepository.saveFollow(user_id, toFollow);
    }

    @Override
    public UserFollowersDTO countFollowers(int user_id) throws Exception {
        User user = this.userRepository.getById(user_id);
        if (user == null) throw new Exception();
        return new UserFollowersDTO(user.getUser_id(), user.getUser_name(), user.getSeguidores().size());
    }

}
