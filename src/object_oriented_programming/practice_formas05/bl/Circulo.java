package object_oriented_programming.practice_formas05.bl;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = validar(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = validar(radio);
    }

    @Override
    protected double[] medidas() {
        return new double[] { radio };
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
