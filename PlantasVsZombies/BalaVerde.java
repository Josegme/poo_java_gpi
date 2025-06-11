package PlantasVsZombies;

public class BalaVerde extends ObjetoGrafico {

    String nombre;

    public BalaVerde(String nom) {
        nombre = nom;
    }

    public void mover() {
        System.out.println("Movimiento bala Verde: Yo me llamo " + nombre);
    }

}
