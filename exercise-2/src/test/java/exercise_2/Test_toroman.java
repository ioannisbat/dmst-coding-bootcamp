package exercise_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_toroman {

	@Test
	public void test() {
		RomanNumerals test = new RomanNumerals();
		assertEquals("XCVII", test.toroman(97));
	}

}
