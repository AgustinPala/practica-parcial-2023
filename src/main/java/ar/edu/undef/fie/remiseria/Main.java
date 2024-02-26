package ar.edu.undef.fie.remiseria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear remiseria
        Remiseria remiseria = new Remiseria();

        // Crear remises
        Remis remis1 = new Remis("ABC123", "Toyota", "Corolla", 50000);
        Remis remis2 = new Remis("DEF456", "Honda", "Civic", 30000);

        // Agregar remises a la remiseria
        remiseria.agregarRemis(remis1);
        remiseria.agregarRemis(remis2);

        // Crear remiseros
        Remisero remisero1 = new Remisero("Juan", "12345678", "Tipo B", LocalDate.of(2023, 12, 31));
        Remisero remisero2 = new Remisero("Maria", "87654321", "Tipo B", LocalDate.of(2022, 12, 31));

        remiseria.agregarRemisero(remisero1);
        remiseria.agregarRemisero(remisero2);

        // Asignar remises a remiseros
        remiseria.asignarRemisARemisero(remisero1.getDni(), remis1);
        remiseria.asignarRemisARemisero(remisero2.getDni(), remis2);

        // Registrar horas trabajadas
        remiseria.registrarHorasTrabajadas(remisero1.getDni(), 160);
        remiseria.registrarHorasTrabajadas(remisero2.getDni(), 160);

        // Mostrar sueldos de los remiseros
        remiseria.mostrarSueldos(100); // Suponiendo que la tarifa por hora es 100

        // Prueba de otros métodos
        System.out.println("Promedio de kilometraje: " + remiseria.promedioKilometraje());
    }
}