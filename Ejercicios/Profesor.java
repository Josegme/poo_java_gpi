package Ejercicios;

/*
 * 2. Crear una clase Profesor con constructor, y mostrar sus datos.
 */
public class Profesor {

    // Atributos de clase
    public String nombre;
    public String apellido;
    public String curso;
    public String materia;
    public int anio;

    // creamos el constructor
    public Profesor(String nombre, String apellido, String curso, String materia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.materia = materia;
        this.anio = anio;
    }

    // método para mostrar
    public void mostrarInfo() {
        System.out.println("Nombre del Profesor: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Materia: " + materia);
        System.out.println("Año: " + anio);
    }

    // Main para instanciar la clase
    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Carlos", "Palombo", "Primero B", "Programación", 2025);
        Profesor profe2 = new Profesor("Juan", "Perez", "Segundo A", "Matemática", 2025);

        profe1.mostrarInfo();
        System.out.println("====================================");
        profe2.mostrarInfo();
    }

}
