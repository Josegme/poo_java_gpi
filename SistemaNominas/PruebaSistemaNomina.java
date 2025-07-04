package SistemaNominas;

public class PruebaSistemaNomina {

    /*
     * esta va a crear cada uno de los objetos de tipo empleado
     */
    public static void main(String[] args) {

        // Argumentos: nombre, apellido, nss, salario
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "1-1", 800.000);

        // Argumentos: nombre, apellido, nss, sueldoporhora, horastrabajadas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Jose", "DelMillon", "1-2", 16.75, 40);

        // Argumentos: nombre, apellido, nss, ventasBrutas, tarifa
        EmpleadoPorComision empleadoComision = new EmpleadoPorComision("Pedro", "Picapiedra", "1-3", 10000, 0.6);

        // Argumentos: nombre, apellido, nss, ventasBrutas, tarifa, salarioBase
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Javier", "Vasquez", "1-4", 5000,
                0.04, 300);

        System.out.println("Empleado procesado por separado: ");

        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "Ingresos: ", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "Ingresos: ", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoComision, "Ingresos: ", empleadoComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "Ingresos: ",
                empleadoBaseMasComision.ingresos());

    }

}
