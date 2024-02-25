package ar.edu.undef.fie.palabrasInteres;

public class MetodoCantidadLetras implements Metodo {

    private char letraInteres;

    public MetodoCantidadLetras(char letraInteres, int i) {
        this.letraInteres = letraInteres;
    }

    @Override
    public boolean palabraInteres(String palabra, int threshold) {
        int contador = 0;
        for (char caracter : palabra.toCharArray()) {
            if (caracter == letraInteres) {
                contador++;
            }
        }
        return contador >= threshold;
    }
}
