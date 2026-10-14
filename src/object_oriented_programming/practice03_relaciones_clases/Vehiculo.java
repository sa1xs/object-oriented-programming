package object_oriented_programming.practice03_relaciones_clases;

public class Vehiculo {

    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}