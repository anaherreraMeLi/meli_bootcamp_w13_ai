package com.bootcamp.Mensajero.model;

public class Telegrafo implements Mensajero {

    String convertirAMorse(String msg){
        return "Piripi";
    }

    @Override
    public String emitirMensaje(String msg) {
        return convertirAMorse(msg);
    }
}
