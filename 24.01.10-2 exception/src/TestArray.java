
public class TestArray {
	public static void main(String[] args) {
		int[] arr = { 100, 200, 300 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스범위 벗어남");
		}
	}
}
