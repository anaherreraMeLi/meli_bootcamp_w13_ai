package com.ejDeportistas.calculandodeportistas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
}
