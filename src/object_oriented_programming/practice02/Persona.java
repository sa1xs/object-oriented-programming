package object_oriented_programming.practice02;

import java.sql.SQLOutput;

public class Persona  {

    private String nombre;
    private String apellido;
    private Pasaporte pasaporte;
    private Mascota mascota;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void sacarPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void tomarVuelo(String destino){
        if (getPasaporte().isVigencia()){
            System.out.println(this.nombre + " " + this.apellido + " tomó el vuelo a " + destino);
        }else{
            System.out.println(this.nombre + " " + this.apellido + " no tomó el vuelo a " + destino + " porque tiene el pasaporte vencido");
        }
    }

    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugar() {
        System.out.println(this.nombre + " " + this.apellido + " está jugando con " + mascota.getNombre());
    }

    public void soldar(MaquinaSoldar maquina, String metal){
        maquina.soldar(metal);
    }
}