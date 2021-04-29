package br.com.projuris.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyFindCharTest {
	
	private MyFindChar myFindChar = new MyFindChar();
	
	@Test
	public void findCharHappyDayTest() {
		assertEquals(this.myFindChar.findChar("stress"), 't');
		assertEquals(this.myFindChar.findChar("reembolsar"), 'm');
		assertEquals(this.myFindChar.findChar("tree"), 't');
		assertEquals(this.myFindChar.findChar("table"), 't');
	}
	
	@Test
	public void findCharBadDayTest() {
		assertEquals(this.myFindChar.findChar("aaaaa"), ' ');
		assertEquals(this.myFindChar.findChar(""), ' ');
		assertEquals(this.myFindChar.findChar(" "), ' ');		
	}
}
