package net.yaliun.lvl_1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DivisibleTest {
	Divisible div;
	
	@Before
	public void setUp() {
		div = new Divisible();		
	}
	
	@Test
	public void divisible_1(){
		int[] array = { 5, 9, 7, 10 };
		assertArrayEquals(div.divisible(array, 5), new int[]{5,10});
	}

	@Test
	public void divisible_2(){
		int[] array = { 3, 6, 7, 12, 15};
		assertArrayEquals(div.divisible(array, 3), new int[]{3,6,12,15});
	}

	@Test
	public void divisibleBest_1(){
		int[] array = { 5, 9, 7, 10 };
		assertArrayEquals(div.divisibleBest(array, 5), new int[]{5,10});
	}

	@Test
	public void divisibleBest_2(){
		int[] array = { 3, 6, 7, 12, 15};
		assertArrayEquals(div.divisibleBest(array, 3), new int[]{3,6,12,15});
	}
}
