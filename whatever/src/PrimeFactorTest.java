import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void input2Output2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2", result);
    }
    
    @Test
    public void input3Output3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3", result);
    }
    
    @Test
    public void input4Output2And2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("22", result);
    }
    
    @Test
    public void input6Output2And3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23", result);
    }
    
    @Test
    public void input8Output2And2And2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        assertEquals("222", result);
    }
    
    @Test
    public void input10Output2And5() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("25", result);
    }
    
    @Test
    public void input12Output2And2And3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        assertEquals("223", result);
    }


}
