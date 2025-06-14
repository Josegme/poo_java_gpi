package SistemaNominas;

public class EmpleadoAsalariado extends Empleado {

    private double salario;

    // implementamos el propio constructor e invocamos al constructor de la
    // superclase
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss); // esos mismos argumetos son los que le voy a pasar al constructor
        establecerSalarioSemanal(salario);
    }

    // Como Ingresos() es un mét abstracto de la super clase si o si debo
    // implementar en la subclase
    @Override
    public double ingresos() {
        return obtenerSalarioSemanal();

    }

    public void establecerSalarioSemanal(double sal) {
        salario = sal;
    }

    public double obtenerSalarioSemanal() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("Empleado Asalarido: %s\n%s: %s", super.toString(), "Salario Semanal: ",
                obtenerSalarioSemanal());
    }

}
