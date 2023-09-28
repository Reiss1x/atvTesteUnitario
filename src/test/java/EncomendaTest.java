import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.reis1x.Encomenda;

public class EncomendaTest {
    private Encomenda nf = null;
    
    @BeforeEach
    void setUp() {
    
        nf = new Encomenda();
    }
    @Test
    public void testeComPesoExato() {

        int [] num = nf.qtdadeBarras(10, 5, 23);
        Assertions.assertArrayEquals(new int[] {3,4}, num);
    }
    @Test
    public void teste2() {

        int [] num = nf.qtdadeBarras(10, 3, 23);
        Assertions.assertArrayEquals(new int[] {8,3}, num);
    }
    @Test
    public void testeComPesoMenor() {

        int [] num = nf.qtdadeBarras(10, 5, 20);
        Assertions.assertArrayEquals(new int[] {0,4}, num);
    }
    @Test
    public void testeComPesoMaior() {

        int [] num = nf.qtdadeBarras(1, 1, 50);
        Assertions.assertNull(num);
    }

}
