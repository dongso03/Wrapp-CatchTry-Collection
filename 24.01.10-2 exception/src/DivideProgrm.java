import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideProgrm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("first");
			int fir = scan.nextInt();

			System.out.println("sec");
			int sec = scan.nextInt();
			
			System.out.println(fir / sec);
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("ArithmeticException occurd");
		}
	}
}
