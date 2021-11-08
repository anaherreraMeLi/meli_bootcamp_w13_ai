package com.bootcamp.link_tracker.excepciones;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LinkInexistenteException extends RuntimeException{

    public LinkInexistenteException(String mensaje){
        super(mensaje);
    }

}
