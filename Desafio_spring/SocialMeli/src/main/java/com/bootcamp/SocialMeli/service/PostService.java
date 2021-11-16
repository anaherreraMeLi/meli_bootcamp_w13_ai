package com.bootcamp.SocialMeli.service;

import com.bootcamp.SocialMeli.dto.FollowedPostsDTO;
import com.bootcamp.SocialMeli.dto.PostDTO;
import com.bootcamp.SocialMeli.model.Post;
import com.bootcamp.SocialMeli.model.User;
import com.bootcamp.SocialMeli.repository.IPostRepository;
import com.bootcamp.SocialMeli.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService implements IPostService{
    @Autowired IPostRepository postRepository;
    @Autowired IUserRepository userRepository;

    @Override
    public void addPost(Post post) {
        postRepository.add(post);
        int userId = post.getUserId();

        User user = userRepository.find(userId).orElseThrow();
        //tirar excepción si el usuario no existe
        //tirar excepción si el usuario no puede vender
        user.addPost(post);
    }

    @Override
    public FollowedPostsDTO getFollowedPosts(int userId) {
        User user = this.userRepository.find(userId).orElseThrow();
        //tirar not found exception
        List<User> listOfFollowed = new ArrayList<>(user.getFollowed().values());
        FollowedPostsDTO followedPosts = new FollowedPostsDTO(userId);
        for (User followed : listOfFollowed) {
            for (Post post : followed.getPosts().values()) {
                followedPosts.addPost(new PostDTO(post));
            }
        }
        return followedPosts;
    }
}