package Pag75;

import java.util.Objects;

public class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getAutor() {
        return autor;
    }

    // Métodos para evitar duplicados en el Set (comparación por ID)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return id == libro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Para mostrar la información del libro
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor;
    }
}
