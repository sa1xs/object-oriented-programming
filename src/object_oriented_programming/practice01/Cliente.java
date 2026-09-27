package object_oriented_programming.practice01;

public class Cliente {

    String nombre;
    String apellidos;
    String cedula;
    String sexo;
    String ubicacion;

    public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    public Cliente() {
    }

    public void suscribirse(Suscripcion suscripcion) {
        System.out.println(this.nombre + " " + this.apellidos + " adquirió una suscripción de " + suscripcion.tipo);
    }
}
