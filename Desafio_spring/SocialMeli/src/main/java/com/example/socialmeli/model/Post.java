package com.example.socialmeli.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Post {

    private Integer userId;
    private Integer idPost;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;
    private Product detail;
    private Integer category;
    private Double price;
    private Boolean hasPromo = false;
    private Double discount;

}