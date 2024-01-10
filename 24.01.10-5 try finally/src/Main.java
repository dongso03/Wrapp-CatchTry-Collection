
public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("s1");
			System.out.println(10/0);
			System.out.println("s2");
			System.out.println("s3");
			
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("반드시 실행되어야하는 막문장");
			System.out.println("finally block");
		}
		System.out.println("system out");
	}

}
