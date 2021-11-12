package com.bootcamp.SocialMeli.repository;

import com.bootcamp.SocialMeli.model.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SocialMeliRepository implements ISocialMeliRepository{

    private Map<Integer, Usuario> usuarios;
    //@Value("${spring.json_source}")
    private String json_source = "develop/";

    public SocialMeliRepository() {
        this.usuarios = new HashMap<>();
        List<Usuario> listaUsuarios = cargarUsuarios();
        //listaUsuarios.stream().map(x -> this.usuarios.put(x.getUserId(), x));
        for (Usuario user : listaUsuarios) {
            this.usuarios.put(user.getUserId(), user);
        }
    }

    public List<Usuario> cargarUsuarios(){
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:" + json_source + "usuarios.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Usuario>> typeRef = new TypeReference<>() {};
        List<Usuario> usuarios = null;
        try {
            usuarios = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    //public List<Producto> cargarProductos();

    public Usuario buscarUsuario(Integer idUsuario){
        return this.usuarios.get(idUsuario);
    }

    public List<Usuario> buscarSeguidores(Integer userId){
       // this.usuarios.values().stream().filter(x -> x.getVendedoresSeguidos().)
        return null;
    }

    public void seguirUsuario(Integer idSeguidor, Integer idVendedor){
       // this.usuarios.get(idSeguidor).seguirVendedor();
    }

}
