package Ejercicios.ConversiónObjetos;

public class Gato extends Mamifero {

    public static void main(String[] args) {

        /*
         * Gato g = new Gato();
         * System.out.println("El gato es: " + g);
         * 
         * // Upcasting
         * Mamifero m = g;
         * System.out.println("El mamifero es: " + m);
         */

        Mamifero m = new Gato();
        System.out.println("El mamífero es: " + m);
    }
}
