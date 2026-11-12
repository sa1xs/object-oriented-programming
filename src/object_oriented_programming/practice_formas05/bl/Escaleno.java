package object_oriented_programming.practice_formas05.bl;

public class Escaleno extends Triangulo {
    public Escaleno(double a, double b, double c) {
        super(a, b, c);
        validarTipo(a, b, c);
    }

    private static void validarTipo(double a, double b, double c) {
        if (a == b || a == c || b == c) {
            throw new IllegalArgumentException("Un escaleno debe tener tres lados distintos.");
        }
    }

    public void setLados(double a, double b, double c) {
        validarTipo(a, b, c);
        actualizarLados(a, b, c);
    }

    public void setLadoA(double a) {
        setLados(a, getLadoB(), getLadoC());
    }

    public void setLadoB(double b) {
        setLados(getLadoA(), b, getLadoC());
    }

    public void setLadoC(double c) {
        setLados(getLadoA(), getLadoB(), c);
    }
}
