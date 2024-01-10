import java.util.ArrayList;
import java.util.Scanner;

//설문조사 집계 프로그램
// 인적사항(이름,전화번호)와
//응답 찬성,반대
//정보를 기록하는 프로그 램

//정보 기록, 응답 집계 총찬성 반대수 출력

// 단 동일인의 기록은 하나만 존재해야한다.
class Person2 {
	private String name;
	private String phone;
	private String yon;

	public Person2(String name, String phone, String yon) {
		super();
		this.name = name;
		this.phone = phone;
		this.yon = yon;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getYon() {
		return yon;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", phone=" + phone + ", 찬반=" + yon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

}

public class Poll {
	public static void main(String[] args) {
		int y = 0;
		int n = 0;

		ArrayList<Person2> list = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("종료를원하면 0을 누루세요");
			System.out.println("이름을 입력하세여");
			String name = scan.nextLine();
			if (name.equals("0")) {
				break;
			}
			System.out.println("전번을 입력하세여");
			String phone = scan.nextLine();
			System.out.println("설문내용에 찬성하십니까 반대하십니까? (찬성/반대)");
			String yOrN = scan.nextLine();
			// 위에서 이름 전화번호 찬성 정보 문자열 3개로 있음
			Person2 ps = new Person2(name, phone, yOrN);
			// 리스트에 위의 사람 정보가 있는지 살펴본다.
			if (!list.contains(ps)) {
				list.add(ps);
			}
			// 리스트에 사람 정보(객체)를 추가하는 것

		}

		for (Person2 e : list) {
			if (e.getYon().equals("찬성")) {
				y++;
			} else if (e.getYon().equals("반대")) {
				n++;
			}
		}

		System.out.println(list);
		System.out.println("찬성수: " + y);
		System.out.println("반대수: " + n);
	}
}
