
class MyClass {
	public void step1() {
		step2();
	}

	public void step2() {
		try {
			step3();
		} catch (Exception e) {
		}
	}
	public void step3() {
		throw new RuntimeException();
	}
}

public class Main {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.step1();
	}
}
