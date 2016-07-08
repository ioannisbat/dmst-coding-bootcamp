package exercise_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_togreek {

	@Test
	public void test() {
		GreekNumerals test = new GreekNumerals();
		int  output = test.fromgreek("ig");
		assertEquals(13, output);
	}

}
