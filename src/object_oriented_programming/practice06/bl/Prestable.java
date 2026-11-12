package object_oriented_programming.practice06.bl;

public interface Prestable {

    void prestar() throws MaterialNoDisponibleException;

    void devolver();

    boolean estaPrestado();
}
