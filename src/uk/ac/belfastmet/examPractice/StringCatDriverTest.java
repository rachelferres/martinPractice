package uk.ac.belfastmet.examPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringCatDriverTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String result = StringCat.concatonate("Hello", "Rachel");
		
		assertEquals("Hello Rachel", result);
	}

}
