import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.reis1x.Multa;
public class MultaTeste {
    private Multa multa = null;
    @BeforeEach
    void setUp() {
        multa = new Multa();
    }

    @Test
    public void teste5anosMenos120() {
        multa.multas(100, 4);
        int preco = multa.getPrecoMulta();
        Assertions.assertEquals(250, preco);
    }
    @Test
    public void teste5anosMais120() {
        multa.multas(130, 4);
        int preco = multa.getPrecoMulta();
        Assertions.assertEquals(500, preco);
    }
    @Test
    public void teste10anosMenos120() {
        multa.multas(100, 10);
        int preco = multa.getPrecoMulta();
        Assertions.assertEquals(350, preco);
    }
    @Test
    public void teste10anosMais120() {
        multa.multas(130, 10);
        int preco = multa.getPrecoMulta();
        Assertions.assertEquals(700, preco);
    }
    @Test
    public void testeMais10anosMenos120() {
        multa.multas(100, 11);
        int preco = multa.getPrecoMulta();
        Assertions.assertEquals(700, preco);
    }
    @Test
    public void testeMais10anosMais120() {
        multa.multas(130, 11);
        int preco = multa.getPrecoMulta();
        Assertions.assertEquals(1400, preco);
    }
    
}
