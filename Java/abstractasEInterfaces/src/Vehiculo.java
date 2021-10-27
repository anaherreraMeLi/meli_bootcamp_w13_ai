public class Vehiculo {
    private String modelo;
    private String marca;
    private double costo;

    public Vehiculo(String marca, String modelo, double costo) {

        this.marca = marca;
        this.modelo = modelo;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s - Modelo: %s - Costo:  %f", this.marca, this.modelo, this.costo);
    }
}
