import java.util.InputMismatchException;
import java.util.Scanner;

public class PlusProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try{
			System.out.println("첫번째 ㅇㅇ");
			int first = scan.nextInt();

			System.out.println("2nd");
			int sec = scan.nextInt();
			
			System.out.println(first + sec);	
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("exception occurred");
		}
		

	}
}
