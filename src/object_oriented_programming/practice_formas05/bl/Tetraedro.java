package object_oriented_programming.practice_formas05.bl;

import java.util.Objects;

public class Tetraedro extends Cuerpo {
    private Equilatero cara;

    public Tetraedro(Equilatero cara) {
        setCara(cara);
    }

    public Equilatero getCara() {
        return new Equilatero(cara.getLado());
    }

    public void setCara(Equilatero cara) {
        this.cara = new Equilatero(Objects.requireNonNull(cara, "La cara es obligatoria.").getLado());
    }

    @Override
    protected double[] medidas() {
        return new double[] { cara.getLado() };
    }

    @Override
    public double calcularArea() {
        return 4 * cara.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return 6 * cara.getLado();
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(cara.getLado(), 3) / (6 * Math.sqrt(2));
    }
}
