package ar.edu.undef.fie.antivirus.domain;

import java.util.List;

public class Analisis {

    private List<Resultado> resultados;

    // Metodos de la clase
    private float estado() {
        int archivosCriticos = 0;
        int archivos = 0;

        for (Resultado resultado : resultados) {
            if (resultado.getCriticidad() > 4) {
                archivos ++;
            } else {
                archivosCriticos ++;
            }
        }
        return archivos / archivosCriticos;
    }


    // Constructor
    public Analisis(List<Resultado> resultados) {
        this.resultados = resultados;
    }

    // Getters y Setters
    public List<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(List<Resultado> resultados) {
        this.resultados = resultados;
    }
}
