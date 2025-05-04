package Ejercicios.Encapsulamiento;

import javax.swing.JOptionPane;

public class Persona {

    // creamos los Atributos privados
    private String nombre;
    private String nacionalidad;
    private double altura;
    private int edad;

    // creamos los Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        nombre = nomb;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nac) {
        nacionalidad = nac;
    }

    // evaluo si es una altura válida
    public double getAltura() {
        return altura;

    }

    public void setAltura(double alt) {
        if (alt > 3) {
            JOptionPane.showMessageDialog(null, "Altura invalidad.");
        } else {
            altura = alt;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        if (ed < 0 || ed > 100) {
            JOptionPane.showMessageDialog(null, "Edad invalida.");
        } else {
            edad = ed;
        }
    }

}
