package calc;

public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

	public static float square(float num1) {
		return num1 * num1;
	}

	public static float cube(float num1) {
		return num1 * num1 * num1;
	}

	public static float power(float num1, float num2) {
			// num1 = 2; num2 = 4
    	float result = 1;
			// while 4 does not equal 0:
		while (num2 != 0) {
			// 2 = 1 * 2
		result *= num1;
			// minus minus 
		--num2;
    
		} return result;
	}

	public static float mod(float num1, float num2) {
		return num1 % num2;
	}
}