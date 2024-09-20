package construct;

public class MemberConstruct {

	/*생성자 도입
	 * 생성자와 메서드와 비슷하지만 다음과 같은 차이가 있다.
	 * - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
	 * - 생성자는 반환 타입이 없다. 비워두어야 한다.
	 * - 나머지는 메서드와 같다.*/
	
	String name;
	int age;
	int grade;
	
	MemberConstruct(String name, int age){ // 기존 MemberConstruct에 생서자를 하나 추가해서 생성자가 2개가 되었다.
		this(name, age, 50); //새로 추가한 생성자는 grade를 받지 않는다. 대신에 grade는 50점이 된다.
		/*this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다. 참고로 this는 인스턴스 자신의 참조값을 가리킨다. 그래서 자신의 생서자를 호출한다고 생각하면 된다
		 * this를 잘 사용하면 생성자 내부에서 다른 생서자를 호출할 수 있다. 이 부분을 잘 활용하면 지금과 같이 중복을 제거할 수 있다. 물론 결과는 기존과 같다.
		 * 
		 * this 규칙
		 * - this()는 생성자 코드의 첫줄에만 작성할 수 있다. */

	}
	
	MemberConstruct(String name, int age, int grade){
		System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
		
	}
}
