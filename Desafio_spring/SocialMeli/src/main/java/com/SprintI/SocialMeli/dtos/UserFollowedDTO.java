package com.SprintI.SocialMeli.dtos;

import com.SprintI.SocialMeli.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserFollowedDTO {
    private int id;
    private String name;
    private List<UserDTO> followed;

    public UserFollowedDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.followed = user.getFollowers().stream().map(UserDTO::new).collect(Collectors.toList());
    }
}
