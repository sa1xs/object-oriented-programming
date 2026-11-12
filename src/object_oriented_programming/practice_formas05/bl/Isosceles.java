package object_oriented_programming.practice_formas05.bl;

public class Isosceles extends Triangulo {
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);
        validarTipo(ladoIgual, base);
    }
    private static void validarTipo(double lado, double base) {
        if (lado == base) throw new IllegalArgumentException("Use Equilatero para tres lados iguales.");
    }
    public double getLadoIgual() { return getLadoA(); }
    public double getBase() { return getLadoC(); }
    public void setLadoIgual(double lado) {
        validarTipo(lado, getBase());
        actualizarLados(lado, lado, getBase());
    }
    public void setBase(double base) {
        validarTipo(getLadoIgual(), base);
        actualizarLados(getLadoIgual(), getLadoIgual(), base);
    }
}
