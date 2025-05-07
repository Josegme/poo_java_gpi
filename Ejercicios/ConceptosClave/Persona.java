package Ejercicios.ConceptosClave;

public class Persona {

    // Atributos - ¿cuales son las caracteristicas que van a tener todos nuestros
    // objetos?
    private String nombre;
    private String apellido;
    private int edad;

    // métodos - ¿cuales son las acciones que van a poder realizar nuestros objetos?
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

        // crear un objeto persona
        Persona pers = new Persona();

        // Asignamos valores a los setters (esto luego se hace por teclado)
        pers.setNombre("Juan");
        pers.setApellido("Perez");
        pers.setEdad(35);

        // mostramos los valores con los getters
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Apellido: " + pers.getApellido());
        System.out.println("Edad: " + pers.getEdad());

    }
}
