package access.a;

public class AccessData {
	
	public int publicField;
	int defaultField;
	private int privateField;
	
	public void publicMethod() {
		System.out.println("publicMethod 호출" + publicField);
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod 호출" + defaultField);
	}
	private void privateMethod() {
		System.out.println("privateMethod 호출" + privateField);
	}
	public void innerAccess() { // 내부 호출을 보여주는 것으로 내부 호출은 자기 자신에게 접근한느 것이다. 따라서 private를 포함한 모든 곳에서 접근할 수 있다.
		System.out.println("내부 호출");
		publicField = 100;
		defaultField = 200;
		privateField = 300;
		publicMethod();
		defaultMethod();
		privateMethod();
	}
}
