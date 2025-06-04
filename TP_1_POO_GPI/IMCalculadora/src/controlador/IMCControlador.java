package controlador;

import modelo.IMCCalculadora;

public class IMCControlador {

    public String calcularIMC(double peso, double altura) {
        double imc = IMCCalculadora.calcularIMC(peso, altura);
        String interpretacion = IMCCalculadora.interpretarIMC(imc);
        return String.format("%.2f - %s", imc, interpretacion);
    }
}
