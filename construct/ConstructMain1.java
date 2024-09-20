package construct;

public class ConstructMain1 {

	public static void main(String[] args) {
		/*생성자 호출
		 * 생성자는 인스턴스를 생성하고 나서 즉시 호출된다. 생성자를 호출하는 방법은 다음과 같이 new명령어 다음에 생성자 이름과 매개변수에 맞춰 인수를 전달하면 된다.
		 * new 생성자이름(생성자에 맞는 인수 목록)
		 * new 클래스이름(생성자에 맞는 인수 목록)
		 * 
		 * 생성자 장점
		 * -중복 호출 제거
		 * 생성자가 없던 시설에는 생성 직후에 어떤 직업을 수행하기 위해 다음과 같이 메서드를 직접 한번 더 호출해야 했다. 생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.
		 *
		 *- 제약 생성자 호출 필수
			initMember(…)를 실수로 호출하지 않아도 프로그램은 작동한다. 하지만 회원의 이름과 나이, 성적 데이터가 없는 상태로 프로그램이 동작하게 된다. 만약에 이 값들을 필수로 반드시 입력해야 한다면, 시스템에 큰 문제가 발생할 수 있다. 
			결국 아무 정보가 없는 유령 회원이 시스템 내부에 등장하게 된다.
			생성자 덕분에 회원의 이름, 나이, 성적은 항상 필수로 입력하게 된다. 따라서 아무 정보가 없는 유령 회원이 시스템 내부에 등장할 가능성을 원천 차단한다.
			
			좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
		 * */
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);// 이렇게 하면 인스턴스를 생성하고 즉시 해당 생성자를 호출한다. 여기서는 Member 인스턴스를 생성하고 바로 MemberConstruct(String name, int age, int grade) 생성자를 호출한다.
		MemberConstruct member2 = new MemberConstruct("user2", 16, 80);// new 키워드를 사용해서 객체를 생성할 때 마지막에 기호()도 포함해야 한느 이유가 바로 생성자 때문이다. 객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함한다.
		
		MemberConstruct[] members = {member1, member2};

		
		for (MemberConstruct s : members) {
			System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
		}
	}

}
