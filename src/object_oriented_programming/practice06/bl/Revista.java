package object_oriented_programming.practice06.bl;

public class Revista extends Material {

    private final int numero;

    public Revista(String id, String titulo, int numero) {
        super(id, titulo);
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de la revista debe ser positivo.");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
