package com.SocialMeli.Sprint1SocialMeli.Controller;


import com.SocialMeli.Sprint1SocialMeli.DTO.*;
import com.SocialMeli.Sprint1SocialMeli.Model.Publicacion;
import com.SocialMeli.Sprint1SocialMeli.Service.ISocialMeliService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SocialMeliController {

    final
    ISocialMeliService service;


    public SocialMeliController(ISocialMeliService service) {
        this.service = service;
    }

    @PostMapping(path = "/users/{user_id}/follow/{user_id_to_follow}" ) //US-01
    public ResponseEntity<?> follow(@PathVariable Integer user_id,
                                    @PathVariable Integer user_id_to_follow)
    {service.serviceFollow(user_id,user_id_to_follow);
    return new ResponseEntity<>("EL COMPRADOR: "+user_id+
                                " COMENZO A SEGUIR A VENDEDOR: "+user_id_to_follow, HttpStatus.OK);}

    @ResponseBody
    @GetMapping("/users/{user_id}/followers/count") //US-02
    public ResponseEntity<SeguidoresDTO> contadorSeguidores(
            @PathVariable Integer user_id)
    {return new ResponseEntity<SeguidoresDTO>(service.serviceVendedorFollowers(user_id),HttpStatus.OK);}

    @ResponseBody
    @GetMapping("/users/{user_id}/followers/list") //US-03
    public ResponseEntity<ListadoSeguidoresDTO> listadoSeguidores(
            @PathVariable Integer user_id)
    {return new ResponseEntity<ListadoSeguidoresDTO>(service.serviceVendedorListFollowers(user_id),HttpStatus.OK);}

    @ResponseBody
    @GetMapping("/users/{user_id}/followed/list") //US-04
    public ResponseEntity<ListadoSeguidosDTO> listadoSeguidos(
            @PathVariable Integer user_id)
    {return new ResponseEntity<ListadoSeguidosDTO>(service.serviceCompradorListFollowed(user_id),HttpStatus.OK);}

    @PostMapping("/products/post" ) //US-05
    public ResponseEntity<?> nuevaPublicacion(@RequestBody PublicacionDTO publi) throws Exception {
        service.serviceNewPost(publi);
        return new ResponseEntity<>("NUEVA PUBLICACION CREADA", HttpStatus.OK);}

    @ResponseBody
    @GetMapping("/products/post") //Prueba
    public List<Publicacion> listarPublicaciones()
    {
        return service.listadoPublicacionTotal();
    }

    @ResponseBody
    @GetMapping("/products/followed/{user_id}/list") // US-06
    public List<ListadoPublicacionesDTO> listadoPublicaciones(@PathVariable Integer user_id)
    {
        return service.listadoPublicaciones(user_id);

    }

}
