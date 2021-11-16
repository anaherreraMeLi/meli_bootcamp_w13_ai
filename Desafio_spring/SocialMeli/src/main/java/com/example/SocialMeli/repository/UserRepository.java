package com.example.SocialMeli.repository;

import com.example.SocialMeli.entities.User;

import java.util.List;

public interface UserRepository {

    Boolean saveFollow(int id, int toFollow);

    User getById(int id);

    List<User> getFollowers(int id) throws Exception;

    List<User> getFolloweds(int user_id) throws Exception;

    Boolean savePost(Long idPost, Long idUser) throws Exception;

    Boolean unfollow(int user_id, int id_to_unfollow) throws Exception;
}