package com.bootcamp.SocialMeli.dto;

import com.bootcamp.SocialMeli.model.Post;
import com.bootcamp.SocialMeli.model.ProductDetail;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProductDetailDTO {
    int productId;
    String productName;
    String type;
    String brand;
    String color;
    String notes;


    public ProductDetailDTO(ProductDetail productDetail) {
        this.productId = productDetail.getId();
        this.productName = productDetail.getName();
        this.type = productDetail.getType();
        this.brand = productDetail.getBrand();
        this.color = productDetail.getColor();
        this.notes = productDetail.getNotes();

    }
}