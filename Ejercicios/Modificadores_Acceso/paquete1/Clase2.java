package Ejercicios.Modificadores_Acceso.paquete1;

public class Clase2 {

    private int tipo;
    private int edad;
    private double altura;

    // setter:para poder accesar y modificar el tipo
    public void setTipo(int t) {
        tipo = t;
    }

    // getter: para poder accesar y obtener ese tipo
    public int getTipo() {
        return tipo;
    }

    // setter: para poder modificar la edad cuando la invoco
    public void setEdad(int e) {
        edad = e;
    }

    // getter: para obtener la edad
    public int getEdad() {
        return edad;
    }

    // setter: para accesar y modificar la altura
    public void setAltura(double alt) {
        altura = alt;
    }

    // getter: para obtener la altura
    public double getAltura() {
        return altura;
    }

}

class AccesoDirecto {
    public static void main(String[] args) {
        Clase2 mc = new Clase2();

        // Setters: voy a modificar los atributos
        mc.setTipo(5);
        mc.setEdad(25);
        mc.setAltura(1.70);

        // Getters: voy a obtener
        System.out.println("El tipo es" + mc.getTipo());
        System.out.println("La edad es" + mc.getEdad());
        System.out.println("La altura es: " + mc.getAltura());

    }
}
