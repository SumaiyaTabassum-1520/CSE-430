package stringManupulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestStringManipulatorClass1 {

	stringManipulatorClass1 sm= new stringManipulatorClass1();
	
	@Test
	public void testCalculateStringLength()
	{
		assertEquals(7, sm.calculateStringLength("Sumaiya"));
	}
	@Test
	public void testCalculateStringLengthNull()
	{
		assertEquals(0, sm.calculateStringLength(""));
	}
	@Test
	public void testCalculateStringLengthLong()
	{
		assertEquals(50, sm.calculateStringLength("asdfghjkiuytrweqfasdghjkertyuiwoytrewqwegsdhjdrtyu"));
	}
	@Test
	public void testReverseString()
	{
		assertEquals("ayiamus", sm.reverseString("sumaiya"));
	}
	@Test
	public void testReverseStringSpace()
	{
		assertEquals("ayi amus", sm.reverseString("suma iya"));
	}
	@Test
	public void testReverseStringNull()
	{
		assertEquals(" ", sm.reverseString(" "));
	}
	
	@Test
	public void testToLowerCaseMixChar()
	{
		assertEquals("sumaiya", sm.toLowerCase("SuMaIYA"));
	}
	@Test
	public void testToLowerCaseUppercase()
	{
		assertEquals("sumaiya", sm.toLowerCase("SUMAIYA"));
	}
	@Test
	public void testToLowerCasePunctuation()
	{
		assertEquals("!s@#$%^&*d", sm.toLowerCase("!S@#$%^&*d"));
	}
	@Test
	public void testToLowerCaseNumber()
	{
		assertEquals("sumaiya12345", sm.toLowerCase("SUMAIYA12345"));
	}
	@Test
	public void testCountOccurrences()
	{
		assertEquals(2, sm.countOccurrences("sumaiya",'a'));
	}
	@Test
	public void testCountOccurrencesPunctuation()
	{
		assertEquals(6, sm.countOccurrences("sumaiya!!!!!!",'!'));
	}
	@Test
	public void testCountOccurrencesNumber()
	{
		assertEquals(1, sm.countOccurrences("sumaiya1777888890",'0'));
	}
	@Test
	public void testCountOccurrencesNull()
	{
		assertEquals(2, sm.countOccurrences("su maiya17778888 90",' '));
	}
	
}


