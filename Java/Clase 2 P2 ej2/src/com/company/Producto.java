package com.company;

public abstract class Producto {
    String nombre;
    double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto >>" +
                "Nombre : " + nombre + '\'' +
                ", Precio : " + precio;
    }

    double calcular(int cantidadDeProductos){
        return precio*(double)cantidadDeProductos;
    }
}
