package TP_1_POO_GPI;

/*
 * tenemos dos vectores con n productos
 * uno con cantidades n
 * otro vector con cosots n
 * Determinar el precio total 
 * informar todos los que superen los $1000
 */
import java.util.Scanner;

public class ProductosCostos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // pedir la cantidad de productos
        System.out.println("Ingrese la cantidad de ptos: ");
        int n = teclado.nextInt();

        // definir los vectores -> [cantidades] y [costos]
        int[] cantidades = new int[n];
        double[] costos = new double[n];

        // cargar datos
        for (int i = 0; 1 < n; i++) {
            System.out.print("Producto " + (i + 1) + " - Cantidad: ");
            cantidades[i] = teclado.nextInt();

            System.out.print("Producto " + (i + 1) + " - Costo unitario: ");
            costos[i] = teclado.nextDouble();

        }
        // calcular total y mostrar productos > $ 1000
        double total = 0;
        System.out.println("Productos que superar los $1000: ");

        for (int i = 0; i < n; i++) {
            double totalProducto = cantidades[i] * costos[i];
            total += totalProducto;

            if (totalProducto > 1000) {
                System.out.println("Producto " + (i + 1) + ": $" + totalProducto);
            }
        }
        System.out.println("Precio total de todos los productos: $" + total);

    }

}
