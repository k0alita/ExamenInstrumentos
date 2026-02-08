public class GuitarraEléctrica extends Instrumento implements Portatil, Amplificable {
    private double peso;

    public GuitarraEléctrica(String nombre, Material material, Familia familia, double peso, boolean afinado) throws InstrumentoException {
        super(nombre, material, familia, afinado);
        setPeso(peso);
    }

    public void setPeso(double peso) throws InstrumentoException {
        if (peso <= 0 ) {
            throw new InstrumentoException("El peso de " + getNombre() + " debe ser mayor a 0");
        }
        this.peso = peso;
    }

    @Override
    public void conectarAmplificador() {
        System.out.println("Conectando " + this.getNombre() + " al amplificador");
    }

    @Override
    public void ajustarVolumen(int volumen) throws InstrumentoException {
        if (volumen <= 0) {
            throw new InstrumentoException("El volumen no puede ser menor a 0");
        }
        System.out.println("Ajustanto el volumen a " + volumen);
    }

    @Override
    public boolean esFacilDeTransportar() {
        return peso <= 3.0;
    }
}
