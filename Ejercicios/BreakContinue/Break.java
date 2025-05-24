package Ejercicios.BreakContinue;

public class Break {

    public static void main(String[] args) {
        int cuenta;

        for (cuenta = 1; cuenta <= 5; cuenta++) {
            if (cuenta == 5) {
                break;
            }
            System.out.println("La cueta es: " + cuenta);
        }
        System.out.println("Salio del ciclo en la cuenta: " + cuenta);
    }
}