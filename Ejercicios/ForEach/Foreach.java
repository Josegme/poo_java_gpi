package Ejercicios.ForEach;

public class Foreach {

    public static void main(String[] args) {
        int[] arreglo = { 87, 64, 25, 32, 89, 20, 22 };
        int total = 0;

        // con el for each esto se simplifica
        for (int numero : arreglo) {
            total += numero;
        }
        System.out.println("El total con for each es: " + total);

        // de manera tradicional del for
        /*
         * for (int i = 0; i < arreglo.length; i++) {
         * total += arreglo[i];
         * }
         * System.out.println("El total con for es: " + total);
         */
    }

}
