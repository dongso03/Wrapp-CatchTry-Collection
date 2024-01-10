import java.util.ArrayList;

public class Main5 {
	public static void main(String[] args) {
		ArrayList<Object> forAll = new ArrayList<Object>(); //이렇게하거나 제네릭을 아예 없앨수있다.
		forAll.add(100);
		forAll.add(55.55);
		forAll.add("hi");
		
		Object o = forAll.get(0);
		
		
		ArrayList<Double> list = new ArrayList<>();
		
		list.add(1.0);
		list.add((double) 55);
		list.add(Double.valueOf(55).doubleValue());
		//list.add("zzz");
		
		
		
	}
}
