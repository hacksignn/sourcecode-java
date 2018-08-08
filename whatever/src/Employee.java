class Employee2 {
	private static int counter;
	public void count() {
		counter++;
	}
	public void showResult() {
		System.out.println(counter);
	}
}

public class Employee {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.count();
		Employee2 e2 = new Employee2();
		e2.count();
		e1.showResult();
		e2.showResult();
	}
}
