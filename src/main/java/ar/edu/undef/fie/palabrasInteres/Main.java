package ar.edu.undef.fie.palabrasInteres;

// Ejercicio 2 Detección de palabras de interés
//
// Se requiere la implementación de una clase denominada Detector
// con dos atributos principales: uno asociado a un umbral (threshold)
// y otro que referencia al método de detección a utilizar.
//
// Es fundamental que el método de detección pueda modificarse
// dinámicamente durante la ejecución del programa.
//
// Para poder cumplir con este objetivo, se recomienda que Metodo sea una interfaz,
//  cuyas implementaciones tendrán que ser las siguientes:
//
// Por Cantidad de Letras: Se construye especificando una letra de interés y el umbral.
// Una palabra será considerada de interés si la letra seleccionada aparece más veces
// de lo indicado por el umbral.
//
// Longitud de Caracteres: Se construye utilizando únicamente un umbral.
// Una palabra será clasificada como de interés si su longitud supera el umbral establecido.

import ar.edu.undef.fie.palabrasInteres.Detector;
import ar.edu.undef.fie.palabrasInteres.MetodoCantidadLetras;
import ar.edu.undef.fie.palabrasInteres.MetodoLongitudCaracteres;

public class Main {
    public static void main(String[] args) {

        Detector detector = new Detector(2, new MetodoCantidadLetras('a', 2));
        System.out.println(detector.palabraInteres("argentina")); // true
        System.out.println(detector.palabraInteres("agustin")); // false

        detector.setMetodo((Metodo) new MetodoLongitudCaracteres(5));
        System.out.println(detector.palabraInteres("argentina")); // true
        System.out.println(detector.palabraInteres("agus")); // false
    }
}
