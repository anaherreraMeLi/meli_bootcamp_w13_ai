package com.company;

public class ejercicioSueldos {



        String dni = "12345678"; // dni de ejemplo
        double sueldoBase = 19000; // monto de ejemplo
        double sueldoConAumento;

        public void calcularAumento() {

            // Tu codigo aqui
            if (sueldoBase <= 20000) {
                sueldoConAumento = sueldoBase + sueldoBase*0.2;
            }
            else {
                if (sueldoBase > 20000 && sueldoBase <= 45000){
                    sueldoConAumento = sueldoBase + (sueldoBase*0.1);
                }
                else {
                    sueldoConAumento = sueldoBase + sueldoBase*0.05;
                }
            }

            System.out.println ("El nuevo sueldo del empleado es de: " + sueldoConAumento);
        }

        public static void main(String[] args) {

            //new ejercicioSueldos().calcularAumento();
        }


}
