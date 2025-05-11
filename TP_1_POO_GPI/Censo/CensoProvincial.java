package TP_1_POO_GPI.Censo;

import java.util.Scanner;

public class CensoProvincial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables generales
        int totalPersonas = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varonesEdad16a65 = 0;

        // Para registrar la persona con mayor edad
        int mayorEdad = -1; // Inicializamos con un valor bajo
        String sexoMayor = "";
        int dniMayor = 0;

        while (true) {
            // Ingreso del DNI
            System.out.print("Ingrese número de documento (0 para finalizar): ");
            int dni = scanner.nextInt();

            if (dni == 0) {
                break; // Si el DNI es 0, se termina el ingreso de datos
            }

            // Ingreso de edad
            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            // Ingreso de sexo
            System.out.print("Ingrese sexo (F o M): ");
            char sexo = scanner.next().toUpperCase().charAt(0); // Convertimos a mayúscula

            totalPersonas++; // Contamos a la persona

            if (sexo == 'M') {
                totalVarones++; // Contamos un varón

                // Si el varón tiene entre 16 y 65 años (inclusive)
                if (edad >= 16 && edad <= 65) {
                    varonesEdad16a65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++; // Contamos una mujer
            } else {
                System.out.println("Sexo inválido. Ingrese 'M' o 'F'.");
            }

            // Comprobamos si esta persona tiene la mayor edad registrada
            if (edad > mayorEdad) {
                mayorEdad = edad;
                sexoMayor = (sexo == 'M') ? "Masculino" : "Femenino";
                dniMayor = dni;
            }

            System.out.println(); // Separación entre personas
        }

        // Calculamos el porcentaje
        double porcentajeVaronesEnEdad = 0;
        if (totalVarones > 0) {
            porcentajeVaronesEnEdad = (varonesEdad16a65 * 100.0) / totalVarones;
        }

        // Mostramos los resultados
        System.out.println("=== RESULTADOS DEL CENSO ===");
        System.out.println("Total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + totalVarones);
        System.out.println("Cantidad de mujeres: " + totalMujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentajeVaronesEnEdad + "%");

        if (mayorEdad != -1) {
            System.out.println("Persona de mayor edad:");
            System.out.println(" - DNI: " + dniMayor);
            System.out.println(" - Edad: " + mayorEdad);
            System.out.println(" - Sexo: " + sexoMayor);
        } else {
            System.out.println("No se ingresaron datos válidos.");
        }

        scanner.close();
    }
}
