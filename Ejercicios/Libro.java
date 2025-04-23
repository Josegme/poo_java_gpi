package Ejercicios;

/*
 * Crear una clase llamada Libro con 4 atributos y mostrarlos desde el main().
*/
public class Libro {

    // atributos
    String nombreLibro;
    String autor;
    int fecha;
    double precio;

    // metodo para mostar la información
    public void mostrarInformacion() {
        System.out.println("Nombre del Libro: " + nombreLibro);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("Fecha: " + fecha);
        System.out.println("Precio: $" + precio);
    }

    // main
    public static void main(String[] args) {
        // creamos un libro - isntanciamos
        Libro libro1 = new Libro();

        // le asignamos un valor a cada atributo del objeto
        libro1.nombreLibro = "El Principito";
        libro1.autor = "El autor";
        libro1.fecha = 1522;
        libro1.precio = 25500.5;

        // mostramos la informacion
        libro1.mostrarInformacion();
    }

}