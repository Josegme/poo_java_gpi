package Ejercicios.ConversionTipos;

public class ConversionPrimitivos {

    public static void main(String[] args) {

        int a = 1; // un entero utiliza 4 mb

        double b = 2.5; // un double utiliza 8 mb

        // hacemos una conversión estrecha
        a = (int) b;

        // ¿se pierde información al castear?
        System.out.println("El valor de a es: " + a);

        // devuelve que a es 2 por lo tanto perdimos información al castear
        // no siempre vamos a poder castear datos primitivos
        int codigo = 97;

        char codigoASCCI = (char) codigo;

        System.out.println("El char es: " + codigoASCCI);

    }

}
