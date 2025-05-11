package TP_1_POO_GPI.Sanatorio;

// CLASE ABSTRACTA
abstract class Paciente implements Administracion {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public void coberturaOS() {
        System.out.println(nombre + " tiene cobertura de la OS: " + obraSocial);
    }

    @Override
    public void descuento() {
        System.out.println(nombre + " tiene un 20% de descuento en consultas.");
    }

    @Override
    public void vademecum() {
        System.out.println("Vademécum disponible para " + nombre);
    }
}

// PEDIÁTRICO
class Pediatrico extends Paciente implements Nutricion {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public void tipoDieta() {
        System.out.println(nombre + " tiene dieta infantil rica en calcio.");
    }
}

// ADULTO
class Adulto extends Paciente implements ClinicaMedica {
    private String presionArterial;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, String presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void recetaRx() {
        System.out.println(nombre + " debe realizarse una radiografía.");
    }

    @Override
    public void recetaSangre() {
        System.out.println(nombre + " debe realizarse un análisis de sangre.");
    }
}

// INTERNADO
class Internado extends Paciente implements Nutricion, ClinicaMedica {
    private String habitacion;
    private String presionArterial;
    private String rh;

    public Internado(String dni, String nombre, String obraSocial, String habitacion, String presionArterial,
            String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.rh = rh;
    }

    @Override
    public void tipoDieta() {
        System.out.println(nombre + " tiene dieta blanda supervisada.");
    }

    @Override
    public void recetaRx() {
        System.out.println(nombre + " necesita una Rx abdominal.");
    }

    @Override
    public void recetaSangre() {
        System.out.println(nombre + " necesita análisis de sangre.");
    }
}
