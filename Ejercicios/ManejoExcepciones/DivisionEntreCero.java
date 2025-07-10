package ManejoExcepciones;

import java.util.Scanner;

public class DivisionEntreCero {

    // metodo para realizar el cociente
    public static int cociente(int num, int denom) {
        return num / denom;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numerador");
        int num = teclado.nextInt();
        System.out.println("Introduzca el denominador");
        int denom = teclado.nextInt();

        int resultado = DivisionEntreCero.cociente(num, denom);

        System.out.println("Resultado de: " + num + "/" + denom + "= " + resultado);

    }

}