package object_oriented_programming.practice02;

public class Pasaporte {

    private String numero;
    private String nacionalidad;
    private String fechaEmision;
    private String fechaVencimiento;
    private boolean vigencia;

    public Pasaporte(String numero, String nacionalidad, String fechaEmision, String fechaVencimiento, boolean vigencia) {
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.vigencia = vigencia;
    }

    public String getNumero() {
        return numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
}