package Ejercicios.Encapsulamiento;

import javax.swing.JOptionPane;

public class Grafico {

    public static void main(String[] args) {

        // Solicita al usuario que escriba los datos
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
        String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad: ");
        String altura = JOptionPane.showInputDialog("Escribe tu altura: ");
        String edad = JOptionPane.showInputDialog("Escribe tu edad: ");

        // como los datos que ingresan son String -> parsear los datos tipo double e int
        double alt = Double.parseDouble(altura);
        int ed = Integer.parseInt(edad);

        // vamos Instanciar la clase Persona y llamar a sus métodos
        Persona personaje = new Persona();

        personaje.setNombre(nombre);
        personaje.setNacionalidad(nacionalidad);
        personaje.setAltura(alt);
        personaje.setEdad(ed);

        JOptionPane.showMessageDialog(null, "Nombre: " + personaje.getNombre());
        JOptionPane.showMessageDialog(null, "Nacionalidad: " + personaje.getNacionalidad());
        JOptionPane.showMessageDialog(null, "Altura: " + personaje.getAltura());
        JOptionPane.showMessageDialog(null, "Edad: " + personaje.getEdad());

    }
}
