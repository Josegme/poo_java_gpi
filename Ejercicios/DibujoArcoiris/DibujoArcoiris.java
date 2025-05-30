package Ejercicios.DibujoArcoiris;

import javax.swing.JPanel; //importamos para el panel
import java.awt.Color;
import java.awt.Graphics;

public class DibujoArcoiris extends JPanel {

    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colores = { Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW,
            Color.ORANGE, Color.RED };

    // Constructor de clase: con extends JPanel trajimos los métodos propios
    public DibujoArcoiris() {
        setBackground(Color.WHITE);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radio = 20;

        int centroX = getWidth() / 2; // estos métodos tambien viene con JPanel
        int centroY = getWidth() - 10;

        for (int contador = colores.length; contador > 0; contador--) {
            g.setColor(colores[contador - 1]);

            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;

            g.fillArc(valorX, valorX, ancho, alto, 0, 180);
        }
    }
}
