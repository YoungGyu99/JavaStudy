package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {

	public static void main(String[] args) {
		/*- publicValue = 1: 부모의 public 필드에 접근한다. public이므로 접근할 수 있다.
		 *- protectedValue = 1: 부모의 protected 필드에 접근하다. 자식과 부모는 다른 패키지이지만, 상속관계이므로 접근할 수 있다.
		 *- defaultValue = 1: 부모의 default 필드에 접근한다. 자식과 부모가 다른 패키지이므로 접근할 수 없다.
		 *- privateValue = 1: 부모의 private 필드에 접근한다. private은 모든 외부 접근을 막으므로 자식이라도 호출할 수 없다.
		 * */

		Child child = new Child();
		child.call();
			
		}
	}


