package com.Sprint1.SocialMeli.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PostListDTO {
    private int user_id;
    private ArrayList<PostDTO> postList;
}
