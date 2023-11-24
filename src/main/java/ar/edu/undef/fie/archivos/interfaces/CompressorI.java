package ar.edu.undef.fie.archivos.interfaces;

public interface CompressorI {
    default Long comprimir (Long tamanio) {
        return 1L;
    }
}
