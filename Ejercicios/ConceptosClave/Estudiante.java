package Ejercicios;
/*
 * Vamos a hacer clases con métodos específicos. 
 * métodos propios (acciones) que puede realizar un objeto.
 */

public class Estudiante {

    // Atributos de los estudiantes
    String nombre;
    int edad;
    String curso;
    int asistencia;
    double promedio;

    // Costructor del objeto estudiante
    public Estudiante(String nombre, int edad, String curso, int asistencia, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.asistencia = asistencia;
        this.promedio = promedio;
    }

    // Creamos los métodos (¿Que puede hacer un estudiante')
    public void estudia() {
        System.out.println(nombre + " esta estudiando.");
    }

    // puede asistir a clases
    public void asistirClase() {
        asistencia++;
    }

    // puede actualizar su promedio
    public void actualizarPromedio(double nuevaNota) {
        double promedioAnterior = promedio;
        promedio = (promedio + nuevaNota) / 2;

        if (promedio != promedioAnterior) {
            System.out.println("El promedio fue actualizado.");
            System.out.println("Promedio anterior: " + promedioAnterior);
            System.out.println("Nuevo promedio: " + promedio);
        } else {
            System.out.println("El promedio se mantuvo igual");
        }
    }

    // puede mostrar sus datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Asistencia: " + asistencia);
        System.out.println("Promedio: " + promedio);
    }

    // puede reinicar las asistencias
    public void reiniciarAsistencia() {
        asistencia = 0;
    }

    public static void main(String[] args) {

        // Instanciamos un estudiante (creamos un objeto estudiante)
        Estudiante estud1 = new Estudiante("Carlos Ruiz",
                19, "matemáticas", 100, 8.5);

        // llamamos a los métodos
        estud1.estudia();
        estud1.asistirClase();
        estud1.asistirClase();
        estud1.mostrarDatos();
        estud1.actualizarPromedio(9.5);
        estud1.reiniciarAsistencia();
        estud1.mostrarDatos();

    }
}