package TP_1_POO_GPI.carrera_autos;

import java.util.Scanner; // Importamos Scanner para leer desde el teclado

public class CarreraAutomovilistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos el objeto Scanner

        int numeroVehiculo; // Variable para guardar el número del vehículo
        double tiempo; // Variable para guardar el tiempo ingresado

        double mejorTiempo = Double.MAX_VALUE; // Inicializamos con un valor muy grande
        int vehiculoGanador = 0; // Guardará el número del vehículo con mejor tiempo

        // Repetimos el ingreso para los 12 competidores
        for (int i = 1; i <= 12; i++) {
            System.out.println("Participante " + i);

            // Ingresamos el número de vehículo
            System.out.print("Ingrese el número del vehículo: ");
            numeroVehiculo = scanner.nextInt();

            // Ingresamos el tiempo en segundos
            System.out.print("Ingrese el tiempo (en segundos): ");
            tiempo = scanner.nextDouble();

            // Verificamos si este tiempo es el mejor registrado hasta ahora
            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo; // Guardamos el nuevo mejor tiempo
                vehiculoGanador = numeroVehiculo; // Guardamos el número del vehículo ganador
            }

            System.out.println(); // Línea en blanco para separar entradas
        }

        // Mostramos el resultado final
        System.out.println("=== RESULTADO DE LA CARRERA ===");
        System.out.println("Vehículo con mejor tiempo: " + vehiculoGanador);
        System.out.println("Tiempo realizado: " + mejorTiempo + " segundos");

        scanner.close(); // Cerramos el Scanner al final del programa
    }
}
