package exercise_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_fromgreek {

	@Test
	public void test() {
		GreekNumerals test = new GreekNumerals();
		assertEquals("pa", test.togreek(81));
	}

}
