package PlantasVsZombies;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AdminV {

    private ArrayList<ObjetoGrafico> ListaFiguras;

    public AdminV() {

        ListaFiguras = new ArrayList<ObjetoGrafico>();
        ListaFiguras.add(new BalaPlata("Plata1"));
        ListaFiguras.add(new BalaPlata("Plata2"));
        ListaFiguras.add(new BalaPlata("Plata3"));
        ListaFiguras.add(new BalaVerde("Verde1"));
        ListaFiguras.add(new Zoombie("Jake"));
        ListaFiguras.add(new Zoombie("Hernan"));
        ListaFiguras.add(new Zoombie("Peter"));
        ListaFiguras.add(new BalaVerde("Verde2"));

        TimerTask tt = new TimerTask() {

            @Override
            public void run() {
                moverFiguras();
            }

        }; // Objeto para reproducir en un ciclo de tiempo
        Timer t = new Timer();
        t.schedule(tt, 0, 5000);
    }

    public void moverFiguras() {

        for (ObjetoGrafico og : ListaFiguras) { // for each
            og.mover();
        }
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        AdminV admin = new AdminV();
    }

}
