package stringManupulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestStringManipulatorClass2 {

	StringManipulatorClass2 sm = new StringManipulatorClass2();
	
	@Test
	public void testCapitalizeWords()
	{
		assertEquals("My Name Is Sumaiya", sm.capitalizeWords("my name is sumaiya"));
	}
	@Test
	public void testCapitalizeWordsPunctuations()
	{
		assertEquals("My Name! Is@ Sumaiya%", sm.capitalizeWords("my name! is@ sumaiya%"));
		
	}
	@Test
	public void testCapitalizeWordsNumbers()
	{
		assertEquals("My Name6 Is8 Sumaiya546", sm.capitalizeWords("my name6 is8 sumaiya546"));
		
	}
	@Test
	public void testRemoveNumber()
	{
		assertEquals("sumaiya", sm.removeNonAlphabetic("sumaiya546"));
	}
	@Test
	public void testRemovePunctuation()
	{
		assertEquals("sumaiya", sm.removeNonAlphabetic("sumaiya5%$^"));
	}
	@Test
	public void testRemoveNull()
	{
		assertEquals("sumaiya", sm.removeNonAlphabetic("suma iy a5%$^"));
	}
	@Test
	public void testcontainsSubstring()
	{
		assertEquals(true, sm.containsSubstring("Computer Science Engineering","Eng"));
	}
	@Test
	public void testContainsSubstringNull()
	{
		assertEquals(false, sm.containsSubstring("Computer Science Engineering","zara"));
	}
	@Test
	public void testContainsSubstringPunctuation()
	{
		assertEquals(true, sm.containsSubstring("Computer Science Engineering!!!","!!!"));
	}
	@Test
	public void testContainsSubstringNumber()
	{
		assertEquals(true, sm.containsSubstring("Computer Science Engineering123","123"));
	}
	@Test
	public void testMergeStrings()
	{
		assertEquals("Sumaiya", sm.MergeStrings("Suma","iya"));
	}
	
	
	
}
