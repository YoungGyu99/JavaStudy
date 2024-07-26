package cond;

public class If4 {

	public static void main(String[] args) {
		/* else if문은 앞선 if문의 조건이 거짓일 때 다음조건을 검사한다. 만약 앞선 if문이 참이라면 else if를 실행하지 않는다.
		 * 특정 조건이 만족하면 해당 코드를 실행하고 if문 전체를 빠져나온다. 특정 조건읆 ㅏㄴ족하지 않으면 다음 조건을 검사한다. 여기서 핵심은 순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면
		 * 딱 1개만 실행이 되는 것이다.*/
		
		int age = 5;
		
		if (age <= 7) {
			System.out.println("미취학");
		} else if (age <= 13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else { //아무것도 만족하지 않으면 else문 실행
			System.out.println("성인");
		}
	
}
	}

