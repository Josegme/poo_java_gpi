package ManejoExcepciones;

import java.io.FileReader;
import java.io.File;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class MasDeUnaExcepcion {

    public void readFiles()
            throws FileNotFoundException, EOFException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }

    public void readFiles2()
            throws EOFException {
        readFiles();
    }

    public static void main(String[] args) {

    }

}
