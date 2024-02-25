package ar.edu.undef.fie.biblioteca;

public class Main {
    public static void main(String[] args) {

        var biblioteca = new Biblioteca();

        // Agrego libros a la biblioteca
        biblioteca.agregarLibro(new Libro(1, "SeniorDeLosAnillos", "Autor1", 1));
        biblioteca.agregarLibro(new Libro(2, "Principito", "Autor2", 2));

        // Prestar un libro
        biblioteca.prestarLibro(1);

        // Devuelvo un libro
        biblioteca.devolverLibro(2);

        // Muestro la informacion de un libro
        Libro libro = biblioteca.mostrarInformacion(1);
        System.out.println(libro);
    }
}