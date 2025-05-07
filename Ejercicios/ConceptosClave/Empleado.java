package Ejercicios;
/*
 * Vamos a crear la clase con Atributos + un Constructor
 * El constructor lo que hace es crear objetos de manera mas rápida y ordenada
 * evita escribir código repetivo, es decir, creamos la clase con atributos y 
 * le agreamos un Constructor
 */

public class Empleado {

    // definimos los Atributos de Clase
    String nombre;
    int id;
    String puesto;
    double sueldo;
    boolean activo;

    // Creamos un constructor de Objetos/Instancias de esa clase
    public Empleado(String nombre, int id, String puesto, double sueldo, boolean activo) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.activo = activo;
    }

    // creamos un método que muestre los datos y luego vemos como se utiliza con
    // alguno de los objetos
    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Puesto: " + puesto);
        System.out.println("Suedlo: " + sueldo);
        System.out.println("Activo: " + activo);
    } // Cuando llamemos a este método va a mostrar los datos y no va a hacer falta
      // escribir uno por uno

    public void mostrarEstado() {
        if (activo) {
            System.out.println(nombre + " está activo");
        } else {
            System.out.println(nombre + " no esta activo.");
        }
    }

    // ahora creamos el main - para poder crear objetos y ejecutar los métodos si
    // tuviera

    public static void main(String[] args) {

        // instanciamos la clase - creamos un objeto empleado ->
        Empleado emp1 = new Empleado("Ana Perez", 101, "Diseñadora", 95000.5, true);

        // para ver esas caracteristicas
        System.out.println("Empleado: " + emp1.nombre);
        System.out.println("ID: " + emp1.id);
        System.out.println("Puesto: " + emp1.puesto);
        System.out.println("Sueldo: " + emp1.sueldo);
        System.out.println("Activo: " + emp1.activo);

        if (emp1.activo) {
            System.out.println(emp1.nombre + " está activo.");
        } else {
            System.out.println(emp1.nombre + " no esta activo.");
        }

        System.out.println();

        Empleado emp2 = new Empleado("Juan Mencia", 110, "Programador", 120000.6, true);
        emp2.mostrarDatos();
        emp2.mostrarEstado();

    }

}
