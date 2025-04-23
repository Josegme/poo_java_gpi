package Ejercicios;

import java.nio.channels.Pipe.SourceChannel;

/*
 * Crear una clase Producto con 5 métodos (como aumentar stock, aplicar descuento, etc.).
 */
public class Producto {

    // Atributos de clase
    String nombre;
    double precio;
    int stock;

    // constructor de objetos
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    // método para aumentar el stock
    public void aumentarStock(int cantidad) {
        stock = cantidad + 1;
        System.out.println("La cantidad en stock es: " + cantidad + " unidades.");
    }

    // método para reducir el stock
    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock = cantidad - 1;
        } else {
            System.out.println("No hay suficiente stock para vender esa cantidad.");
        }
    }

    // Método para aplicar un descuento
    public void aplicarDescuento(double porcentaje) {
        if (precio >= 30000) {
            precio = precio - precio * (porcentaje / 100);
            System.out.println("El precio con descuento es: " + precio);
        } else {
            System.out.println("Esta venta no tiene descuento");
        }
    }

    // metodo para cambiar el Precio
    public void cambiarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    // para probar todo creamos el main y ejecutamos
    public static void main(String[] args) {
        Producto compu1 = new Producto("Laptops", 750303.5, 15);
        Producto compu2 = new Producto("PC-computer", 500550.3, 10);

        // mostramos la info de los productos
        compu1.mostrarInformacion();
        System.out.println("==============================");
        compu2.mostrarInformacion();
        System.out.println("==============================");

        // Aumentamos el stock
        System.out.println("Aumentamos stock: compu1 en 5 y compu2 en 3 unidades...");
        compu1.aumentarStock(5);
        compu2.aumentarStock(3);

        System.out.println("###############################");
        compu1.mostrarInformacion();
        System.out.println("==============================");
        compu2.mostrarInformacion();
        System.out.println("==============================");

        // Si vendemos tenemos que reducir el stock
        System.out.println("Vendiendo 3 unidades compu1 y 30 unidades compu2..");
        compu1.reducirStock(3);
        compu2.reducirStock(30);

        System.out.println("###############################");
        compu1.mostrarInformacion();
        System.out.println("==============================");
        compu2.mostrarInformacion();
        System.out.println("==============================");

        // aplicamos descuentos
        compu1.aplicarDescuento(10);
        System.out.println("###############################");
        compu1.mostrarInformacion();
        System.out.println("==============================");

        // cambiamos el precio de compu 2
        System.out.println("Cambiamos el precio a $1200050");
        compu2.cambiarPrecio(1200050);

        System.out.println("==============================");
        compu2.mostrarInformacion();

    }

}
