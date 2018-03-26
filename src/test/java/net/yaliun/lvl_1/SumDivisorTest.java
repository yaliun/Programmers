package net.yaliun.lvl_1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SumDivisorTest {
	SumDivisor divisor;
	
	@Before
	public void setUp() {
		divisor = new SumDivisor();		
	}
	
	@Test
	public void sumDivisorTest_1(){
		
		assertEquals(divisor.sumDivisor(12), 28);
	}
	
	@Test
	public void sumDivisorTest_2(){
		
		assertEquals(divisor.sumDivisor(50), 93);
	}

	@Test
	public void sumDivisorBestTest_1(){
		
		assertEquals(divisor.sumDivisorBest(12), 28);
	}
	
	@Test
	public void sumDivisorBestTest_2(){
		
		assertEquals(divisor.sumDivisorBest(50), 93);
	}
}
