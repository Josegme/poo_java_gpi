package Ejercicios;
/*
 * Vamos a trabajar con encapsulamiento, accediendo a los atributos mediante los 
 * Getters (obtener datos) y Setters (modificar datos)
 * Antes debemos saber que los Atributos, Métodos o clase pueden contener modificadores
 * de acceso. Estos pueden ser públicos (cualquiera puede acceder a ellos) o
 * privados (restringido para algunos usuarios)
 *      public: Significa que cualquiera puede acceder a ese atributo o método desde cualquier
 *      parte del programa. "Esta la puerta abierta" para que todos puedan entrar, ver o modificar.
 *      private: Significa que solo se puede acceder desde adentro de la misma clase.
 *      Es como tener todo "adentro de una caja fuerte", nadie puede acceder o tocar las cosas
 *      a menos que tenga la llave.
 */

public class CuentaBancaria {

    // Atributos de la clase CuentaBancaria (¿cuales son las caracteristicas de una
    // cuenta?)
    private String titular;
    private double saldo;
    private String tipoCuenta;
    private boolean activa;
    private int numeroCuenta;

    // Constructor de cuentas
    public CuentaBancaria(String titular, double saldo, String tipoCuenta, boolean activa, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.activa = activa;
        this.numeroCuenta = numeroCuenta;
    }

    // Creamos los métodos de nuestra clase (¿Que podemos hacer con nuestra
    // cuenta/clase?)
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Su saldo ahora es " + saldo);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Su nuevo saldo es " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Estado: " + (activa ? "Activa" : "Inactiva"));
        System.out.println("----------------------------------------");
    }

    public void transferir(double monto, CuentaBancaria cuentaDestino) {
        System.out.println(
                "\nIntentando transferir $" + monto + " de " + this.titular + " a " + cuentaDestino.titular + "...");
        if (monto <= saldo) {
            this.retirar(monto);
            cuentaDestino.depositar(monto);
            System.out.println("✅ Transferencia realizada con éxito.");
        } else {
            System.out.println("❌ Transferencia fallida. Saldo insuficiente.");
        }
        System.out.println("----------------------------------------");
    }

    // Getters (métodos para obtener y poder ver los datos)
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public boolean getActivo() {
        return activa;
    }

    // Setters (métodos para modificar los datos si es necesario o actualizar)
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    // para poder crear cuentas, y ejecutar sus métodos
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Lucia Gimenez", 50000, "Caja de Ahorro", true, 12345);
        CuentaBancaria cuenta2 = new CuentaBancaria("José Escobar", 200000, "Cuenta Corriente", true, 7591);
        CuentaBancaria cuenta3 = new CuentaBancaria(null, 0, null, false, 0);

        cuenta1.depositar(2000);
        cuenta1.retirar(1500);

        System.out.println("\n📄 Información de las cuentas:");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();

        System.out.println("\n💸 Vamos a probar una transferencia:");
        cuenta1.transferir(5000, cuenta2);

        System.out.println("\n📄 Estado final de las cuentas:");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }

}