package com.company;

import java.util.LinkedList;
import java.util.List;

public class ejercicioFacturas {


        List<String> mensajeStrings = new LinkedList<>();

        int[] serviciosCli = {1,1,2,2,2,1,2}; //vector de 7 posiciones con tipos de servicios
        double totalFactura;

        public void calcularMontoFactura() {
            //Tu codigo aqui
            for (int i = 0; i < serviciosCli.length ; i++) {
                if (serviciosCli[i] == 1) {
                    imprimirMensaje("El tipo de servicio es: " + serviciosCli[i]);
                    totalFactura = 1500;
                    imprimirMensaje ("El monto de la factura es de: " + totalFactura);
                }
                else {
                    imprimirMensaje("El tipo de servicio es: " + serviciosCli[i]);
                    totalFactura = 2200;
                    imprimirMensaje("El monto de la factura es de: " + totalFactura);
                }
            }
        }

        private void imprimirMensaje(String mensaje) {
            mensajeStrings.add(mensaje);
            System.out.println(mensaje);
        }

        public static void main(String[] args) {
           // new ejercicioFacturas().calcularMontoFactura();
        }



}
