package Ejercicios.DoWhile;

import java.util.Scanner;

public class EjmploDoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Ingrese un valor entre 1 y 999 (0 para terminar)");
            valor = teclado.nextInt();

            if (valor >= 100) {
                System.out.println("Tiene 3 dígitos");
            } else {
                if (valor >= 10) {
                    System.out.println("Tiene dos dígitos");
                } else {
                    System.out.println("Tiene un dígito");
                }
            }

        } while (valor != 0);
    }
}
