package ar.edu.undef.fie.remiseria;

import java.util.ArrayList;
import java.util.HashMap;

public class Remiseria {
    private ArrayList<Remis> remises;
    private HashMap<String, Remisero> remiseros;

    public Remiseria() {
        this.remises = new ArrayList<>();
        this.remiseros = new HashMap<>();
    }

    public void agregarRemis(Remis remis) {
        this.remises.add(remis);
    }

    public double promedioKilometraje() {
        int totalKilometraje = 0;
        for (Remis remis : this.remises) {
            totalKilometraje += remis.getKilometraje();
        }
        return (double) totalKilometraje / this.remises.size();
    }

    public void asignarRemisARemisero(String dniRemisero, Remis remis) {
        Remisero remisero = this.remiseros.get(dniRemisero);
        if (remisero != null) {
            remisero.agregarRemis(remis);
        }
    }

    public void calcularPagoRemiseros(double tarifaPorHora) {
        for (Remisero remisero : this.remiseros.values()) {
            double pago = remisero.calcularPago(tarifaPorHora);
            System.out.println("El pago para el remisero " + remisero.getNombre() + " es: " + pago);
        }
    }

    public void registrarHorasTrabajadas(String dniRemisero, int horas) {
        Remisero remisero = this.remiseros.get(dniRemisero);
        if (remisero != null && !remisero.licenciaVencida()) {
            remisero.agregarHorasTrabajadas(horas);
        }
    }

    public void mostrarSueldos(double tarifaPorHora) {
        for (Remisero remisero : this.remiseros.values()) {
            System.out.println("Remisero: " + remisero.getNombre() + ", Licencia vencida: " + remisero.licenciaVencida());
            if (!remisero.licenciaVencida()) {
                double sueldo = remisero.calcularPago(tarifaPorHora);
                System.out.println("El sueldo de " + remisero.getNombre() + " es: " + sueldo);
            }
        }
    }

    public void agregarRemisero(Remisero remisero) {
        this.remiseros.put(remisero.getDni(), remisero);
    }
}
