package padroesestruturais.bridge;

public class Vendedor extends Cargo {
    private static final Vendedor instancia = new Vendedor(2500f);
    private Vendedor(float salarioBase) { super(salarioBase); }
    public static Vendedor getInstance() { return instancia; }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.tempoServico.percentualAumento());
    }
}