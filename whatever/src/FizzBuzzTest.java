import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void input1Output1() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
    }
    
    @Test
    public void input2Output2() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }
    
    @Test
    public void input3OutputFizz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input4Output4() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(4);
        assertEquals("4", result);
    }
    
    @Test
    public void input5OutputBuzz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void input6OutputFizz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(6);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input7Output7() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(7);
        assertEquals("7", result);
    }
    
    @Test
    public void input8Output8() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(8);
        assertEquals("8", result);
    }
    
    @Test
    public void input9OutputFizz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(9);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input10OutputBuzz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(10);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void input11Output11() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(11);
        assertEquals("11", result);
    }

    @Test
    public void input12OutputFizz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(12);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void input13Output13() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(13);
        assertEquals("13", result);
    }
    
    @Test
    public void input14Output14() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(14);
        assertEquals("14", result);
    }
    
    @Test
    public void input15OutputFizzBuzz() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result);
    }
    
    @Test
    public void input16Output16() {
        FizzBuzz fz= new FizzBuzz();
        String result = fz.sendAndReturn(16);
        assertEquals("16", result);
    }
}
