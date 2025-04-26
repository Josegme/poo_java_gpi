/*
 * teniendo en cuenta que cuando creamos un método colocamos:
 * void cuando no va dar un retorno
 * y vamos a colocar el tipo cuando queremos obtener un retorno 
 */

package Ejercicios.ConceptosClave;

import java.util.Scanner;

public class Operaciones {

    // aqui eliminamos las variables

    // creamos los metodos estableciendo que tipo de retorno queremos obtener y lo
    // guardamos
    public int sumar(int num1, int num2) {

        // sumar ahora es variable local del método y va a regresar el resultado de
        // sumar
        int sumar = num1 + num2;
        return sumar;
    }

    // cremos los métodos con sus variables locales respectivas
    public int restar(int num1, int num2) {
        int restar = num1 - num2;
        return restar;
    }

    public int multiplicar(int num1, int num2) {
        int multiplicar = num1 * num2;
        return multiplicar;
    }

    public int dividir(int num1, int num2) {
        int dividir = num1 / num2;
        return dividir;
    }

    public void imprimir(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La suma multi: " + multiplicacion);
        System.out.println("La suma divi: " + division);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // solicitamos que ingres dentro del main los argumentos, que tomaran el lugar
        // de los parametros
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero");
        int numero2 = sc.nextInt();

        // Creamos nuestro objeto operaciones
        Operaciones operaciones = new Operaciones();

        // pero vamos a crear variables que guarden lo que RETORNEN
        // cada uno de los MËTODOS.
        int suma = operaciones.sumar(numero1, numero2);
        int resta = operaciones.restar(numero1, numero2);
        int multiplicacion = operaciones.multiplicar(numero1, numero2);
        int division = operaciones.dividir(numero1, numero2);

        operaciones.imprimir(suma, resta, multiplicacion, division);

    }

}
