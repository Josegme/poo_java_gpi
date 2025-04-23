package TP_1_POO_GPI;
/*
 * control de egreso de 30 camiones
 * control de la carga que transportan
 * cargar por teclado: patente-nombre y ap del conductor
 * tipo carga y a que hora egresó.
 * contar y mostrar cuantos camiones cargaron té 
 */

import java.util.Scanner;

public class RegistroCamiones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // constante: la cantidad de camiones
        final int CANT_CAMIONES = 3;

        // vectores para almacenar datos
        String[] patentes = new String[CANT_CAMIONES];
        String[] choferes = new String[CANT_CAMIONES];
        String[] tiposCarga = new String[CANT_CAMIONES];
        String[] horarios = new String[CANT_CAMIONES];

        // tenemos que controlar cuantos camiones cargaron té
        int contadorTe = 0;

        // cargar los datos de cada camión
        for (int i = 0; i < CANT_CAMIONES; i++) {

            System.out.println("\nCamión #" + (i + 1));
            System.out.print("Patente: ");
            patentes[i] = teclado.nextLine();

            System.out.print("Nombre y apellido del chofer: ");
            choferes[i] = teclado.nextLine();

            System.out.print("Tipo de carga (madera / yerba / te): ");
            tiposCarga[i] = teclado.nextLine().toLowerCase();

            // solo necesitamos contar los camiones que cargan té
            if (tiposCarga[i].equals("te")) {
                contadorTe++;
            }

            System.out.print("Hora de egreso: ");
            horarios[i] = teclado.nextLine();
        }

        // mostrar todos los datos
        System.out.println("##############################");

        System.out.println("\n--- REGISTRO DE CAMIONES ---");
        for (int i = 0; i < CANT_CAMIONES; i++) {
            System.out.println("\nCamión #" + (i + 1));
            System.out.println("Patente: " + patentes[i]);
            System.out.println("Chofer: " + choferes[i]);
            System.out.println("Tipo de carga: " + tiposCarga[i]);
            System.out.println("Hora de egreso: " + horarios[i]);
        }

        System.out.println("\nCantidad de camiones que transportan té: " + contadorTe);
    }
}
