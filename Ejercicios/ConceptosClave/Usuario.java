package Ejercicios.ConceptosClave;

import java.util.Scanner;

public class Usuario {

    // atributos
    private String nombre;
    private String tipo;
    private int codigo;

    // métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static void main(String[] args) {

        // creamos un usuario (objeto) y el Scanner (para que el usuario ingrese datos
        // por teclado)
        Usuario objeto1 = new Usuario();
        Scanner teclado = new Scanner(System.in);

        // solicitar datos al usaurio

        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = teclado.nextLine();
        objeto1.setNombre(nombre);

        System.out.println("Ingrese el tipo: ");
        String tipo = teclado.nextLine();
        objeto1.setTipo(tipo);

        System.out.println("Ingrese el código: ");
        int codigo = teclado.nextInt();
        objeto1.setCodigo(codigo);

        // mostrar datos
        System.out.println("Los datos ingresados son:");
        System.out.println("Nombre: " + objeto1.getNombre());
        System.out.println("Tipo: " + objeto1.getTipo());
        System.out.println("Código: " + objeto1.getCodigo());

        teclado.close();

    }
}
