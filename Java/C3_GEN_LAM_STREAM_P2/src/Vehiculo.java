import java.util.StringJoiner;

public class Vehiculo
{
    private String marca;
    private String modelo;
    private Double costo;

    public Vehiculo(String marca, String modelo, Double costo)
    {
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public Double getCosto()
    {
        return costo;
    }

    public void setCosto(double costo)
    {
        this.costo = costo;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Vehiculo.class.getSimpleName() + "[", "]")
                .add("marca='" + marca + "'")
                .add("modelo='" + modelo + "'")
                .add("costo=" + costo)
                .toString();
    }
}