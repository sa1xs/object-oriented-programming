package object_oriented_programming.practice04.exercise01;

public class Gato extends Animal {

    private String raza;

    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public String hacerSonido() {
        return super.hacerSonido() + "miau";
    }
}
