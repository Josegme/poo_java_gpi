package Ejercicios.Calculadora;
/* Recordar: Se deben serparar las clases según o dependiendo del tipode función que van a cumplir
 * en este caso una para Operaciones (para los métodos) y la otra es la clase de Gráficos 
 * para operar la calculadora. En la clase Operaciones no va a tener un método main por lo tanto no
 * se va a poder ejecutar, pero en la clase de Gráfico vamos a instanciar la clase Operaciones para ejecutar
 * los métodos que contenga.
 */

public class Operaciones {

    // método sumar
    public double sumar(double x, double y) {
        double suma = x + y;
        return suma;
    }

    // método restar
    public double restar(double x, double y) {
        double resta = x - y;
        return resta;
    }

    // método multiplicar
    public double multiplicar(double x, double y) {
        double multiplicacion = x * y;
        return multiplicacion;
    }

    // método dividir
    public double dividir(double x, double y) {
        double division = x / y;
        return division;
    }

}
/*
 * solo para recordar esta clases no tiene método main por lo tanto no se puede
 * ejecutar pero se puede instanciar.
 */