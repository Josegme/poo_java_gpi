package SistemaNominas;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa,
            double salario) {

        super(nombre, apellido, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    private void establecerSalarioBase(double salario) {
        if (salario < 0.0) {
            salarioBase = 0.0;
        } else {
            salarioBase = salario;
        }
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // metodo ingresos() es un poco diferente a los otros puesto que hereda de la
    // subclase EmpleadoPorComision
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

}
