package com.company;

public class PracticaExcepciones {
    int a = 0;
    int b = 300;

    public PracticaExcepciones(){
        try{
            int c = b/a;
        }
        catch(ArithmeticException e){
            //System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        finally {
            System.out.println("El programa ha finalizado");
        }

    }
}