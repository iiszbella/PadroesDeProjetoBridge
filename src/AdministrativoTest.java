package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdministrativoTest {

    @Test
    void deveCalcularSalarioAte3Anos() {
        Administrativo adm = Administrativo.getInstance();
        adm.setTempoServico(Ate3Anos.getInstance());
        assertEquals(3000f * 1.10f, adm.calcularSalario());
    }

    @Test
    void deveCalcularSalarioAte7Anos() {
        Administrativo adm = Administrativo.getInstance();
        adm.setTempoServico(Ate7Anos.getInstance());
        assertEquals(3000f * 1.20f, adm.calcularSalario());
    }

    @Test
    void deveCalcularSalarioAte12Anos() {
        Administrativo adm = Administrativo.getInstance();
        adm.setTempoServico(Ate12Anos.getInstance());
        assertEquals(3000f * 1.30f, adm.calcularSalario());
    }

    @Test
    void deveCalcularSalarioMaisDe12Anos() {
        Administrativo adm = Administrativo.getInstance();
        adm.setTempoServico(MaisDe12Anos.getInstance());
        assertEquals(3000f * 1.35f, adm.calcularSalario());
    }
}
