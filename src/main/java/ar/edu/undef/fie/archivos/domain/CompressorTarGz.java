package ar.edu.undef.fie.archivos.domain;

public class CompressorTarGz extends Compressor {

    public CompressorTarGz(Float ratio) {
        super(ratio);
    }

    /*
    // Podría sobreescribir, pero mejor usamos el constructor de la clase padre

    @Override
    Float comprimir(Long tamanio) {
        return this.getRatio() * tamanio;
    }
    */
}
