package object_oriented_programming.practice06.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    private static final int MAXIMO_PRESTAMOS = 3;

    private final int id;
    private final String nombre;
    private final List<Material> prestamos;

    public Usuario(int id, String nombre) {
        if (id <= 0 || nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El usuario requiere un identificador positivo y un nombre.");
        }
        this.id = id;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Material> getPrestamos() {
        return List.copyOf(prestamos);
    }

    public int cantidadPrestamos() {
        return prestamos.size();
    }

    public void prestarMaterial(Material material)
            throws MaterialNoDisponibleException, MaximoPrestamosException {
        Objects.requireNonNull(material, "El material es obligatorio.");
        if (cantidadPrestamos() >= MAXIMO_PRESTAMOS) {
            throw new MaximoPrestamosException("El usuario " + id + " ya tiene tres préstamos activos.");
        }
        material.prestar();
        prestamos.add(material);
    }

    public void devolverMaterial(Material material) throws BibliotecaException {
        Objects.requireNonNull(material, "El material es obligatorio.");
        if (!prestamos.contains(material)) {
            throw new BibliotecaException("El usuario " + id + " no tiene prestado el material "
                    + material.getId() + ".");
        }
        material.devolver();
        prestamos.remove(material);
    }
}
