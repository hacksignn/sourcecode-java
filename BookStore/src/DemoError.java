
public class DemoError {

	public static void main(String[] args) {
		DemoError e1 = new DemoError();
		e1.processProactive(0);
		double r = e1.processReactive(0);
		System.out.println(r);
	}

	double processReactive(int input) {
		try {
			return 10 / input;
		} catch (ArithmeticException e) {
			System.out.println("cannot divie by zero");
		}
		return -1;
	}

	double process1(int input) {
		return 10 / input;
	}

	double processProactive(int input) {
		// Fail fast
		if (input == 0) {
			return -1;
		}

		return 10 / input;
	}
}
