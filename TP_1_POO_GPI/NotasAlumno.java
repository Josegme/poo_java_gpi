package TP_1_POO_GPI;

/*
 * cada alumno tiene n notas
 * se ingresa por teclado la cantidad de notas
 * las notas se cargan en un vector
 * el vector va a estar definido por la cantidad de notas (5 notas)
 * mostrar la nota mas alta y el promedio de notas
 */
import java.util.Scanner;

public class NotasAlumno {

    // main
    public static void main(String[] args) {

        // para ingresar los datos por teclado -> Scanner
        Scanner teclado = new Scanner(System.in);

        // se pide al usuario la cantidad de notas
        System.out.println("Ingrese la cantidad de notas: ");
        int n = teclado.nextInt();

        // atributos > para cargar el arreglo dinámico para las notas
        double[] notas = new double[n];

        // variables auxiliares
        double suma = 0;
        double notaMaxima = 0;

        // cargar el vector con las notas
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();

            // acumular para el promedio
            suma += notas[i];

            // buscar la nota más alta
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }

        }

        // calcular promedio
        double promedio = suma / n;

        // mostrar resultados
        System.out.println("\nNotas más alta: " + notaMaxima);
        System.out.println("Promedio de notas: " + promedio);

    }

}
