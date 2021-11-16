public class Persona {
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    public int calcularIMC() {
        double imc = this.peso / ( Math.pow(this.altura, 2));
        if( imc < 20 ) {
            return -1;
        }else {
            if (imc < 25) {
                return 0;
            }else {
                return 1;
            }
        }
    }

    public boolean esMayorDeEdad() {
        if( this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Dni='" + dni + '\'' +
                ", Peso=" + peso +
                ", Altura=" + altura +
                '}';
    }

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}