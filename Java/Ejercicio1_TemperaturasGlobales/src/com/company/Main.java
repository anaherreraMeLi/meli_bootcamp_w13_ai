package com.company;

public class Main {

    public static void main(String[] args) {
        String ciudades[] = new String[10];

        ciudades[0] = "Londres";
        ciudades[1] = "Madrid";
        ciudades[2] = "Nueva york";
        ciudades[3] = "Buenos Aires";
        ciudades[4] = "Asuncion";
        ciudades[5] = "Sáo Pablo";
        ciudades[6] = "Lima";
        ciudades[7] = "Santiago de Chile";
        ciudades[8] = "Lisboa";
        ciudades[9] = "Tokio";

        int temperaturas[][] = new int[10][2];

        temperaturas[0][0] = -2;
        temperaturas[1][0] = -3;
        temperaturas[2][0]= -8;
        temperaturas[3][0]= 4;
        temperaturas[4][0]= 6;
        temperaturas[5][0]= 5;
        temperaturas[6][0]= 0;
        temperaturas[7][0]= -7;
        temperaturas[8][0]= -1;
        temperaturas[9][0]= -10;
        temperaturas[0][1]= 33;
        temperaturas[1][1]= 32;
        temperaturas[2][1]= 27;
        temperaturas[3][1]= 37;
        temperaturas[4][1]= 42;
        temperaturas[5][1]= 43;
        temperaturas[6][1]= 39;
        temperaturas[7][1]= 26;
        temperaturas[8][1]= 31;
        temperaturas[9][1]= 35;

        int tempMinima = temperaturas[0][0];
        int tempMaxima = temperaturas[0][1];;
        int indiceCiudadMinima = 0;
        int indiceCiudadMaxima = 0;
        for (int i = 1; i< ciudades.length; i++ ){
            if (temperaturas[i][0] < tempMinima) {
                tempMinima = temperaturas[i][0];
                indiceCiudadMinima = i;

            }

            if (temperaturas[i][1] > tempMaxima){
                tempMaxima = temperaturas[i][1];
                indiceCiudadMaxima = i;
            }



        }
        System.out.println("La menor temperatura la tuvo "+ ciudades[indiceCiudadMinima] + ", con una temperatura de " + tempMinima);
        System.out.println("La mayor temperatura la tuvo "+ ciudades[indiceCiudadMaxima] + ", con una temperatura de " + tempMaxima);
    }
}
