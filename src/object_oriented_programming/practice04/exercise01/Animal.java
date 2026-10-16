package object_oriented_programming.practice04.exercise01;

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }   
    
    public String getNombre() {
        return nombre;
    }

    public String hacerSonido() {
        return("El animal hace: ");
    }
}
