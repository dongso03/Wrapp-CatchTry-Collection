
public class TestNull {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("null 참조입니다");
		}
	}
}
