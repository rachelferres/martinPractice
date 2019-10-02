package uk.ac.belfastmet.examPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WelcomeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String result = Welcome.helloName("Rachel");
		
		assertEquals("Hello Rachel!", result);
	}

}
