package ar.edu.undef.fie.productosFinancieros.domain;

import ar.edu.undef.fie.productosFinancieros.interfaces.ProductoFinanciero;

import java.util.ArrayList;
import java.util.List;

public class Billetera {

    private double saldo;
    private List<ProductoFinanciero> historial;

    public Billetera() {
        this.saldo = 0;
        this.historial = new ArrayList<>();
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<ProductoFinanciero> getHistorial() {
        return historial;
    }

    public void setHistorial(List<ProductoFinanciero> historial) {
        this.historial = historial;
    }

    // Metodos de clase
    public void realizarCompra(ProductoFinanciero producto) {
        historial.add(producto);
    }

    public void incrementarSaldo (double incremento) {
        saldo += incremento;
        System.out.println(("Se incrementa el saldo en " + incremento));
    }
}