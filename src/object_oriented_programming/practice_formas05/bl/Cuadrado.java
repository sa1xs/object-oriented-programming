package object_oriented_programming.practice_formas05.bl;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return getBase();
    }

    public void setLado(double lado) {
        validar(lado);
        super.setBase(lado);
        super.setAltura(lado);
    }

    @Override
    public void setBase(double base) {
        setLado(base);
    }

    @Override
    public void setAltura(double altura) {
        setLado(altura);
    }
}
