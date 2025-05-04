package TP_1_POO_GPI.Factura_Internet;

public class Cliente {

    // Creamos Atributos privados: Cliente
    private int dni;
    private String nombre;
    private String apellido;
    private int servicio;

    // Creamos los métodos (getters y setters)
    // metododos para obtener y modificar dni si es necesario
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // métodos para obtener y modificar nombre si es necesario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCliente) {
        this.nombre = nombreCliente;
    }

    // métodos para obtener y modificar apellido si es necesario
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoCliente) {
        this.apellido = apellidoCliente;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    // metodos para determinar el tipo del serivicio del cliente o modificarlo
    public int getServicio() {
        return servicio;
    }

    public void setServicio(int tipoServicio) {
        servicio = tipoServicio;
    }

    // método para calcular el monto a pagar según el servicio
    public double calcularMonto() {
        switch (servicio) {
            case 1:
                return 750;
            case 2:
                return 1100;
            case 3:
                return 1500 * 0.95; // por el 5% de descuento
            default:
                return 0;
        }
    }

}
