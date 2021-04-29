package br.com.projuris.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyFindArrayTest {
	
	private MyFindArray myFindArray = new MyFindArray();
	
	@Test
	public void findArrayHappyDayTest() {
		assertEquals(this.myFindArray.findArray(new int[] {4,9,3,7,8}, new int[] {3,7}), 2);
		assertEquals(this.myFindArray.findArray(new int[] {1,3,5}, new int[] {1}), 0);		
		assertEquals(this.myFindArray.findArray(new int[] {4,9,3,7,8,3,7,1}, new int[] {3,7}), 5);		
		assertEquals(this.myFindArray.findArray(new int[] {4,3,7,8,3,5,1}, new int[] {3,7}), 1);
		assertEquals(this.myFindArray.findArray(new int[] {3,2,8,3,7,1,2,2}, new int[] {2}), 7);
		assertEquals(this.myFindArray.findArray(new int[] {0,3,3,0,3,0,3,0,0,3,0}, new int[] {0,3}), 8);
	}
	
	@Test
	public void findArrayBadDayTest() {		
		assertEquals(this.myFindArray.findArray(new int[] {7,8,9}, new int[] {8,9,10}), -1);		
		assertEquals(this.myFindArray.findArray(new int[] {4,9,3,1}, new int[] {} ), -1);
		assertEquals(this.myFindArray.findArray(new int[] {}, new int[] {}), -1);
		assertEquals(this.myFindArray.findArray(new int[] {}, new int[] {1,3}), -1);
	}
}
