package net.yaliun.lvl_1;
import static org.junit.Assert.*;

import org.junit.Test;

public class GetMinMaxStringTest {

	@Test
	public void getMinMaxStringTest_1(){
		String str = "1 2 3 4";
		
		GetMinMaxString minMax = new GetMinMaxString();
		
		assertEquals(minMax.getMinMaxString(str), "1 4");
	}
	
	@Test
	public void getMinMaxStringTest_2(){
		String str = "-1 -2 -3 -4";
		
		GetMinMaxString minMax = new GetMinMaxString();
		
		assertEquals(minMax.getMinMaxString(str), "-4 -1");
	}

}
