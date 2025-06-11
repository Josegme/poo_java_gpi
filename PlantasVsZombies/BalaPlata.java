package PlantasVsZombies;

public class BalaPlata extends ObjetoGrafico {

    String nombre;

    public BalaPlata(String nom) {
        nombre = nom;
    }

    @Override
    public void mover() {
        System.out.println("Movimiento de Bala Plata: Yo me llamo " + nombre);

    }

}
