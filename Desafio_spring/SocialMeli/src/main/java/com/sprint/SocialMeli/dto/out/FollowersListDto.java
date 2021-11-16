package com.sprint.SocialMeli.dto.out;

import com.sprint.SocialMeli.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class FollowersListDto {
    int user_id;
    String user_name;
    List<UserDto> followers;
}
