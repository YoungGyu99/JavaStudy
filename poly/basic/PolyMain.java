package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		// 부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		// 자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> Child");
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		/*- 자식 타입의 변수가 자식 인스턴스를 참조한다.
		 *- Child child = new Child()
		 *- Child 인스턴스를 만들었다. 이 경우 자식 타입인 Child를 생성했기 때문에 메모리 상에 Child와 Parent가 모두 생성된다.
		 *- 생성된 참조값을 Child 타입의 변수인 child에 담아둔다.
		 *- child.childMethod()를 호출하면 인스턴스의 Child 클래스에 있는 childMethod()가 호출된다.
		 * */
		
		//부모 변수가 자식 인스턴스 참조(다형적 참조)
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		poly.parentMethod();
		/*- 부모 타입의 변수가 자식 인스턴스를 참조한다.
		 *- Parent poly = new Child()
		 *- Child 인스턴스를 만들었다. 이 경우 자식 타입인 Child를 생성했기 때문에 메모리 상에 Child와 Parent가 모두 생성된다.
		 *- 생성된 참조값을 Parent 타입의 변수인 poly에 담아둔다.
		 * */
		
//		Child child1 = new Parent(); //자식은 부모를 담을 수 없다.
		//자식의 기능은 호출할 수 없다. 컴파일 오류 발생 
//		poly.childMethod();
	}

}
