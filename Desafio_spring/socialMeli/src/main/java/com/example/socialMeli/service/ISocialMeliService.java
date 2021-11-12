package com.example.socialMeli.service;

import com.example.socialMeli.dto.*;
import com.example.socialMeli.exceptions.UsuarioNoEncontradoError;

public interface ISocialMeliService {
    public void cargarDatos();
    public RespuestaSimpleDTO seguir (int id_comprado, int id_vendedor) throws UsuarioNoEncontradoError;
    public CantidadFollowsDTO contar (int id_vendedor) throws UsuarioNoEncontradoError;
    public SeguidoresDTO buscarSeguidores (int id) throws  UsuarioNoEncontradoError;
    public SeguidosDTO buscarSeguidos (int id) throws UsuarioNoEncontradoError;
    public RespuestaSimpleDTO añadirPost (PublicacionDTO pub) throws UsuarioNoEncontradoError;
}
