package object_oriented_programming.practice_formas05.bl;

import java.util.Arrays;

public abstract class Triangulo extends Figura {
    private double ladoA, ladoB, ladoC;

    protected Triangulo(double a, double b, double c) {
        actualizarLados(a, b, c);
    }

    protected final void actualizarLados(double a, double b, double c) {
        validar(a);
        validar(b);
        validar(c);
        double[] lados = { a, b, c };
        Arrays.sort(lados);
        if (lados[0] <= lados[2] - lados[1]) {
            throw new IllegalArgumentException("Los lados no forman un triangulo.");
        }
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public static Triangulo crear(double a, double b, double c) {
        if (a == b && b == c)
            return new Equilatero(a);
        if (a == b)
            return new Isosceles(a, c);
        if (a == c)
            return new Isosceles(a, b);
        if (b == c)
            return new Isosceles(b, a);
        return new Escaleno(a, b, c);
    }

    @Override
    protected double[] medidas() {
        double[] lados = { ladoA, ladoB, ladoC };
        Arrays.sort(lados);
        return lados;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
}
