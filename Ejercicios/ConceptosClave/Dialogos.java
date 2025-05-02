package Ejercicios.ConceptosClave;
/*
 * Podemos crear dialogos para informar o avisar algo que
 * el programa requiera, comunicando al usuario alguna situación
 * para ello debemos importar java.swing.JOptionPane
 */

import javax.swing.JOptionPane;

public class Dialogos {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Mensaje JAVA", "Esto es un mensaje",
        // JOptionPane.WARNING_MESSAGE);
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
    }
}