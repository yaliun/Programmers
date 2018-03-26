package net.yaliun.lvl_1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GetMinMaxStringTest {

	GetMinMaxString minMax;
	
	@Before
	public void setUp() {
		minMax = new GetMinMaxString();		
	}
	
	@Test
	public void getMinMaxStringTest_1(){
		String str = "1 2 3 4";		
		assertEquals(minMax.getMinMaxString(str), "1 4");
	}
	
	@Test
	public void getMinMaxStringTest_2(){
		String str = "-1 -2 -3 -4";
		
		minMax = new GetMinMaxString();		
		assertEquals(minMax.getMinMaxString(str), "-4 -1");
	}


	@Test
	public void getMinMaxStringBestTest_1(){
		String str = "1 2 3 4";
		
		minMax = new GetMinMaxString();		
		assertEquals(minMax.getMinMaxStringBest(str), "1 4");
	}
	
	@Test
	public void getMinMaxStringBestTest_2(){
		String str = "-1 -2 -3 -4";
		
		minMax = new GetMinMaxString();	
		assertEquals(minMax.getMinMaxStringBest(str), "-4 -1");
	}
}
