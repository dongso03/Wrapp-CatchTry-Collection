
public class TestRef {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(10);
		
		System.out.println(i1== i2); //참조가 같은지 물어보는거
		System.out.println(i1.equals(i1));
		
		Integer i3 = new Integer(10); // 새롭게 생성해서 참조값이 다르다.
		
		System.out.println(i1 == i3);
		System.out.println(i1.equals(i3));
	
	//	i1 = i1+50; >>새참조를해서 참조변경이 일어난것
	}
}
