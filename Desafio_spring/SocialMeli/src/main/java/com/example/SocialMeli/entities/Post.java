package com.example.SocialMeli.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private Long id;
    private Long userId;
    private LocalDate date;
    private Detail detail;
    private int category;
    private double price;
}