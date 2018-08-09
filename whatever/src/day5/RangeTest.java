package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {

	@Test
	public void invalidInput() {
		MyRange range = new MyRange("1,5");
		assertFalse(range.checkFormat());
	}
	
	@Test
	public void validInput() {
		MyRange range = new MyRange("(1,5)");
		assertTrue(range.checkFormat());
	}
	
	@Test
	public void startWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.startWithInclude());
	}
	
	@Test
	public void startWithExclude() {
		MyRange range = new MyRange("(1,5]");
		assertTrue(range.startWithExclude());
	}
	
	@Test
	public void endWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.endWithInclude());
	}
	
	@Test
	public void endWithExclude() {
		MyRange range = new MyRange("(1,5)");
		assertTrue(range.endWithExclude());
	}
	
	@Test
	public void getFirstValue() {
		MyRange range = new MyRange("(1,5)");
		assertEquals("1", range.getFirstValue());
	}
	
	@Test
	public void getSecondValue() {
		MyRange range = new MyRange("(1,5)");
		assertEquals("5", range.getSecondValue());
	}
	
	@Test
	public void case1() {
		MyRange range = new MyRange("[1,5]");
		assertEquals("1,2,3,4,5", range.getResult());
	}
	
	@Test
	public void case2() {
		MyRange range = new MyRange("[1,5)");
		assertEquals("1,2,3,4", range.getResult());
	}
	
	@Test
	public void case3() {
		MyRange range = new MyRange("(1,5]");
		assertEquals("2,3,4,5", range.getResult());
	}
	
	@Test
	public void case4() {
		MyRange range = new MyRange("(1,5)");
		assertEquals("2,3,4", range.getResult());
	}

}
