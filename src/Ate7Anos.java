package padroesestruturais.bridge;

public class Ate7Anos implements TempoServico {
    private static final Ate7Anos instancia = new Ate7Anos();
    private Ate7Anos() {}
    public static Ate7Anos getInstance() { return instancia; }

    public float percentualAumento() {
        return 0.20f;
    }
}