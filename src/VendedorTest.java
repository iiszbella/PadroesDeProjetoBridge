package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendedorTest {

    @Test
    void deveCalcularSalarioAte3Anos() {
        Vendedor vendedor = Vendedor.getInstance();
        vendedor.setTempoServico(Ate3Anos.getInstance());
        assertEquals(2500f * 1.10f, vendedor.calcularSalario());
    }

    @Test
    void deveCalcularSalarioAte7Anos() {
        Vendedor vendedor = Vendedor.getInstance();
        vendedor.setTempoServico(Ate7Anos.getInstance());
        assertEquals(2500f * 1.20f, vendedor.calcularSalario());
    }

    @Test
    void deveCalcularSalarioAte12Anos() {
        Vendedor vendedor = Vendedor.getInstance();
        vendedor.setTempoServico(Ate12Anos.getInstance());
        assertEquals(2500f * 1.30f, vendedor.calcularSalario());
    }

    @Test
    void deveCalcularSalarioMaisDe12Anos() {
        Vendedor vendedor = Vendedor.getInstance();
        vendedor.setTempoServico(MaisDe12Anos.getInstance());
        assertEquals(2500f * 1.35f, vendedor.calcularSalario());
    }
}

