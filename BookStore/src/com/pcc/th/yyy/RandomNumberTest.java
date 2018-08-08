package com.pcc.th.yyy;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomNumberTest {

	@Test
	public void test() {
		Random random = new Random5();
		RandomNumber p = new RandomNumber();
		assertEquals(5,  p.generate(random));
	}

}

class Random5 extends Random {
	@Override
	public int nextInt(int arg0) {
		return 5;
	}
}