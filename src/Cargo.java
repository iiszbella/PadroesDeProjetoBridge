package padroesestruturais.bridge;

public abstract class Cargo {
    protected TempoServico tempoServico;
    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTempoServico(TempoServico tempoServico) {
        this.tempoServico = tempoServico;
    }

    public abstract float calcularSalario();
}
