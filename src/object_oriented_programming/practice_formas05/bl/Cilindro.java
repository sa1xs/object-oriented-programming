package object_oriented_programming.practice_formas05.bl;

import java.util.Objects;

public class Cilindro extends Cuerpo {
    private Circulo base;
    private Rectangulo lateral;

    public Cilindro(Circulo base, Rectangulo lateral) {
        setFiguras(base, lateral);
    }

    public Circulo getBase() {
        return new Circulo(base.getRadio());
    }

    public Rectangulo getLateral() {
        return new Rectangulo(lateral.getBase(), lateral.getAltura());
    }

    public void setFiguras(Circulo base, Rectangulo lateral) {
        Objects.requireNonNull(base, "La base es obligatoria.");
        Objects.requireNonNull(lateral, "El rectangulo lateral es obligatorio.");
        double circunferencia = base.calcularPerimetro();
        if (Math.abs(lateral.getBase() - circunferencia) > 1e-9 * circunferencia) {
            throw new IllegalArgumentException("La base del rectangulo debe ser la circunferencia del circulo.");
        }
        this.base = new Circulo(base.getRadio());
        this.lateral = new Rectangulo(circunferencia, lateral.getAltura());
    }

    public void setBase(Circulo base) {
        Objects.requireNonNull(base, "La base es obligatoria.");
        setFiguras(base, new Rectangulo(base.calcularPerimetro(), lateral.getAltura()));
    }

    public void setLateral(Rectangulo lateral) {
        setFiguras(base, lateral);
    }

    @Override
    protected double[] medidas() {
        return new double[] { base.getRadio(), lateral.getAltura() };
    }

    @Override
    public double calcularArea() {
        return 2 * base.calcularArea() + lateral.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base.calcularPerimetro();
    }

    @Override
    public double calcularVolumen() {
        return base.calcularArea() * lateral.getAltura();
    }
}
