package object_oriented_programming.practice_formas05.bl;

import java.util.Arrays;

public abstract class Figura implements Forma {
    protected Figura() { }
    protected static double validar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("La medida debe ser positiva y finita.");
        }
        return valor;
    }
    protected abstract double[] medidas();
    @Override public final boolean equals(Object objeto) {
        return objeto != null && getClass() == objeto.getClass()
            && Arrays.equals(medidas(), ((Figura) objeto).medidas());
    }
    @Override public final int hashCode() {
        return 31 * getClass().hashCode() + Arrays.hashCode(medidas());
    }
    @Override public String toString() {
        return getClass().getSimpleName() + Arrays.toString(medidas())
            + " | area=" + calcularArea() + " | perimetro=" + calcularPerimetro();
    }
    @Override public void imprimirInformacion() { System.out.println(this); }
}
