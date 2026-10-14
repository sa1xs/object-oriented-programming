package object_oriented_programming.practice03_relaciones_clases;

public class Carro extends Vehiculo{

    protected String marca;
    protected String modelo;
    protected int anio;

    public Carro(String marca, String modelo, int anio) {
        super("Terrestre");
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}