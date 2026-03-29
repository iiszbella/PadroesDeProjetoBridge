package padroesestruturais.bridge;

public class Ate3Anos implements TempoServico {
    private static final Ate3Anos instancia = new Ate3Anos();
    private Ate3Anos() {}
    public static Ate3Anos getInstance() { return instancia; }

    public float percentualAumento() {
        return 0.10f;
    }
}
