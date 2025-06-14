package SistemaNominas;

public class EmpleadoPorHoras extends Empleado {

    // debemos crear dos variables de instacia para sueldo y horas trabajadas
    private double sueldo; // sueldo por hora
    private double horas; // horas trabajadas

    public EmpleadoPorHoras(String nombre, String apellido, String nss, double salarioPorHoras,
            double horasTrabajadas) {
        super(nombre, apellido, nss);

        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }

    // crear los metodos para establecer y obtener suelo - horas
    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double sue) {
        if (sue < 0.0) {
            sueldo = 0.0;
        } else {
            sueldo = sue;
        }
    }

    public double obtenerHoras() {
        return horas;
    }

    public void establecerHoras(double hs) {
        if (hs >= 0 && hs <= 168) {
            horas = hs;
        } else {
            horas = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: %s", super.toString(), "Sueldo por horas: ",
                obtenerSueldo(), "Horas trabajadas: ", obtenerHoras());
    }

    @Override
    public double ingresos() {
        if (obtenerHoras() <= 40) {
            return obtenerSueldo() * obtenerHoras();
        } else {
            return 40 * obtenerHoras() + (obtenerHoras() * 40) * obtenerSueldo() * 1.5;
        }
    }

}
