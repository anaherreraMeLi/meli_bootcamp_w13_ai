package java2;

public class Persona {

    String nombre;
    int edad;
    String dni;
    float peso;
    float altura;


    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = peso/(Math.pow(altura,2));
        if(imc < 20){
            return -1;
        }
        else if(imc >= 20 && imc <= 25){
            return 0;
        }
        else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if(this.edad > 18){
            return true;
        }
        else{
            return false;
        }
    }

    public String returnPersona(){
        return "Nombre: "+this.nombre+" Edad: "+this.edad+" DNI: "+this.dni+" Peso: "+this.peso+" Altura: "+this.altura;
    }
}