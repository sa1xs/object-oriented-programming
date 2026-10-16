package object_oriented_programming.practice04.exercise01;

public class Main {
    
    public static void main(String[] args) {

        Gato gato = new Gato("Rofles", "Persa");
        System.out.println("El nombre del gato es: " + gato.getNombre() + ", su raza es: " + gato.getRaza() + " y " + gato.hacerSonido());
    }
}
