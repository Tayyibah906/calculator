package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	public void addTest() {
		int result = calc.addition(5, 5);
		
		assertEquals(10, result);
	}
		
	@Test
	public void subTest() {
		double result = calc.subtraction(15, 5);
		
		assertEquals(10, result, 0.1);
	}
	
	@Test
	public void multiTest() {
		double result = calc.multiplication(5, 5);
		
		assertEquals(25, result, 0.1);
	}
	
	@Test
	public void divTest() {
		double result = calc.division(5, 5);
		
		assertEquals(1, result, 0.1);
	}
}
