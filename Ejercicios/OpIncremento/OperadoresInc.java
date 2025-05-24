package Ejercicios.OpIncremento;

public class OperadoresInc {

    public static void main(String[] args) {
        int c;
        int d;

        // Post incremento/decremento primero usa el valor luego incrementa
        c = 5;
        System.out.println("El valor de la variable es: " + c);
        System.out.println("Realizamos un pos incremento: " + c++);
        System.out.println("El valor pos-incremento es: " + c);

        // si hacemos un pre incremento primero incrementa despues imprime el valor
        d = 7;
        System.out.println("El valor de la variable es: " + d);
        System.out.println("Como se pre incrementa entonces es: " + d);
    }

}
