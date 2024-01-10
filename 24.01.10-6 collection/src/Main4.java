import java.util.ArrayList;
import java.util.Scanner;

//사용자에게 0이하의 정수를 입력할때까지 여러번
//입력받아 순서대로 모든 정수 출력하기

public class Main4 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("input");
			int num = scan.nextInt();
			
			if(num>0) {
				number.add(num);
			}
			else {
				break;
			}
		}
		System.out.println(number.toString());
	}
}
