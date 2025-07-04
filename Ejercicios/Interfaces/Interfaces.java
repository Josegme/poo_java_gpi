
package Interfaces;

public interface Interface1 {

    public void suma();

    public void resta();
}

public interface Interface2 {

    public void resta();

    public void multiplicacion();

}

// podemos hacer que una interface herede de otra interface
public interface Interface3 extends Interface1 {

    public void resta();

    public void dividir();

}
// no podemos hacer que una interface herede de una clase concreta.

public class MiClases implements Interface1, Interface2 {
    // estoy obligado a implemntar todos los metodos de las interfaces

}