package Ejercicios.BreakContinue;

public class Continue {

    public static void main(String[] args) {
        int cuenta;

        for (cuenta = 1; cuenta <= 10; cuenta++) {

            if (cuenta == 5) {
                continue;
            }
            if (cuenta == 6) {
                continue;
            }
            System.out.println("La cuenta es: " + cuenta);
        }
        System.out.println("Saltea las cuentas que tiene continue.");
    }
}
