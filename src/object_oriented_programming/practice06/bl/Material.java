package object_oriented_programming.practice06.bl;

public abstract class Material implements Prestable {

    private final String id;
    private final String titulo;
    private boolean prestado;

    protected Material(String id, String titulo) {
        if (id == null || id.isBlank() || titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El identificador y el título son obligatorios.");
        }
        this.id = id;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (prestado) {
            throw new MaterialNoDisponibleException("El material " + id + " ya está prestado.");
        }
        setPrestado(true);
    }

    @Override
    public void devolver() {
        setPrestado(false);
    }
}
