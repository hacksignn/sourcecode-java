import static org.junit.Assert.*;

import org.junit.Test;

public class IsogramTest {

	@Test
	public void lumberjacks() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("lumberjacks"));
	}
	
	@Test
	public void background() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("background"));
	}
	
	@Test
	public void downstream() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("downstream"));
	}
	
	@Test
	public void sixYearOld() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("six-year-old"));
	}
	
	@Test
	public void emily() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("Emily Jung Schwartzkopf"));
	}
	
	@Test
	public void iterator() {
		Isogram isogram = new Isogram();
		assertFalse(isogram.check("Iterator"));
	}
	
	@Test
	public void aa() {
		Isogram isogram = new Isogram();
		assertFalse(isogram.check("Aa"));
	}

}
