package net.yaliun.lvl_1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringExerciseTest {
	
	StringExercise middle;
	
	@Before
	public void setUp() {
		middle = new StringExercise();		
	}
	
	@Test
	public void getMiddleTest_1(){
		String word = "test";		
		assertEquals(middle.getMiddle(word), "es");
	}

	@Test
	public void getMiddleTest_2(){
		String word = "power";		
		assertEquals(middle.getMiddle(word), "w");
	}

	@Test
	public void getMiddleBest_1(){
		String word = "power";		
		assertEquals(middle.getMiddleBest(word), "w");
	}

	@Test
	public void getMiddleBest_2(){
		String word = "power";		
		assertEquals(middle.getMiddleBest(word), "w");
	}
}
