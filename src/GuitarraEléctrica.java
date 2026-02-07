public class GuitarraEléctrica extends Instrumento implements Portatil, Amplificable {
    private double peso;

    public GuitarraEléctrica(String nombre, Material material, Familia familia, double peso, boolean afinado) {
        super(nombre, material, familia, afinado);
        this.peso = peso;
    }

    @Override
    public void conectarAmplificador() {
        System.out.println("Conectando " + this.getNombre() + " al amplificador");
    }

    @Override
    public void ajustarVolumen(int volumen) {
        System.out.println("Ajustanto el volumen a " + volumen);
    }

    @Override
    public boolean esFacilDeTransportar() {
        return peso <= 3.0;
    }
}
