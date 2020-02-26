package saiabhijith;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {
	private static final double DELTA=1e-15;
	@Test
	public void test() {
		SimpleInterst co=new SimpleInterst();
		assertEquals(800,co.simpleinterst(2000,10,4),DELTA);
	}

}
