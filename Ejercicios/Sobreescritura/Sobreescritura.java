package Ejercicios.Sobreescritura;

public class Sobreescritura {

    @Override
    public String toString() {
        return "Sobreescrito";
    }

    public static void main(String[] args) {
        Sobreescritura obj = new Sobreescritura();

        System.out.println(obj.toString());
    }

}
