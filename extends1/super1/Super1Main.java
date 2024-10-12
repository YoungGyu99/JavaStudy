package extends1.super1;

public class Super1Main {

	public static void main(String[] args) {
		/* - this는 자기 자신의 참조를 뜻한다. this는 생략할 수 있다.
		 * - super 는 부모 클래스에 대한 참조를 뜻한다. 부모 필드에 있는 내용을 호출해야할 때 사용
		 * - 필드 이름과 메서드 이름이 같지만 super를 사용해서 부모 클래스에 있는 기능을 사용할 수 있다.
		 **/
		

		Child child = new Child();
		child.call();
		}
	}


