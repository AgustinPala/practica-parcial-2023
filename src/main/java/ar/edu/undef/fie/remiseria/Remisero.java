package ar.edu.undef.fie.remiseria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Remisero {
    private String nombre;
    private String dni;
    private String tipoLicencia;
    private LocalDate fechaVencimientoLicencia;
    private ArrayList<Remis> remises;

    private int horasTrabajadas;

    public Remisero(String nombre, String dni, String tipoLicencia, LocalDate fechaVencimientoLicencia) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipoLicencia = tipoLicencia;
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
        this.remises = new ArrayList<>();
        this.horasTrabajadas = 0;
    }

    public void agregarRemis(Remis remis) {
        this.remises.add(remis);
    }

    public void agregarHorasTrabajadas(int horas) {
        this.horasTrabajadas += horas;
    }

    public double calcularPago(double tarifaPorHora) {
        return this.horasTrabajadas * tarifaPorHora;
    }

    public boolean licenciaVencida() {
        return false;
        //return LocalDate.now().isAfter(this.fechaVencimientoLicencia);
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public LocalDate getFechaVencimientoLicencia() {
        return fechaVencimientoLicencia;
    }

    public void setFechaVencimientoLicencia(LocalDate fechaVencimientoLicencia) {
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }

    public ArrayList<Remis> getRemises() {
        return remises;
    }

    public void setRemises(ArrayList<Remis> remises) {
        this.remises = remises;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}