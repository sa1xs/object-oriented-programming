package object_oriented_programming.practice_formas05.bl;

public class Esfera extends Cuerpo {
    private double radio;

    public Esfera(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = Figura.validar(radio);
    }

    @Override
    protected double[] medidas() {
        return new double[] { radio };
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularVolumen() {
        return 4.0 / 3 * Math.PI * radio * radio * radio;
    }
}
