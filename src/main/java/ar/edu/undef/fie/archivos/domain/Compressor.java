package ar.edu.undef.fie.archivos.domain;

abstract class Compressor {
    private final Float ratio;  // Nunca definir un atributo de clase como publico, acceso a traves de metodos

    public Compressor(Float ratio) {
        this.ratio = ratio;
    }

    // Los metodos abstractos no tienen cuerpo

    final public Float comprimir(Long tamanio) {
        return tamanio * ratio;
    }

    public Float getRatio() {
        return ratio;
    }
}
