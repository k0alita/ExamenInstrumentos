public abstract class Instrumento {
    private String nombre;
    private Material material;
    private Familia familia;
    private boolean afinado;

    public Instrumento(String nombre, Material material, Familia familia, boolean afinado) {
        this.nombre = nombre;
        this.material = material;
        this.familia = familia;
        this.afinado = afinado;
    }

    public void afinar(){
        this.afinado = true;
        System.out.println("Afinando el instrumento musical " + this.nombre);
    }

    public void tocar() {
        System.out.println("Tocando el instrumento musical " + this.nombre);
    }

    public boolean necesitaAfinacion() {
        return !this.afinado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }
}
