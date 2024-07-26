package cond;

public class If1 {

	public static void main(String[] args) {
		/*FI문 1 - if, else
		 * 조건문 시작
		 * 
		 * if문은 특정 조건이 참인지 확인하고, 그 조건이 참(true)일 경우 특정 코드 블록을 실행한다.
		 * java
		 * if (condition) {
		 *  조건이 참일 때 실행되는 코드
		 *  }
		 * */
		
		int age = 15; //사용자 나이
		
		if (age >= 18) {
			System.out.println("성인입니다.");
		}
		if (age  < 18 )	{
			System.out.println("미성년자입니다.");
		}
	}

}
