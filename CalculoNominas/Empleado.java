package CalculoNominas;
/*Superclase Abstracta la cual va a actuar como Interfaz y 
 * contener los Atributos generales de los Empleados. Ademas de 
 * El constructor de dichos atributos. Ademas los Getters y Setter 
 * para acceder a las variables de instancia privada y 
 * un método abstracto Ingresos() que vamos a sobreescribir en cada uno 
 * de los Empleados (subclases que heredan de Empleado) ya que cada uno 
 * va a recibir el Ingresos dependendiendo del tipo de empleado y tipo de ingreso.
*/

public abstract class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    // Constructor con tres Argumentos
    public Empleado(String nombre, String apellido, String nss) {

        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }

    // Getter/Setters por cada tipo de va de instancia
    // -> Establecemos el primer nombre
    public void setPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    // Devuelve el primer nombre
    public String getPrimerNombre() {
        return primerNombre;
    }

    // Establecemos el apellido
    public void setApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    }

    // devuelve el apellido
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    // Establecemos el Num de Seg Soc
    public void setNumeroSeguroSocial(String nss) {
        numeroSeguroSocial = nss;
    }

    // Devuelve el num de seg soc
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // Devuelve representación String de un objeto Empledo
    @Override
    public String toString() {
        return String.format("\nNumero de Seguro Social: ", getPrimerNombre(), getApellidoPaterno(),
                getNumeroSeguroSocial());

    }

    // Método abstracto que debe ser sobrescrito por las subclases
    public abstract double ingresos();

    // fin de la clase abstracta empleado.
}
