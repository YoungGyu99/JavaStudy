package extends1.super2;

public class ClassC  extends ClassB {
	/* - ClassC는 ClassB를 상속 받았다. ClassB 다음두 생성자가 있다.
	 * 		ClassB(int a)
	 * 		ClassB(int a, int b)
	 * - 생성자는 하나만 호출할 수 있다. 두 생성자 중에 하나를 선택하면 된다.
	 * 		super(10, 20)를 통해 부모 클래스의 ClassB(int a, int b) 생성자를 선택했다.
	 * - 참고로 ClassC의 부모인 ClassB에는 기본 생성자가 없다. 따라서 부모의 기본 생성자를 호출하는 super()를 사용하거나 생략할 수 없다.
	 * 
	 * 
	 * 정리
	 * - 상속 관계의 생성자 호출을 결과적으로 부모에서 자식 순서로 실행된다. 따라서 부모의 데이터를 먼저 초기화하고 그 다음에 자식의 데이터를 초기화한다.
	 * - 삭속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super(...)를 호출해야 한다. 단 기본 생성자 (super())인 경우 생략할 수 있다.
	 * */
	public ClassC() {
		super(10, 20); // 생성자를 하나라도 선언할 경우 기본생성자는 자동으로 만들어지 지지 않기 때문에 생성자를 직접 선언해주어야 한다.)
		System.out.println("ClassC 생성자");
	}

}
