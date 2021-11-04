package com.w13.ejercicioDeportista.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {

    }
}
