package access.a;

public class AccessInnerMain {

	public static void main(String[] args) {
		AccessData data = new AccessData();
		//public 호출 가능
		data.defaultField =1;
		data.publicMethod();
		
		//같은 패키지 default 호출 가능
		data.defaultField = 2;
		data.defaultMethod();
		
		//private 호출 불가
//		data.privateField = 3;
//		data.privateMethod();
		
		data.innerAccess();//내부호출에서는 private를 포함한 모든 내용을 호출한다.
	}

}
