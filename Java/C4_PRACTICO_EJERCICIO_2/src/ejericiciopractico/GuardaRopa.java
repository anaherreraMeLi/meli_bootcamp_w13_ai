package ejericiciopractico;

import java.util.*;

public class GuardaRopa {

    private int contador;
    private Map<Integer, List<Prenda>> prendas;

    public GuardaRopa() {
        this.contador = 0;
        prendas = new HashMap<>();
    }

    public GuardaRopa(int contador, Map<Integer, List<Prenda>> prendas) {
        this.contador = contador;
        this.prendas = prendas;
    }

    public void mostrarPrendas(){
        for (Map.Entry<Integer, List<Prenda>> prenda: prendas.entrySet()) {
            if (!prenda.getValue().isEmpty()){
                System.out.println("Casillero "+prenda.getKey());
                prenda.getValue().stream().forEach(System.out::println);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        //List<Prenda> prendasDevolver = this.prendas.get(numero);
        return prendas.remove(numero);
        //return prendasDevolver;
    }

    public Integer guardarPrendas(List<Prenda> prendas){
        this.prendas.put(this.contador, prendas);
        this.contador += 1;
        return this.contador-1;
    }

    public Map<Integer, List<Prenda>> getPrendas() {
        return prendas;
    }

    public void setPrendas(Map<Integer, List<Prenda>> prendas) {
        this.prendas = prendas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}