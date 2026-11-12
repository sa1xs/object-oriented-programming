package object_oriented_programming.practice_formas05.bl;

public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = validar(base);
        this.altura = validar(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = validar(base);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = validar(altura);
    }

    @Override
    protected double[] medidas() {
        return new double[] { base, altura };
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

}
