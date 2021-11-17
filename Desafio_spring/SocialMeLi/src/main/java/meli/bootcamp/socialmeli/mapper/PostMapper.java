package meli.bootcamp.socialmeli.mapper;

import meli.bootcamp.socialmeli.dto.ProductsPostByUserDTO;
import meli.bootcamp.socialmeli.dto.ProductsPostDTO;
import meli.bootcamp.socialmeli.dto.ProductsUserIDListDTO;
import meli.bootcamp.socialmeli.model.Post;
import meli.bootcamp.socialmeli.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Clase para mapear entre el modelo y los DTOs los post que ingresan o salen del sistema.
 * @author andrmorales
 */
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PostMapper {
    @Mappings({
            @Mapping(source= "user_id", target = "userId"),
            @Mapping(source= "id_post", target = "postId"),
            @Mapping(source= "date", target = "date", dateFormat = "dd-MM-yyyy"),
            @Mapping(source= "detail", target = "detail"),
            @Mapping(source= "category", target = "category"),
            @Mapping(source= "price", target = "price")
    })
    Post productoPostDTOtoPost(ProductsPostDTO productsPostDTO);

    @InheritInverseConfiguration
    ProductsPostDTO postToPoductoPostDTO(Post mPost);

    @Mappings(value = {
            @Mapping(source= "postId", target = "id_post"),
            @Mapping(source= "date", target = "date"),
            @Mapping(source= "detail", target = "detail"),
            @Mapping(source= "category", target = "category"),
            @Mapping(source= "price", target = "price")
    })
    ProductsPostByUserDTO postToProductsPostByUserDTO(Post productsPostDTO);
}