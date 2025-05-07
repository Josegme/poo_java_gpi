package Ejercicios;
/*
* Vamos a definir una clase sin utilizar constructores ni métodos
 */

public class Auto {

    // Atributos que van a tener los autos (caracteriticas)
    String nombre;
    String marca;
    String modelo;
    String color;
    int anio;
    boolean usado;

    // Métodos que van a tener estos autos (¿Que puede hacer un auto?)
    public void arranca() {
        System.out.println("El " + nombre + " modelo " + modelo + " arranca.");
    }

    public void acelera() {
        System.out.println("El " + nombre + " modelo " + modelo + " acelera.");
    }

    public void frena() {
        System.out.println("El " + nombre + " modelo " + modelo + " frena.");
    }

    public void apagar() {
        System.out.println("El " + nombre + " modelo " + modelo + " se apaga.");
    }

    // Creamos los objetos (autos) de manera concreta a partir de la Clase
    // (instanciamos la clase)
    public static void main(String[] args) {

        // Primer Auto: Instanciamos el primer objeto (creamos el primer auto)
        Auto miAuto = new Auto();

        // Definimos como es el auto (Le damos valor a los atributos)
        miAuto.nombre = "Camioneta";
        miAuto.marca = "Toyota";
        miAuto.modelo = "Hilux";
        miAuto.anio = 2020;
        miAuto.color = "Rojo";
        miAuto.usado = true;

        // Métodos que representa lo que puede hacer el auto
        miAuto.arranca();
        miAuto.acelera();
        miAuto.frena();
        miAuto.apagar();

        // para saber si es usado o no agregamos un IF
        if (miAuto.usado)

        {
            System.out.println("El auto ya fue usado");
        } else {
            System.out.println("El auto es nuevo");
        }

    }

}
