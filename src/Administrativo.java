package padroesestruturais.bridge;

public class Administrativo extends Cargo {
    private static final Administrativo instancia = new Administrativo(3000f);
    private Administrativo(float salarioBase) { super(salarioBase); }
    public static Administrativo getInstance() { return instancia; }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.tempoServico.percentualAumento());
    }
}
