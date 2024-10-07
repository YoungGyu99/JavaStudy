package static2;

public class DecoData {

	private int instanceValue;
	private static int staticValue;
	/* staticCall()메서드를 보자
	 * 이 메서드는 정적 메서드다. 따라서 static만 사용할 수 있다. 정적 변수, 정적 메서드에는 접근할 수 있지만, static이 없는인스턴스 변수나 인스턴스 메서드에 접근하면 컴파일 오류가 발생한다.
	 * 코드를 보면 staticCall() -> staticMethod()로 static에서 static을 호출하는 것을 확인할 수 있다.
	 * 
	 * instanceCall() 메서드를 보자
	 * 이 메서드는 인스턴스 메서드이다. 모든 곳에서 공용인 static을 호출할 수 있다. 따라서 정적 변수, 정적 메서드에 접근할 수 있다. 
	 * 물론 인스턴스 변수, 인스턴스 메서드에도 접근할 수 있다.
	 * 
	 * 정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유
	 * 정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그래서 인스턴스처럼참조값의 개념이 없다.
	 * 특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데, 정적 메서드는 참조값 없이 호출한다. 따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.
	 * */
	
	public static void staticCall() { //static은 static만 접근할 수 있다. 
//		instanceValue++; // 인스턴스 변수 접근, compile error 참조값을 알 수 없다.
//		instaneMethod(); //인스턴스 메서드 접근, compile error
		
		
		staticValue++; // 정적 변수 접근
		staticMethod(); //정적 메서드 접근
	}
	
	
	public void instanceCall() {
		instanceValue++; // 인스턴스 변수 접근  , 같은 클래스 이기때문에 클래스명은 생략해도 된다.
		instanceMethod(); //인스턴스 메서드 접근
		
		staticValue++; // 정적 변수 접근
		staticMethod(); //정적 메서드 접근
	}
	
	private void instanceMethod() {
		System.out.println("instanceValue=" + instanceValue);
	}
	private static void staticMethod() {
		System.out.println("staticValue=" + staticValue);
		
	}
}
