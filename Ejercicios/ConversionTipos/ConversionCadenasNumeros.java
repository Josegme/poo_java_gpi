package Ejercicios.ConversionTipos;

import javax.swing.JOptionPane;

public class ConversionCadenasNumeros {

    public static void main(String[] args) {

        // números a cadenas de caracteres
        int i = 5;
        byte b = 10;
        short s = 60;
        double d = 35.5;
        float f = 6.63f;

        // concateno
        String sI = "" + i;
        // toString
        String sB = Byte.toString(b);
        // valueOf
        String sS = String.valueOf(d);
        String sD = Double.toHexString(d);
        // toString
        String sO = Short.toString(s);
        String sF = String.valueOf(f);

        // Podemos usar JOptionPane.showInputDialog para solicitar un ingreso de datos

        String valor = JOptionPane.showInputDialog("Ingrese un número: ");
        // este número ingresado es un String por lo tanto hay que pasar a integer o
        // double, o algun valor numérico
        int valorI = Integer.parseInt(valor);
        // una vez que pasamos a integer podemos operar con esta var
        int suma = valorI + 5;

        System.out.println("La suma de los enteros es: " + suma);

        // lo mismo si utilizo números decimales, utilizo double
        double valor2 = Double.parseDouble(valor);
        // ahora puedo operar con decimales
        double sumad = valor2 + 5.5;

        System.out.println("La suma de decimales es: " + sumad);

    }

}
