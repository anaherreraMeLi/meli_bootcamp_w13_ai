package ejericiciopractico.integrador;

import java.util.List;

public class Factura{
    Long numeroFactura;
    Cliente dueno;
    List<Item> objetos;
    double totalCompra;

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Factura(Long numeroFactura, Cliente dueno, List<Item> objetos) {
        this.numeroFactura = numeroFactura;
        this.dueno = dueno;
        this.objetos = objetos;
        this.totalCompra = objetos.stream().reduce(
                0.0,(acumulador,x)->{return (x.getCantidad()*x.getCostoUnitario());},Double::sum);
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    public List<Item> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Item> objetos) {
        this.objetos = objetos;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "dueno=" + dueno +
                ", objetos=" + objetos +
                ", totalCompra=" + totalCompra +
                '}';
    }

}