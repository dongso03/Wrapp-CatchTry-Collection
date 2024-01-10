import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		// 정수원소 1,2,3을 가지는 어레이리스트 생성하기
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);  //오토박싱이 일어남
		list.add(2);
		list.add(Integer.valueOf(3));
		
		int firstElem = list.get(0);
		System.out.println(firstElem);
		
		System.out.println(list.size());
	
		list.clear();
		
		System.out.println(list.size());
	}
}
