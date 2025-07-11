package ManejoExcepciones;
/*Leer un arvhivo es una potencial causa de excepcion no verificada
 por que no puedo determinar si el archivo va a estar donde debe estar
 puede disparar una FileNotFoundException*/

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsClass {

    public void readFiles()
            throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);

    }

    public static void main(String[] args) {

    } // cada vez que llame a un metodo que pueda
      // tener una excpecion debemos relanzar la excepcion4
      // hasta que trate la excepcion con un Try - Catch
}
