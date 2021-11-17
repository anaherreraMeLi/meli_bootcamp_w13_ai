package com.MELI.models;

public class Vehiculo {
    private String modelo;
    private String marca;
    private Double costo;

    public Vehiculo(String modelo, String marca, double costo) {
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", costo=" + costo +
                '}';
    }

    public int compareTo(Vehiculo vehiculoEntrante){
        //Double ob = new Double();
        return this.costo.compareTo(vehiculoEntrante.costo);
    }
    public int compareToString(Vehiculo vehiculoEntrante){
        //Double ob = new Double();
        return this.marca.compareToIgnoreCase(vehiculoEntrante.marca);
    }
}