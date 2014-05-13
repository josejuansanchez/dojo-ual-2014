package org.josejuansanchez.dojoual;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	RomanToArabic converter = new RomanToArabic();
	
	@Test
	public void when_i_then_1() {		
		int result = converter.roman_to_arabic("i");
		assertTrue(result == 1);
	}

	@Test
	public void when_v_then_5() {		
		int result = converter.roman_to_arabic("v");
		assertTrue(result == 5);
	}

	@Test
	public void when_x_then_10() {
		int result = converter.roman_to_arabic("x");
		assertTrue(result == 10);
	}	

	@Test
	public void when_l_then_50() {
		int result = converter.roman_to_arabic("l");
		assertTrue(result == 50);
	}	
		
	@Test
	public void when_c_then_100() {
		int result = converter.roman_to_arabic("c");
		assertTrue(result == 100);
	}	
	
	@Test
	public void when_d_then_500() {
		int result = converter.roman_to_arabic("d");
		assertTrue(result == 500);
	}	

	@Test
	public void when_m_then_1000() {
		int result = converter.roman_to_arabic("m");
		assertTrue(result == 1000);
	}

	@Test
	public void when_ii_then_2() {
		int result = converter.roman_to_arabic("ii");
		assertTrue(result == 2);
	}	
	
	@Test
	public void when_iii_then_3() {
		int result = converter.roman_to_arabic("iii");
		assertTrue(result == 3);
	}
	
	@Test
	public void when_iv_then_4() {
		int result = converter.roman_to_arabic("iv");
		assertTrue(result == 4);
	}		
	
	@Test
	public void when_vi_then_6() {
		int result = converter.roman_to_arabic("vi");
		assertTrue(result == 6);
	}
	
	@Test
	public void when_lxxx_then_80() {
		int result = converter.roman_to_arabic("lxxx");
		assertTrue(result == 80);
	}

	@Test
	public void when_mxxc_then_1080() {
		int result = converter.roman_to_arabic("mlxxx");
		assertTrue(result == 1080);
	}
	
	@Test
	public void when_mmxxc_then_2080() {
		int result = converter.roman_to_arabic("mmlxxx");
		assertTrue(result == 2080);
	}

	@Test
	public void when_cxl_then_140() {
		int result = converter.roman_to_arabic("cxl");
		assertTrue(result == 140);
	}
	
	@Test
	public void when_mmmxcviii_then_3098() {
		int result = converter.roman_to_arabic("mmmxcviii");
		assertTrue(result == 3098);
	}	
}