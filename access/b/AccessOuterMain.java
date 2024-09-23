package access.b;

import access.a.AccessData;

public class AccessOuterMain {

	public static void main(String[] args) {
		AccessData data = new AccessData();
		//public 호출 가능
//		data.defaultField =1;
		data.publicMethod();
		
		//다른 패키지 default 호출 불가
//		data.defaultField = 2; 패키지 a소속이기 때문에 패키지가 달라 호출 불가
//		data.defaultMethod();
		
		//private 호출 불가
//		data.privateField = 3;
//		data.privateMethod();
		
		data.innerAccess();//내부호출에서는 private를 포함한 모든 내용을 호출한다.
	}

}
