package Ejercicios.ConversiónObjetos;

public class Perro extends Mamifero {

    public Perro() {
        System.out.println("Constructor de Perro");
    }

    public static void main(String[] args) {

        Perro p1 = new Perro();
        Animal a = p1;

        if (a instanceof Perro) {
            System.out.println("Puedes hacer la conversión");
            Perro p2 = (Perro) a;
        }
    }

}
