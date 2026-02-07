public class Flauta extends Instrumento implements Portatil {
    private double peso;

    public Flauta(String nombre, Material material, Familia familia, double pesoa, boolean afinado) {
        super(nombre, material, familia, afinado);
        this.peso = peso;
    }

    @Override
    public boolean esFacilDeTransportar() {
        return peso <= 3.0;
    }
}
