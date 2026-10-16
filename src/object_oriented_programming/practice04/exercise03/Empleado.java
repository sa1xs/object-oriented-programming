package object_oriented_programming.practice04.exercise03;

public class Empleado {
    
    protected String nombre;
    protected String apellido;
    protected String puesto;
    protected final double HORAS_TRABAJADAS_DIA;
    protected final double PAGO_HORA;

    public Empleado(String nombre, String apellido, String puesto, double HORAS_TRABAJADAS_DIA, double PAGO_HORA) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.HORAS_TRABAJADAS_DIA = HORAS_TRABAJADAS_DIA;
        this.PAGO_HORA = PAGO_HORA;
    }

    public String trabajar() {
        return nombre + " " + apellido + " y está trabajando en el puesto de " + puesto;
    }

    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * PAGO_HORA * 5 * 4;
    }
}
