public class Principal {

    public static final int MAX_INSTRUMENTOS = 100;
    static Instrumento[] instrumentos = new Instrumento[MAX_INSTRUMENTOS];
    public static int numInstrumentos = 0;

    public static void main(String[] args) {
        try {
            GuitarraAcústica ga = new GuitarraAcústica("Guitarra Espanola", Material.Madera, Familia.Cuerda, 2.5, false);
            GuitarraEléctrica ge = new GuitarraEléctrica("Fender Stratocaster", Material.Madera, Familia.Cuerda, 3, true);
            Piano p = new Piano("Yamaha Clavinova", Material.Madera, Familia.Cuerda, false);
            Flauta f = new Flauta("Flauta Dulce", Material.Plastico, Familia.Viento, 0.5, true);
            Batería b = new Batería("Bateria Acustica", Material.Metal, Familia.Percusion, false);

            addInstrumento(ga);
            addInstrumento(ge);
            addInstrumento(p);
            addInstrumento(f);
            addInstrumento(b);


            System.out.println("=== AFINAR Y TOCAR INSTRUMENTOS ===");
            comprobarAfinar();

            System.out.println();

            System.out.println("=== PRUEBA DE PORTABILIDAD ===");
            falcilDeTransportar();

            System.out.println();

            System.out.println("=== PRUEBA DE AMPLIFICACIÓN ===");
            amplificarInstrumento();
        } catch (InstrumentoException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void comprobarAfinar() {
        for (int i = 0; i < instrumentos.length ; i++) {
            if (instrumentos[i] != null) {
                if (instrumentos[i].necesitaAfinacion()) {
                    instrumentos[i].afinar();
                } instrumentos[i].tocar();
            }
        }


    }

    public static void falcilDeTransportar() {
        for (int i = 0; i < instrumentos.length; i++) {
            if (instrumentos[i] != null) {
                if (instrumentos[i] instanceof Portatil) {
                        System.out.println(instrumentos[i].getNombre() + " es facil de transportar: " + ((Portatil) instrumentos[i]).esFacilDeTransportar());
                } else {
                    System.out.println(instrumentos[i].getNombre() + " no es un instrumento portatil");
                }
            }
        }
    }

    public static void amplificarInstrumento() throws InstrumentoException {
        for (int i = 0; i < instrumentos.length; i++) {
            if (instrumentos[i] != null) {
                if (instrumentos[i] instanceof Amplificable) {
                    ((Amplificable) instrumentos[i]).conectarAmplificador();
                    ((Amplificable) instrumentos[i]).ajustarVolumen(10);
                }
            }
        }

    }

    public static void addInstrumento(Instrumento instrumento) {
        if (numInstrumentos < MAX_INSTRUMENTOS) {
            instrumentos[numInstrumentos] = instrumento;
            numInstrumentos++;
            System.out.println("Instrumento anadido correctamente");
        }
    }
}
