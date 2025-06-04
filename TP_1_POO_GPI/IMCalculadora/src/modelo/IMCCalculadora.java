package modelo;

public class IMCCalculadora {
    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Peso y altura deben ser mayores a cero.");
        }
        return peso / (altura * altura);
    }

    public static String interpretarIMC(double imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else return "Obesidad";
    }
}
