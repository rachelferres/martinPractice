package uk.ac.belfastmet.examPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RevisionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsPalindrome() {
		Revision revision = new Revision();
		boolean result = revision.isPalindrome("hannah");
		
		assertEquals(true, result);
	}
	
	@Test
	public void testIsPalindrome2() {
		Revision revision = new Revision();
		boolean result = revision.isPalindrome("martin");
		
		assertEquals(false, result);
	}

}
