package padroesestruturais.bridge;

public class MaisDe12Anos implements TempoServico {
    private static final MaisDe12Anos instancia = new MaisDe12Anos();
    private MaisDe12Anos() {}
    public static MaisDe12Anos getInstance() { return instancia; }

    public float percentualAumento() {
        return 0.35f;
    }
}
