package stringManupulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestStringManipulatorClass3 {

	StringManipulatorClass3 sm = new StringManipulatorClass3();
	
	
	@Test
	public void testIsPalindrome()
	{
		assertEquals(true, sm.isPalindrome("EEE"));
	}
	@Test
	public void testIsPalindromeNot()
	{
		assertEquals(false, sm.isPalindrome("CSE"));
	}
	@Test
	public void testRemoveExtraSpaces()
	{
		assertEquals("My name is sumaiya", sm.removeExtraSpaces("My  name  is   sumaiya"));
	}
}
