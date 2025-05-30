package Ejercicios.DibujoArcoiris;

import javax.swing.JFrame;

public class PruebaDibujarArc extends JFrame {

    public static void main(String[] args) {
        DibujoArcoiris panel = new DibujoArcoiris();
        JFrame aplicacion = new JFrame(); // es el panel o cuadro
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel); // es nuestra pizarra
        aplicacion.setSize(400, 250); // tamaño
        aplicacion.setVisible(true); // que sea visible
    }

}
