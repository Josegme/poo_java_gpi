import vista.IMCFrame;
import controlador.IMCControlador;

public class Main {
    public static void main(String[] args) {
        IMCControlador controlador = new IMCControlador();
        new IMCFrame(controlador);
    }
}
