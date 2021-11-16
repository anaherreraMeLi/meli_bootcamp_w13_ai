package com.bootcamp.socialmeli.service;

import com.bootcamp.socialmeli.dto.PostDTO;
import com.bootcamp.socialmeli.dto.UserWithPostsDTO;
import com.bootcamp.socialmeli.mapper.IMapper;
import com.bootcamp.socialmeli.model.Post;
import com.bootcamp.socialmeli.model.User;
import com.bootcamp.socialmeli.repository.IPostRepository;
import com.bootcamp.socialmeli.repository.IProductRepository;
import com.bootcamp.socialmeli.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService implements IPostService {

    private final IPostRepository postRepository;
    private final IProductRepository productRepository;
    private final IUserRepository userRepository;
    private final IMapper mapper;

    public PostService(IPostRepository postRepository, IProductRepository productRepository, IUserRepository userRepository, IMapper mapper) {
        this.postRepository = postRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public PostDTO getPost(long id) {
        return mapper.postToPostDTO(
                postRepository.getPost(id)
        );
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        productRepository.createProduct(mapper.productDTOToProduct(postDTO.getDetail()));
        Post postCreated = postRepository.createPost(mapper.postDTOToPost(postDTO));
        return mapper.postToPostDTO(postCreated);
    }

    @Override
    public UserWithPostsDTO getLatestFollowedPosts(long userId, int weeks) {
        List<PostDTO> posts = new ArrayList<>();
        User user = userRepository.getUser(userId);
        LocalDate now = LocalDate.now();
        for (User followedUser: user.getFollowers()) {
            List<PostDTO> followedUserPosts = followedUser.getPosts().stream().filter(
                    post -> !post.getDate().plusWeeks(weeks).isBefore(now)
            ).map(
                    mapper::postToPostDTO
            ).collect(Collectors.toList());
            posts.addAll(followedUserPosts);
        }
        return new UserWithPostsDTO(userId, posts);
    }
}
