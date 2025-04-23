package TP_1_POO_GPI;

/*
 * cargar un vector con n notas (Scanner)
 * indicar cantidad de aprobados (>= 6)
 * indicar cantidad de desaprobados (< 6)
 */
import java.util.Scanner;

public class EstadoNotas {

    // main
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar la cantidad de notas
        System.out.println("Ingrese la cantidad de notas: ");
        int n = teclado.nextInt();

        // arreglo dinámico de notas
        double[] notas = new double[n];

        // contador
        int aprobados = 0;
        int desaprobados = 0;

        // cargar notas y contar aprobados/desaprobados
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            notas[i] = teclado.nextDouble();

            if (notas[i] >= 6) {
                aprobados = aprobados + 1;
            } else {
                desaprobados = desaprobados + 1;
            }
        }
        // mostrar resultados
        System.out.println("============================");
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidd de desaprobados: " + desaprobados);

    }

}
