package Ejercicios;
/*
 * Crear una clase llamada Auto con los atributos: marca, modelo, anio, y precio. Asignar valores en el main y mostrarlos usando un método.
 */

public class Autos {

    // Creamos los atributos de clase
    public String marca;
    public String modelo;
    public int anio;
    public double precio;

    // creamos el método para mostrar esa información
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);
    }

    // creamos el main para ejecutar
    public static void main(String[] args) {

        // instanciamos la clase autos
        Autos auto1 = new Autos();

        // como no tenemos constructor asignamos valores a los atributos
        auto1.marca = "Toyota";
        auto1.modelo = "Hilux";
        auto1.anio = 2024;
        auto1.precio = 50000356.265;

        // utilizamos el método para mostrar la información
        auto1.mostrarInformacion();
    }

}
