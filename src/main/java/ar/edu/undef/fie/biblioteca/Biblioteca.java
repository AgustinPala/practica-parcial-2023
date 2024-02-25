package ar.edu.undef.fie.biblioteca;

// Crear una clase Libro con atributos como idLibro, titulo, autor y cantidadDisponible.
// Implementar una clase Biblioteca que utilice un HashMap para almacenar libros.
// La clave del HashMap será el idLibro.
// La clase Biblioteca debe tener métodos para:
//    Agregar un libro al sistema.
//    Prestar un libro (reducir la cantidad disponible).
//    Devolver un libro (aumentar la cantidad disponible).
//    Mostrar información sobre un libro dado su idLibro.

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    private HashMap<Integer, Libro> libros;
    private ArrayList<Libro> librosPrestados;

    public Biblioteca() {
        libros = new HashMap<>();
        librosPrestados = new ArrayList<>();
    }


    // Agregar un libro al sistema.
    public void agregarLibro(Libro libro) {
        if (this.libros.containsKey(libro.getIdLibro())) {
            System.out.println("El libro que intenta agregar ya existe: " + libro.getTitulo());
        } else {
            libros.put(libro.getIdLibro(), libro);
        }
    }

    // Prestar un libro (reducir la cantidad disponible).
    public void prestarLibro(int idLibro) {
        if (this.libros.containsKey(idLibro)) {
            Libro libro = libros.get(idLibro);
            if (libro.getCantidadDisponible() > 0) {
                libro.setCantidadDisponible(libro.getCantidadDisponible() - 1);
                librosPrestados.add(libro);
                System.out.println("Se presta el libro " + libro.getTitulo());
            } else {
                System.out.println("No hay suficientes libros " + libro.getTitulo());
            }
        } else {
            System.out.println("El libro que quiere prestar no existe");
        }
    }

    // Devolver un libro (aumentar la cantidad disponible).
    public void devolverLibro(int idLibro) {
        if (this.libros.containsKey(idLibro)) {
            Libro libro = libros.get(idLibro);
            libro.setCantidadDisponible(libro.getCantidadDisponible() + 1);
            librosPrestados.remove(libro);
        } else {
            System.out.println("El libro que quiere devolver no esta registrado");
            // Aca lo que decido es no agregarlo. Porque el libro no pertenece a la biblioteca
        }

    }

    // Mostrar información sobre un libro dado su idLibro. Como sobreescribi el metodo String en Libro,
    // lo muestro directamente desde ahi
    public Libro mostrarInformacion(int idLibro) {
        return libros.get(idLibro);
    }
}