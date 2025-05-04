package Ejercicios;

import java.util.Scanner;

public class EdadGenero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola ¿Cual es tu género? ");
        String genero = sc.nextLine();

        System.out.println("¿Cual es tu edad?");
        int edad = sc.nextInt();

        if (genero.equals("masculino")) {
            System.out.println("Eres un hombre");
        } else {
            System.out.println("Eres una mujer.");
        }
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        System.out.println("Hola, eres " + genero + " de " + edad + " años.");

        sc.close();

    }

}
