package Ejercicios.Calculadora;

import javax.swing.JOptionPane;

/*
 * En esta clase es donde vamos a realizar las operaciones: 
 * Debe solicitar que cargue los numeros con JOptionPane.ShowInputDialog
 * como recibe String hay que transaformar esa variable con Double.parseDouble(var)
 * Vamos a Instanciar la clase Operaciones para luego ejecutar los métodos 
 * y vamos a mostrar los resultados con JOptionPane.ShowMassageDialog
 */

public class Graficos {

    public static void main(String[] args) {

        // solicita que se ingrese los datos
        String n1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        String n2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");

        // como recibio String, pasamos a Double para operar
        Double num1 = Double.parseDouble(n1);
        Double num2 = Double.parseDouble(n2);

        // instanciamos la clase Operaciones para poder ejecutar
        Operaciones op = new Operaciones();

        // Realizamos las operaciones
        double suma = op.sumar(num1, num2);
        double resta = op.restar(num1, num2);
        double multiplicacion = op.multiplicar(num1, num2);
        double division = op.dividir(num1, num2);

        // ahora muestro los resultados
        JOptionPane.showMessageDialog(null, "La suma es " + suma);
        JOptionPane.showMessageDialog(null, "La resta es " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicación es " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La división es  " + division);

    }
}
