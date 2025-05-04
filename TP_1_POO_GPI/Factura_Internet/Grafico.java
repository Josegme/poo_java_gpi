package TP_1_POO_GPI.Factura_Internet;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Grafico {

    public static void main(String[] args) {

        // Cargamos 5 clientes conocidos con DNI, nombre y apellido
        ArrayList<Cliente> baseClientes = new ArrayList<>();

        int[] dnis = { 11, 12, 13, 14, 15 };
        String[] nombres = { "Juan", "Lucía", "Carlos", "Sofía", "Mateo" };
        String[] apellidos = { "Pérez", "Gómez", "López", "Ramírez", "Fernández" };

        for (int i = 0; i < 5; i++) {
            Cliente c = new Cliente();
            c.setDni(dnis[i]);
            c.setNombre(nombres[i]);
            c.setApellido(apellidos[i]);
            baseClientes.add(c);
        }

        // Para cada cliente, pedimos su DNI y tipo de servicio
        for (int i = 1; i <= 5; i++) {
            int dniIngresado;
            Cliente clienteEncontrado = null;

            // Validar DNI
            do {
                String dniStr = JOptionPane.showInputDialog("[" + i + "/5] Ingrese el DNI (11-15):");
                dniIngresado = Integer.parseInt(dniStr);

                // Buscar cliente por DNI
                for (Cliente c : baseClientes) {
                    if (c.getDni() == dniIngresado) {
                        clienteEncontrado = c;
                        break;
                    }
                }

                if (clienteEncontrado == null) {
                    JOptionPane.showMessageDialog(null, "DNI no válido. Intente nuevamente.");
                }

            } while (clienteEncontrado == null);

            // Validar tipo de servicio
            int servicio;
            do {
                String servicioStr = JOptionPane.showInputDialog(
                        "Ingrese tipo de servicio:\n1 = 30MB ($750)\n2 = 50MB ($1100)\n3 = 100MB ($1500 con 5% de descuento)");
                servicio = Integer.parseInt(servicioStr);
            } while (servicio < 1 || servicio > 3);

            clienteEncontrado.setServicio(servicio);
        }

        // Mostrar resumen final
        String resumen = "RESUMEN DE FACTURAS\n\n";
        for (Cliente c : baseClientes) {
            if (c.getServicio() != 0) { // solo los que ingresaron servicio
                resumen += "DNI: " + c.getDni() + "\n";
                resumen += "Nombre: " + c.getNombreCompleto() + "\n";
                resumen += "Tipo de servicio: " + nombreServicio(c.getServicio()) + "\n";
                resumen += "Monto a pagar: $" + c.calcularMonto() + "\n\n";
            }
        }

        JOptionPane.showMessageDialog(null, resumen);
    }

    // Método auxiliar para mostrar nombre del servicio
    public static String nombreServicio(int tipo) {
        switch (tipo) {
            case 1:
                return "Internet 30 MB";
            case 2:
                return "Internet 50 MB";
            case 3:
                return "Internet 100 MB (con 5% de descuento)";
            default:
                return "Servicio desconocido";
        }
    }
}
