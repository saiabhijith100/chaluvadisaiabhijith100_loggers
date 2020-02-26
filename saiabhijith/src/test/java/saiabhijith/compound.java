package saiabhijith;

import static org.junit.Assert.*;

import org.junit.Test;

public class compound {
	private static final double DELTA=1e-15;

	@Test
	public void test() {
		Compound_interst co=new Compound_interst();
		assertEquals(828.0000000000002,co.compound_interst(1200,30,2),DELTA);

	}

}
