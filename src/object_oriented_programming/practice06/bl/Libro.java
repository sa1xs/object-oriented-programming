package object_oriented_programming.practice06.bl;

public class Libro extends Material {

    private final String autor;
    private final String isbn;

    public Libro(String id, String titulo, String autor, String isbn) {
        super(id, titulo);
        if (autor == null || autor.isBlank() || isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("El autor y el ISBN son obligatorios.");
        }
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
