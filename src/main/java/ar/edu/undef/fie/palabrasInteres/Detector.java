package ar.edu.undef.fie.palabrasInteres;

public class Detector {
    private int threshold;
    private Metodo metodo;

    // Constructor
    public Detector(int threshold, Metodo metodo) {
        this.threshold = threshold;
        this.metodo = metodo;
    }

    // Setter
    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    // Uso este metodo segun el metodo (valga la redundancia) que declare previamente
    public boolean palabraInteres(String palabra) {
        return metodo.palabraInteres(palabra, threshold);
    }
}
