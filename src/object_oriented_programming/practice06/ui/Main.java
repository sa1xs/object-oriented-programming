package object_oriented_programming.practice06.ui;

import java.io.IOException;
import object_oriented_programming.practice06.bl.Biblioteca;
import object_oriented_programming.practice06.bl.BibliotecaException;
import object_oriented_programming.practice06.bl.Libro;
import object_oriented_programming.practice06.bl.RegistroErrores;
import object_oriented_programming.practice06.bl.Revista;
import object_oriented_programming.practice06.bl.Usuario;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            biblioteca.registrarMaterial(new Libro("L001", "El principito", "Antoine de Saint-Exupéry", "9780156012195"));
            biblioteca.registrarMaterial(new Libro("L002", "Don Quijote", "Miguel de Cervantes", "9788420412146"));
            biblioteca.registrarMaterial(new Revista("R001", "Ciencia y tecnología", 1));
            biblioteca.registrarMaterial(new Revista("R002", "Naturaleza", 2));
            biblioteca.registrarUsuario(new Usuario(1, "Ana"));
            biblioteca.registrarUsuario(new Usuario(2, "Luis"));
        } catch (BibliotecaException e) {
            informarError(e);
            return;
        } finally {
            System.out.println("Registro inicial finalizado.");
        }

        realizarPrestamo(biblioteca, 1, "L001"); // Préstamo exitoso.
        realizarPrestamo(biblioteca, 2, "L001"); // Material ya prestado.
        realizarPrestamo(biblioteca, 1, "L999"); // Material inexistente.
        realizarPrestamo(biblioteca, 999, "L002"); // Usuario inexistente.
        realizarPrestamo(biblioteca, 1, "L002");
        realizarPrestamo(biblioteca, 1, "R001");
        realizarPrestamo(biblioteca, 1, "R002"); // Cuarto préstamo: supera el máximo.
        realizarDevolucion(biblioteca, 2, "L001"); // No pertenece a sus préstamos.
        realizarDevolucion(biblioteca, 1, "L001");
        realizarPrestamo(biblioteca, 2, "L001"); // Disponible tras la devolución.
        realizarPrestamo(biblioteca, 1, "R002"); // Recuperó un espacio para prestar.
    }

    private static void realizarPrestamo(Biblioteca biblioteca, int usuarioId, String materialId) {
        System.out.println("\nPréstamo: usuario " + usuarioId + ", material " + materialId);
        try {
            biblioteca.prestarMaterial(usuarioId, materialId);
            System.out.println("Préstamo realizado correctamente.");
        } catch (BibliotecaException e) {
            informarError(e);
        } finally {
            System.out.println("Operación de préstamo finalizada.");
        }
    }

    private static void realizarDevolucion(Biblioteca biblioteca, int usuarioId, String materialId) {
        System.out.println("\nDevolución: usuario " + usuarioId + ", material " + materialId);
        try {
            biblioteca.devolverMaterial(usuarioId, materialId);
            System.out.println("Devolución realizada correctamente.");
        } catch (BibliotecaException e) {
            informarError(e);
        } finally {
            System.out.println("Operación de devolución finalizada.");
        }
    }

    private static void informarError(BibliotecaException e) {
        System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        try {
            RegistroErrores.registrar(e);
        } catch (IOException errorRegistro) {
            System.err.println("No se pudo escribir errores.log: " + errorRegistro.getMessage());
        }
    }
}
