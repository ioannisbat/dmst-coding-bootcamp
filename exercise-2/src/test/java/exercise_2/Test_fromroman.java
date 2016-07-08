package exercise_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_fromroman {

	@Test
	public void test() {
		RomanNumerals test = new RomanNumerals();
		int  output = test.fromroman("XLII");
		assertEquals(42, output);
	}
}
