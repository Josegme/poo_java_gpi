package ManejoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionConExcepcion {

    // método para realizar el cociente
    public static int cociente(int num, int denom)
            throws ArithmeticException {
        return num / denom;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean continuarCiclo = true;

        do {
            try {
                System.out.println("Introduzca el numerador");
                int num = teclado.nextInt();
                System.out.println("Introduzca el denominador");
                int denom = teclado.nextInt();

                int resultado = DivisionConExcepcion.cociente(num, denom);

                System.out.println("Resultado de: " + num + "/" + denom + " = " + resultado);
                continuarCiclo = false;
            } catch (InputMismatchException exception) {
                System.err.println("Se produjo un error: " + exception);
                teclado.nextLine(); // Limpia la entrada incorrecta
                System.out.println("Debe introducir un número entero.");

            } catch (ArithmeticException exception) {
                System.err.println("\nException: " + exception);
                System.out.println("No se puede dividir por cero. Ingrese nuevamente.");

            }
        } while (continuarCiclo);

        teclado.close();
    }
}
