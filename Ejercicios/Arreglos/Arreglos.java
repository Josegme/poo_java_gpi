package Ejercicios.Arreglos;

public class Arreglos {

    public static void main(String[] args) {
        String[] arreglo1 = new String[5];
        int[] arreglo2 = { 1, 2, 3, 4, 5 };

        arreglo1[0] = "Esta es la posición 1 del arreglo";
        arreglo1[1] = "Esta es la posición 2 del arreglo";
        arreglo1[2] = "Esta es la posición 3 del arreglo";
        arreglo1[3] = "Esta es la posición 4 del arreglo";
        arreglo1[4] = "Esta es la posición 5 del arreglo";

        // System.out.print(arreglo2[2]);

        int i;

        for (i = 0; i < arreglo1.length; i++) {
            System.out.println("El valor es " + arreglo1[i]);
        }

    }
}