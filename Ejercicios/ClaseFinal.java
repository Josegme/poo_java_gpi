/**
 *
 * @author Josegme
 *         ¿que significa que declaremos final a una clase o a un método?
 *         No va a poder modificar su contenido una vez inicializada y va
 *         representar valores constantes.
 *         una variable declarada final no puede ser modificada mas adelante.
 *         Tambien es posible declarar métodos y sus parámetros como final
 *         (private y static son Final implicitamente)
 *         Una clase final no puede ser una superclase y todos sus métodos son
 *         final impliciatamente.
 *         POR ESO NOS SALTA EL ERROR SI QUEREMOS HEREDAR UNA CLASE FINAL
 */
final public class ClaseFinal extends String {

    public static void main(String[] args) {
        final int numero = 10;

    }

}
