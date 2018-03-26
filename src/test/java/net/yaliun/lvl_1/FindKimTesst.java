package net.yaliun.lvl_1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindKimTesst {
	FindKim findKim;
	
	@Before
	public void setUp() {
		findKim = new FindKim();		
	}
	
	@Test
	public void findKimTest_1(){
		String[] names = {"Queen", "Tod","Kim"};
		assertEquals(findKim.findKim(names), "김서방은 2에 있다");
	}

	@Test
	public void findKimTest_2(){
		String[] names = {"Queen", "Kim","Chung","Park"};
		assertEquals(findKim.findKim(names), "김서방은 1에 있다");
	}

	@Test
	public void findKimBestTest_1(){
		String[] names = {"Queen", "Tod","Kim"};
		assertEquals(findKim.findKimBest(names), "김서방은 2에 있다");
	}

	@Test
	public void findKimBestTest_2(){
		String[] names = {"Queen", "Kim","Chung","Park"};
		assertEquals(findKim.findKimBest(names), "김서방은 1에 있다");
	}
}
