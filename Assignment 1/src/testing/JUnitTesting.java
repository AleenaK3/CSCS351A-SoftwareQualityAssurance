package testing;

public class JUnitTesting {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}	
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(double num1, double num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("Number can't be divided by Zero!");
		}
		return num1 / num2;
	}
	
	public String reverse(String word) {
		String rvre = "";
		for(int i=word.length()-1; i>=0; i--) {
			rvre = rvre + word.charAt(i);
		}
		return rvre;
	}
	
	public String evenOdd(int number) {
		String result="";
		if(number % 2 == 0) {
			result = "even";
		}
		else {
			result = "odd";
		}
		return result;
	}
}
