public class GuitarraAcústica extends Instrumento implements Portatil {
    private double peso;

    public GuitarraAcústica(String nombre, Material material, Familia familia, double peso, boolean afinado) throws InstrumentoException {
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
    public boolean esFacilDeTransportar() {
        return peso <= 3.0;
    }
}
