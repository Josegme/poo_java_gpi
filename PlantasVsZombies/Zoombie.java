package PlantasVsZombies;

public class Zoombie extends ObjetoGrafico {

    String nombre;

    public Zoombie(String nom) {
        nombre = nom;
    }

    public void mover() {
        System.out.println("Movimiento de Zoombie: Mi nombre es " + nombre);
    }

}
