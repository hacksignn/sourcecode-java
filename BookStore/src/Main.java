class Base {
	protected void call() {
		System.out.println("Call from Base");
	}
}

class Sub extends Base {

	@Override
	protected void call() {
		super.call();
		System.out.println("Call from Sub");
	}
	
}

public class Main {

	public static void main(String[] args) {
		Sub x = new Sub();
		x.call();

	}

}
