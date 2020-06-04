package calculator;

public class Calculator {
	public void main(String [] args) {
		System.out.println("20 + 10 = " + addition(20,10));
		System.out.println("5 * 10 = " + multiplication(5,10));
		System.out.println("20 - 5 = " + subtraction(20, 5));
		System.out.println("30 / 5 = " + division(30, 5));
	
	}
	
	// Addition – which takes 2 numbers and returns the product.
		public int addition(int num1, int num2) {
			return num1 + num2;
		}

	// Multiplication – which takes 2 numbers and returns the product.
	public double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	// Subtraction – which takes 2 numbers, then returns the result of subtraction.
	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	// Division – which takes 2 numbers and returns the result of division
	public double division(double num1, double num2) {
		return num1 / num2;
	}
	
}
