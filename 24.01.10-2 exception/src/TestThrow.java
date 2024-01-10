import javax.management.RuntimeErrorException;

class UnImplementExcetion extends RuntimeException{
	public UnImplementExcetion(String message) {
		super(message);
	}
}

interface YourWork {
	String doSomething();
}

class Impl implements YourWork{
	@Override
	public String doSomething() {
		throw new UnImplementExcetion("제가부족하여 아직 덜만들었습니다ㅠㅠㅗ");
	}
	
}

public class TestThrow {
	public static void main(String[] args) {
		YourWork ref = new Impl();
	String res=	ref.doSomething();
	
	if(res.length() !=0) {
		System.out.println(res);
	}
	}
}
