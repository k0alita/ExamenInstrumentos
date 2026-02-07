public class GuitarraAcústica extends Instrumento implements Portatil {
    private double peso;

    public GuitarraAcústica(String nombre, Material material, Familia familia, double peso, boolean afinado) {
        super(nombre, material, familia, afinado);
        this.peso = peso;
    }

    @Override
    public boolean esFacilDeTransportar() {
        return peso <= 3.0;
    }
}
