package object_oriented_programming.practice04.exercise02;

public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
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
