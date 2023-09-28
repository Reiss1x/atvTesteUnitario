import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.reis1x.RomanNumeral;
public class RomanNumeralTest {
    private RomanNumeral rm = null;
   
    
    @BeforeEach
    void setUp() {
    
        rm = new RomanNumeral();
    }
    @Test
    public void conversaoBasica1() {
        int ch = rm.convert("I");
        assertEquals(1, ch);
    }
    @Test
    public void conversaoBasica4() {
        int ch = rm.convert("V");
        assertEquals(5, ch);
    }
    @Test
    public void conversaoBasica10() {
        int ch = rm.convert("X");
        assertEquals(10, ch);
    }
    @Test
    public void conversaoBasica50() {
        int ch = rm.convert("L");
        assertEquals(50, ch);
    }
    @Test
    public void conversaoBasica100() {
        int ch = rm.convert("C");
        assertEquals(100, ch);
    }
    @Test
    public void conversaoBasica500() {
        int ch = rm.convert("D");
        assertEquals(500, ch);
    }
    @Test
    public void conversaoBasica1000() {
        int ch = rm.convert("M");
        assertEquals(1000, ch);
    }
    @Test
    public void numerosCompostos(){
        int ch = rm.convert("IV");
        assertEquals(4, ch);
    }
    @Test
    public void numerosCompostos2(){
        int ch = rm.convert("XC");
        assertEquals(90, ch);
    }
    @Test
    public void numerosGrandes(){
        int ch = rm.convert("MMMCMXCIX");
        assertEquals(3999, ch);
    }
}
