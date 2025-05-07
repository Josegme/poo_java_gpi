package Ejercicios;
/*
 * Si tenemos una clase Perro, podemos definir atributos como nombre, 
 * raza y edad (que van a ser sus caracteristicas) y los métodos de la clase
 * Perro como ladrar(), correr(), comer(), etc, es decir, las acciones que puede 
 * realizar. Entonces creamos la clase, le damos atributos y métodos.
 */

//Le doy de nombre ClasePerro solo para que se entienda ahora que es la clase creada
public class Perro {

    // los Atributos que van a definir las caracteristicas de la clase
    String nombre;
    String raza;
    int edad;

    // para saber que métodos te puedes preguntar ¿Que puede hacer el Perro? ladrar,
    // correr, etc
    public void ladrar() {
        System.out.println(nombre + " está ladrando");
    }

    // Vamos a crear un Objeto (instancia de esa clase) Caracteristicas y Métodos
    public static void main(String[] args) {
        // creamos una Instancia de la clase perro
        Perro miPerro = new Perro();

        // creamos los atributos que definen las caracteristicas de un perro (objeto) en
        // particular
        miPerro.nombre = "Toby";
        miPerro.raza = "Labrador";
        miPerro.edad = 3;

        // Método que representa la acción ladrar
        miPerro.ladrar();

    }
}