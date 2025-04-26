/*
 * Un parámetro es una declaración de variable, sirve para darle valor de entrada a un método
 * dentro de la declaración (definimos el tipo de parametro) 
 * y luego lo vamos a invocar en los métodos (mediante sus argumentos)
 * Recordar: Varible dentro de los métodos son VARIABLES LOCALES
 * y las variables fuera de los métodos son VARIABLES GLOBALES
 */

package Ejercicios.ConceptosClave;

import java.util.Scanner;

public class ParametrosArgumentos {

    // vamos a tener dos números enteros y cuatro operaciones
    int numero1;
    int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;

    // Vamos a crear los métodos pero como vamos a ingresar por parametro
    // cada método va a contener los parametros que como estan "afuera" son globales
    // y cuando las colocamos
    // dentro de los métodos pasan a ser Locales
    public void sumar(int numero1, int numero2) {
        sumar = numero1 + numero2;
    }

    // método para restar
    public void restar(int numero1, int numero2) {
        restar = numero1 - numero2;
    }

    // método para multiplicar
    public void multiplicar(int numero1, int numero2) {
        multiplicar = numero1 * numero2;
    }

    // método para dividir
    public void dividir(int numero1, int numero2) {
        dividir = numero1 / numero2;
    }

    // método para imprimir resultados
    public void imprimirResultados() {
        System.out.println("El resultado de la suma es " + sumar);
        System.out.println("El resultado de la resta es " + restar);
        System.out.println("El resultado de la multiplicacion es " + multiplicar);
        System.out.println("El resultado de la division es " + dividir);

    }

    // creamos el objeto que va a recibir los parametros dentro de los métodos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // solicitamos que ingres dentro del main los argumentos, que tomaran el lugar
        // de los parametros
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero");
        int numero2 = sc.nextInt();

        // Creamos nuestro objeto operaciones
        ParametrosArgumentos operaciones = new ParametrosArgumentos();

        // vamos a llamar a los métodos, estos van a solicitar los argumentos que van a
        // recibir por telcado
        operaciones.sumar(numero1, numero2);
        operaciones.restar(numero1, numero2);
        operaciones.multiplicar(numero1, numero2);
        operaciones.dividir(numero1, numero2);
        operaciones.imprimirResultados();

        ;

    }
}
