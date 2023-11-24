import ar.edu.undef.fie.antivirus.domain.Analisis;
import ar.edu.undef.fie.antivirus.domain.Archivos;
import ar.edu.undef.fie.antivirus.domain.Resultado;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AnalisisTest {

    @Test
    void getResultados() {

    }

    @Test
    void setResultados() {

    }

    @Test
    @DisplayName("Test generico de comportamiento del analisis")
    void probarEstado(){

        var archivo1 = new Archivos("Esto no es un virus");
        var archivo2 = new Archivos("Download free ram");

        var resultado1 = new Resultado(3, archivo1);
        var resultado2 = new Resultado(8, archivo2);

        List<Resultado> resultados = new ArrayList<>();
        resultados.add(resultado1);
        resultados.add(resultado2);

        var analisis = new Analisis(resultados);

        System.out.println(analisis);
    }
}