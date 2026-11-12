package object_oriented_programming.practice_formas05.bl;

import java.util.Arrays;

public abstract class Cuerpo implements Forma {
    protected Cuerpo() {
    }

    public abstract double calcularVolumen();

    protected abstract double[] medidas();

    @Override
    public final boolean equals(Object objeto) {
        return objeto != null && getClass() == objeto.getClass()
                && Arrays.equals(medidas(), ((Cuerpo) objeto).medidas());
    }

    @Override
    public final int hashCode() {
        return 31 * getClass().hashCode() + Arrays.hashCode(medidas());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + Arrays.toString(medidas())
                + " | area=" + calcularArea() + " | perimetro=" + calcularPerimetro()
                + " | volumen=" + calcularVolumen();
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(this);
    }
}
