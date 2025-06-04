package vista;

import javax.swing.*;
import java.awt.*;
import controlador.IMCControlador;

public class IMCFrame extends JFrame {
    private JTextField campoPeso;
    private JTextField campoAltura;
    private JLabel resultadoLabel;
    private IMCControlador controlador;

    public IMCFrame(IMCControlador controlador) {
        this.controlador = controlador;

        setTitle("Calculadora de IMC");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Peso (kg):"));
        campoPeso = new JTextField();
        add(campoPeso);

        add(new JLabel("Altura (m):"));
        campoAltura = new JTextField();
        add(campoAltura);

        JButton botonCalcular = new JButton("Calcular IMC");
        botonCalcular.addActionListener(e -> calcularIMC());
        add(botonCalcular);

        resultadoLabel = new JLabel("Resultado: ");
        add(resultadoLabel);

        setLocationRelativeTo(null); // Centrar ventana
        setVisible(true);
    }

    private void calcularIMC() {
        try {
            double peso = Double.parseDouble(campoPeso.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            String resultado = controlador.calcularIMC(peso, altura);
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
