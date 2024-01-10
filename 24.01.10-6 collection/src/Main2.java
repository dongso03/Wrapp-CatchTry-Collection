import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		strs.add("1st");
		strs.add("2nd");
		strs.add("3rd");
		
//		for (int i =0; i< strs.size();i++) {
//			System.out.println(strs.get(i));
//		}
//		for (String elem : strs) {
//			System.out.println(elem);
//		}
		Iterator<String> iter = strs.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
