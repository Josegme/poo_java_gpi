package Ejercicios.Modificadores_Acceso.paquete1;

public class Clase1 {

    // atributos
    String nombre;
    public String marca;
    private String modelo;

    public static void main(String[] args) {
        Clase1 objetoDefault = new Clase1();
        Clase1 objetoPublico = new Clase1();
        Clase1 objetoPrivado = new Clase1();

        objetoDefault.nombre = "Objeto1";
        objetoPublico.marca = "Objeto publico";
        objetoPublico.modelo = "Objeto Privado";

        System.out.println("Puede ser accedido dentro de su paquete: " + objetoDefault);
        System.out.println("Puede ser accedido desde cualquier parte" + objetoPublico);
        System.out.println("Solo puede ser accedido dentro de su clase: " + objetoPrivado);

    }

}
