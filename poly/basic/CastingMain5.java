package poly.basic;

public class CastingMain5 {

	public static void main(String[] args) {
		
		Parent parent1= new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		
		Parent parent2= new Child();
		System.out.println("parent2 호출");
		call(parent2);
		
	}
	private static void call(Parent parent) {
		parent.parentMethod();
		if (parent instanceof Child) {
			System.out.println("Child 인스턴스 맞음");
			Child child = (Child) parent;
			child.childMethod();
		}
	}
	/*다운캐스팅을 수행하기전 먼저 instancef를 사용해 원하는 타입으로 변경이 가능한지 확인한 다음에 다운캐스팅을 수행하는 것이 안전하다.
	 * */

}
