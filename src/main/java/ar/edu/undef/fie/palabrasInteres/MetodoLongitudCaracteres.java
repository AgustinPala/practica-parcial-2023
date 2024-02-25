package ar.edu.undef.fie.palabrasInteres;

public class MetodoLongitudCaracteres {
    private int longitud;

    public MetodoLongitudCaracteres(int longitud) {
        this.longitud = longitud;
    }

    public boolean palabraInteres(String palabra, int threshold) {
        return palabra.length() >= longitud;
    }
}
