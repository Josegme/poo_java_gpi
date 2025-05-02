package Ejercicios.ConceptosClave;
/*
 * Un constructor es un método especial de una clase, 
 * que se invoca cuando creamos objetos.
 * cuando creamos un objeto entonces declaramos su visibilidad pública,
 * inicializamos los atributos e invocamos el mét constructor 
 */

public class Constructor {

    // el constructor debe tener el mismo nombre de clase y debe ser público
    public Constructor() {
        System.out.println("Este es un constructor");
    }

    // tambien podemos establecer un cosntructor con parametros que luego seran
    // parte del obejto
    public Constructor(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }

    public static void main(String[] args) {
        // Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(5, 2);

    }

}
