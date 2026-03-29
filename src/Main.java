package padroesestruturais.bridge;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = Vendedor.getInstance();
        vendedor.setTempoServico(Ate7Anos.getInstance());
        System.out.println("Salário Vendedor: " + String.format("%.2f", vendedor.calcularSalario()));

        Caixa caixa = Caixa.getInstance();
        caixa.setTempoServico(MaisDe12Anos.getInstance());
        System.out.println("Salário Caixa: " + String.format("%.2f", caixa.calcularSalario()));

        Administrativo adm = Administrativo.getInstance();
        adm.setTempoServico(Ate12Anos.getInstance());
        System.out.println("Salário Administrativo: " + String.format("%.2f", adm.calcularSalario()));
    }
}
