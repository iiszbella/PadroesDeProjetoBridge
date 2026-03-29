package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    void deveCalcularSalarioAte3Anos() {
        Caixa caixa = Caixa.getInstance();
        caixa.setTempoServico(Ate3Anos.getInstance());
        assertEquals(2000f * 1.10f, caixa.calcularSalario());
    }

    @Test
    void deveCalcularSalarioAte7Anos() {
        Caixa caixa = Caixa.getInstance();
        caixa.setTempoServico(Ate7Anos.getInstance());
        assertEquals(2000f * 1.20f, caixa.calcularSalario());
    }

    @Test
    void deveCalcularSalarioAte12Anos() {
        Caixa caixa = Caixa.getInstance();
        caixa.setTempoServico(Ate12Anos.getInstance());
        assertEquals(2000f * 1.30f, caixa.calcularSalario());
    }

    @Test
    void deveCalcularSalarioMaisDe12Anos() {
        Caixa caixa = Caixa.getInstance();
        caixa.setTempoServico(MaisDe12Anos.getInstance());
        assertEquals(2000f * 1.35f, caixa.calcularSalario());
    }
}

