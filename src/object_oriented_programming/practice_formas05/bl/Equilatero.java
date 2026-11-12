package object_oriented_programming.practice_formas05.bl;

public class Equilatero extends Triangulo {
    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    public double getLado() {
        return getLadoA();
    }

    public void setLado(double lado) {
        actualizarLados(lado, lado, lado);
    }
}
