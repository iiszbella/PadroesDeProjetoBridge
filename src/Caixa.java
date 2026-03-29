package padroesestruturais.bridge;

public class Caixa extends Cargo {
    private static final Caixa instancia = new Caixa(2000f);
    private Caixa(float salarioBase) { super(salarioBase); }
    public static Caixa getInstance() { return instancia; }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.tempoServico.percentualAumento());
    }
}
