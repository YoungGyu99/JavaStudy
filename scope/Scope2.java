package scope;

public class Scope2 {

	public static void main(String[] args) {
		int m = 10;
		for (int i = 0; i < 2; i++) { //블록 내부, for문 내
			System.out.println("for m = " + m);
			System.out.println("for i = " + i);
		} //i 생존 종료
		
//		System.out.println("main i = " + i); 오류, i에 접근 불가
		System.out.println("main m = " + m);
	}

}
/* for문의 경우 for(int i=0;...) 과 같이 for 문 안에서 초기식에 직접 변수를 선언할 수 있따. 그리고 이렇게 선언한 변수는 for문 코드 블록안에서만 사용할 수 있다.*/
