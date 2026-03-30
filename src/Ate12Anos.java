package padroesestruturais.bridge;

public class Ate12Anos implements TempoServico {
    private static final Ate12Anos instancia = new Ate12Anos();
    private Ate12Anos() {}
    public static Ate12Anos getInstance() { return instancia; }

    public float percentualAumento() {
        return 0.30f;
    }
}