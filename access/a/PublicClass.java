package access.a;

public class PublicClass {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		DefaultClass1 class1 = new DefaultClass1();
		DefaultClass2 class2 = new DefaultClass2();
				}

}

class DefaultClass1{ //default이기 때문에 같은 클래스 내부에서만 접근이 가능하다.
}

class DefaultClass2{
	
}