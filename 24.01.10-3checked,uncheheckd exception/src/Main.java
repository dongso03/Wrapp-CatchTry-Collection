import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
		throw new IOException();
		
		} catch (IOException e ) {
			System.out.println("쳌드 예외는 예외처리가 필요합니다.");
		}
//		throw new Exception();
	}
}

