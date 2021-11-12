package com.example.SocialMeli.controller;

import com.example.SocialMeli.dto.UserFollowersDTO;
import com.example.SocialMeli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/{user_id}/follow/{user_id_to_follow}")
    public ResponseEntity<Boolean> saveFollow(@PathVariable int user_id, @PathVariable int user_id_to_follow) throws Exception {
        return ResponseEntity.ok(this.userService.saveFollow(user_id, user_id_to_follow));
    }

    @GetMapping("/{user_id}/followers/count")
    public ResponseEntity<UserFollowersDTO> countFollowers(@PathVariable int user_id) throws Exception {
        return ResponseEntity.ok(this.userService.countFollowers(user_id));
    }
}
