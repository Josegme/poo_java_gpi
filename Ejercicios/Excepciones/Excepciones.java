package Ejercicios.Excepciones;

import javax.swing.JOptionPane;

public class Excepciones {

    public static void main(String[] args) {

        // creamos una lista de las respuestas de los alumnos
        int[] respuestas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };

        // creamos una lista vacia para ir marcando la Frecuencia de las respuestas
        int[] frecuencia = new int[6];

        // utilizamos un for para iterear e ir sumando las frecuencias
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            try {
                frecuencia[respuestas[respuesta]] += 1;
            } catch (ArrayIndexOutOfBoundsException e) {

                JOptionPane.showMessageDialog(null, "Valor Incorrecto: " + respuestas[respuesta]);

            }
        }
        System.out.printf("%s %10s\n", "Calificación", "Frecuencia");

        for (int calificacion = 1; calificacion < frecuencia.length; calificacion++) {
            System.out.printf("%s %10s\n", calificacion, frecuencia[calificacion]);
        }

    }

}
