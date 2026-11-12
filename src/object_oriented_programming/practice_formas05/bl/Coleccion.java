package object_oriented_programming.practice_formas05.bl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Coleccion {
    private final List<Figura> figuras = new ArrayList<>();
    private final List<Cuerpo> cuerpos = new ArrayList<>();

    public Coleccion() {
    }

    public void agregarFigura(Figura figura) {
        figuras.add(Objects.requireNonNull(figura));
    }

    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(Objects.requireNonNull(cuerpo));
    }

    public List<Figura> getFiguras() {
        return Collections.unmodifiableList(new ArrayList<>(figuras));
    }

    public List<Cuerpo> getCuerpos() {
        return Collections.unmodifiableList(new ArrayList<>(cuerpos));
    }

    public void setFiguras(List<Figura> nuevas) {
        List<Figura> copia = new ArrayList<>(Objects.requireNonNull(nuevas));
        for (Figura figura : copia)
            Objects.requireNonNull(figura);
        figuras.clear();
        figuras.addAll(copia);
    }

    public void setCuerpos(List<Cuerpo> nuevos) {
        List<Cuerpo> copia = new ArrayList<>(Objects.requireNonNull(nuevos));
        for (Cuerpo cuerpo : copia)
            Objects.requireNonNull(cuerpo);
        cuerpos.clear();
        cuerpos.addAll(copia);
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Forma figura : figuras)
            total += figura.calcularArea();
        for (Forma cuerpo : cuerpos)
            total += cuerpo.calcularArea();
        return total;
    }

    public double calcularPerimetroTotal() {
        double total = 0;
        for (Forma figura : figuras)
            total += figura.calcularPerimetro();
        for (Forma cuerpo : cuerpos)
            total += cuerpo.calcularPerimetro();
        return total;
    }

    public double calcularVolumenTotal() {
        double total = 0;
        for (Cuerpo cuerpo : cuerpos)
            total += cuerpo.calcularVolumen();
        return total;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto)
            return true;
        if (objeto == null || getClass() != objeto.getClass())
            return false;
        Coleccion otra = (Coleccion) objeto;
        return figuras.equals(otra.figuras) && cuerpos.equals(otra.cuerpos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figuras, cuerpos);
    }

    @Override
    public String toString() {
        return "Coleccion{figuras=" + figuras + ", cuerpos=" + cuerpos + "}";
    }
}
