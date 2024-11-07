package poly.basic;

public class CastingMain1 {

	public static void main(String[] args) {
		//부모 변수가 자식 인스턴스 참조(다형적 참조)
		Parent poly = new Child(); // x001
		//단 자식의 기능은 호출할 수 없다.
//		poly.childMethod();
		
		// 다운캐스팅(부모 타입 - > 자식타입)
		Child child = (Child) poly;//x001 부모타입인 poly를 자식타입으로 변경할 수 있다.
		child.childMethod();
		/*부모 타입을 사용하는 변수를 자식 타입에 대입하려고 하면 컴파일 오류가 발생한다. 자식은 부모를 담을 수 없다. 이때는 다운캐스팅이라는 기능을 사용해 부모 타입을 잠깐 자식타입으로 변경하면 된다.
		 * (타입)처럼 괄호와 그 사이에 타입을 지정하면 참조 대상을 특정타입으로 변경할 수 있다. 이렇게 타입으로 변경하는 것을 캐스팅이라고 한다.
	*/
	}

}
