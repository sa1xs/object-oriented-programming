package object_oriented_programming.practice03_relaciones_clases;

public class CarroElectrico extends Carro{

    private int autonomia;

    public CarroElectrico(String marca, String modelo, int anio, int autonomia) {
        super(marca, modelo, anio);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}