package co.kishore.day4.exception;

public class ArithemtcException {
	public static void main(String[] args) {

		int a = 13;
		int b = 0;
		int c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception : divided with zero");
		} finally {
			System.out.println(" the last block");
		}

	}

}
