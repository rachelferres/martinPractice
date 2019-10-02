package uk.ac.belfastmet.examPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BracketsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String result = Brackets.balancesBrackets2("[()]");
		
		assertEquals("Balanced", result);
	}
	
	@Test
	public void test2() {
		String result = Brackets.balancesBrackets2("{[]}");
		
		assertEquals("Balanced", result);
	}
	
	@Test
	public void test3() {
		String result = Brackets.balancesBrackets2("[]{}()");
		
		assertEquals("Balanced", result);
	}
	
	@Test
	public void test4() {
		String result = Brackets.balancesBrackets2("[)[)");
		
		assertEquals("Not Balanced", result);
	}
	@Test
	public void test5() {
		String result = Brackets.balancesBrackets2("()]()");
		
		assertEquals("Not Balanced", result);
	}
	@Test
	public void test6() {
		String result = Brackets.balancesBrackets2("[)(]");
		
		assertEquals("Not Balanced", result);
	}




}
