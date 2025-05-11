package TP_1_POO_GPI.Sanatorio;

public class Main {
    public static void main(String[] args) {
        Pediatrico p1 = new Pediatrico("12345678", "Lucía", "OSDE", 25.5, "3764123456", "María López");
        Adulto a1 = new Adulto("23456789", "Carlos", "Swiss Medical", "120/80", 1.75, 80.0);
        Internado i1 = new Internado("34567890", "Ana", "IOMA", "101", "130/85", "O+");

        // ADMINISTRACIÓN
        p1.coberturaOS();
        a1.vademecum();
        i1.descuento();

        // NUTRICIÓN
        p1.tipoDieta();
        i1.tipoDieta();

        // CLÍNICA MÉDICA
        a1.recetaRx();
        i1.recetaSangre();
    }
}
