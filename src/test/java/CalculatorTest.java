

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.reis1x.Calculator;


public class CalculatorTest {
    private Calculator nf = null;
    
    @BeforeEach
    void setUp() {
    
        nf = new Calculator();
    }
    @Test
    public void teste() {
        int num = nf.evaluate("151423+43736+423423515+9796789+23452345");
        Assertions.assertEquals(456867808, num);
    } 
}
