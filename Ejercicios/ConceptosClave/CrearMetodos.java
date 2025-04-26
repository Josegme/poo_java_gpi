/*
 * Para crear métodos vamos a crear una clase y definir los Atributos 
 * para mostrar como crear los métodos vamos a utilizar Operaciones con números enteros
 * 
 */

package Ejercicios.ConceptosClave;

import java.util.Scanner;

public class CrearMetodos {

    // vamos a tener dos números enteros y cuatro operaciones
    int numero1;
    int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;

    /* Creamos los métodos dentro del bloque */
    // Este método va a leer los números
    public void leerNumeros() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero2 = teclado.nextInt();
    }

    // método para sumar
    public void sumar() {
        sumar = numero1 + numero2;
    }

    // método para restar
    public void restar() {
        restar = numero1 - numero2;
    }

    // método para multiplicar
    public void multiplicar() {
        multiplicar = numero1 * numero2;
    }

    // método para dividir
    public void dividir() {
        dividir = numero1 / numero2;
    }

    // método para imprimir resultados
    public void imprimirResultados() {
        System.out.println("El resultado de la suma es " + sumar);
        System.out.println("El resultado de la resta es " + restar);
        System.out.println("El resultado de la multiplicacion es " + multiplicar);
        System.out.println("El resultado de la division es " + dividir);

    }

    // en el metodo main creamos un Objeto de operaciones y aplicamos los métodos
    public static void main(String[] args) {
        CrearMetodos operacion = new CrearMetodos();

        // estas operaciones van a tener los métodos de clase
        operacion.leerNumeros();
        operacion.sumar();
        operacion.restar();
        operacion.multiplicar();
        operacion.dividir();
        operacion.imprimirResultados();

    }
}
