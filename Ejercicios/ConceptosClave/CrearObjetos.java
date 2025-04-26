/*
 * Vamos a ver como se crean objetos paso a paso a partir de una clase.
 * Recordar que la sintaxis es:
 *      public class NombreClase {
 *                  atributos
 *                  métodos
 *      //para crear los objetos deben estar debemos estar dentro del bloque
 *      //y crear un main que ejecute ese bloque    
 *      public static void main(String [] args) {
 *             NombreClase nombreObjeto = new NombreClase();
 *      } 
 * }
 * 
 */

package Ejercicios.ConceptosClave;

public class CrearObjetos {
    String nombre;
    String color;

    public static void main(String[] args) {
        CrearObjetos objeto1 = new CrearObjetos();
        CrearObjetos objeto2 = new CrearObjetos();

        // para acceder a los atributos de clase que difine un objeto
        objeto1.nombre = "Objeto 1";
        objeto2.nombre = "Objeto 2";
        objeto1.color = "Rojo";
        objeto2.color = "Azul";

        System.out.println("El nombre del objeto 1 es: " + objeto1.nombre);
        System.out.println("El color del objeto 1 es: " + objeto1.color);
        System.out.println("El nombre dle objeto 2 es: " + objeto2.nombre);
        System.out.println("El color del objeto 2 es: " + objeto2.color);
    }

}
