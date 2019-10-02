package uk.ac.belfastmet.examPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		Temperatures temperatures = new Temperatures();
		boolean result = temperatures.icyHot(120, -1);
		
		assertEquals(true, result);
		//assertTrue(true);
	}
	
	@Test
	public void test2() {
		Temperatures temperatures = new Temperatures();
		boolean result = temperatures.icyHot(-1, 120);
		
		assertEquals(true, result);
	}
	
	@Test
	public void test3() {
		Temperatures temperatures = new Temperatures();
		boolean result = temperatures.icyHot(2, 120);
		
		assertEquals(false, result);
	}
}
