import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = 1;
		int b = 0;
		try {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a / b);
		}//catch(RuntimeException e) {  << 부모클래스로 잡으려면 아래쪽으로 이동해야한다.
			
		//}
	catch (ArithmeticException e) {
			System.out.println("exceptoin occuerd");
			System.out.println("cannt divide 0");
//			System.out.println(a);
//			System.out.println(b);

		} catch (InputMismatchException e) {
			System.out.println("정수입력해라");
		}catch(RuntimeException e) {  
			System.out.println("Runtimeexception occured");
		}
//		System.out.println(a);
//		System.out.println(b);
	}
}
