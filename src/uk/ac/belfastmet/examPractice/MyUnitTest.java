/**
 * 
 */
package uk.ac.belfastmet.examPractice;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author fer19171898
 *
 */
public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
		
		assertEquals("onetwo", result);
	}
	
	@Test
	public void testConcatenateNull() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("", "two");
		
		assertEquals("two", result);
	}
	
	@Test
	public void testConcatenateNoSpace() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
		
		assertNotEquals("one two", result);
	}
	
}
