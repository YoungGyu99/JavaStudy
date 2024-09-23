package access.a;

public class PublicClassInnerMain {

	public static void main(String[] args) {
		
		PublicClass publicClass = new PublicClass();
		DefaultClass1 class1 = new DefaultClass1(); //패키지 위치가 같기 때문에 default 접근이 가능하다
		DefaultClass2 class2 = new DefaultClass2();
	}

}
