package object_oriented_programming.practice01;

public class Suscripcion {

    String tipo;
    double costo;
    short periodicidad;

    public Suscripcion(String tipo, double costo, short periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public short getPeriodicidad() {
        return periodicidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setPeriodicidad(short periodicidad) {
        this.periodicidad = periodicidad;
    }

    public boolean equals(Suscripcion suscripcion) {
        return getTipo().equals(suscripcion.getTipo()) && getPeriodicidad() == suscripcion.getPeriodicidad() && getCosto() == suscripcion.getCosto();
    }
}
