package Ejercicios;
/*
 * Crear una clase llamada Pelicula con 4 atributos: titulo, director, anioEstreno y duracionMinutos. Crear un objeto en el main y mostrar su información en consola
 */

public class Pelicula {

    // atributos
    public String titulo;
    public String director;
    public int anioEstreno;
    public double duracionMinutos;

    // método para mostrar esa información
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Año de Estreno: " + anioEstreno);
        System.out.println("Duración: " + duracionMinutos);
    }

    // creamos un objeto pelícua
    public static void main(String[] args) {
        // instanciamos la clase
        Pelicula pelicula1 = new Pelicula();

        // le damos valor a cada atributo ya que no usamos constructor
        pelicula1.titulo = "Los Vengadores";
        pelicula1.director = "Kevin Fegie";
        pelicula1.anioEstreno = 2012;
        pelicula1.duracionMinutos = 3.30;

        // utilizamos el metodo para mostrar la info
        pelicula1.mostrarInformacion();

    }

}
