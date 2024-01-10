import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		//collection
		
		// index 를 이용하여 순차적으로 접근 가능
		// 동적인 size(크기)를 가진다.
		//<> =>>generic
		ArrayList<String> list = new ArrayList<String>();
		list.add("elem1"); // 삽입(insert)
		list.add("elem2");
		list.add("elem3");
		
		System.out.println(list.size());
		//System.out.println(list.toString());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
	
}
