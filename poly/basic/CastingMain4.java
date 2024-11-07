package poly.basic;

public class CastingMain4 {

	public static void main(String[] args) {
		
		Parent parent1 = new Child();
		Child child1 = (Child) parent1;
		child1.childMethod(); // 문제없음
		
		Parent parent2 = new Parent();
		Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
		child2.childMethod(); //실행 불가
		
		/*parent2 를 Child 타입으로 다운캐스팅한다. 그런데 parent2는 Parent로 생성이 되었다. 따라서 메모리 상에 CHild 자체가 존재하지 않는다. CHild 자체를 사용할 수 없는 것이다. 
		 * 자바에서는 이렇게 사용할 수 없는 타입으로 다운캐스팅하는 경우에 ClassCasstException 이라는 예외를 발생시킨다. 예외가 발생하면 다음 동작이 발생하지 않고, 프로그램이 종료된다. 따라서 child2.childMethod()코드 자체가 실행되지 않는다.
		 * 
		 * */

	}
	

}
