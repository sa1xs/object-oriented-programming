package object_oriented_programming.practice01;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String cedula;
    private String sexo;
    private String ubicacion;

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

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void suscribirse(Suscripcion suscripcion) {
        System.out.println(getNombre() + " " + getApellidos() + " adquirió una suscripción de " + suscripcion.getTipo());
    }
}
