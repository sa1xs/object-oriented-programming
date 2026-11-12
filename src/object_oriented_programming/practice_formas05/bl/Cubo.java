package object_oriented_programming.practice_formas05.bl;

import java.util.Objects;

public class Cubo extends Cuerpo {
    private Cuadrado cara;

    public Cubo(Cuadrado cara) {
        setCara(cara);
    }

    public Cuadrado getCara() {
        return new Cuadrado(cara.getLado());
    }

    public void setCara(Cuadrado cara) {
        this.cara = new Cuadrado(Objects.requireNonNull(cara, "La cara es obligatoria.").getLado());
    }

    @Override
    protected double[] medidas() {
        return new double[] { cara.getLado() };
    }

    @Override
    public double calcularArea() {
        return 6 * cara.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return 12 * cara.getLado();
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(cara.getLado(), 3);
    }
}
