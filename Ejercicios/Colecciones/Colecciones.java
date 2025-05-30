package Ejercicios.Colecciones;

import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {

        // definimos el ArrayList
        ArrayList<String> array = new ArrayList<String>();

        // vamos a agregar elementos ADD
        array.add("Rojo");
        array.add("Amarillo");
        array.add("Verde");

        // Podemos preguntar si el array tiene elementos
        if (array.contains("Verde")) {
            System.out.println("Si contiene el Verde");
        } else {
            System.out.println("No Contiene el Verde");
        }

        // Podemos iterar en el ArrayList con for o foreach

        for (String elemento : array) {
            System.out.println("Este es el color " + elemento);
        }

        // podemos preguntar si esta vació con isEmpty
        System.out.println("El array esta vacío: " + array.isEmpty());

        // podemos vaciar el array con Clear
        array.clear();
        System.out.println("Se usa el método clear() y preguntamos");
        System.out.println("El array esta vacío: " + array.isEmpty());

    }

}
