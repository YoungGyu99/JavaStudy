package cond;

public class Switch1 {

	public static void main(String[] args) {
		/* 문제
		 * 단신은 회원 등급에 따라 다른 쿠폰을 발급한느 프로그램을 작성해야 한다.
		 * 이 프로그램은 int grade 라는 변수를 사용하며, 회원등급(grade)에 따라 다음의 쿠폰을 발급해야한다
		 * 1등급: 쿠폰 1000
		 * 2등급: 쿠폰 2000
		 * 3등급: 쿠폰 3000
		 * 위의 등급이 아닐 경우: 쿠폰 500
		 * 
		 * 각 쿠폰이 할당된 후에는 "발급받은 쿠폰" + 쿠폰값을 출력해야 한다. 
		 * 
		 * switch 문은 if문을 조금 더 편리학 ㅔ사용할 수있는 기능이다.
		 * 참고로 if문은 비교 연ㅅ나자를 상요할 수 있지만, switch문은 단순히 값이 같은지만 비교 할 수 있다.
		 * */
		
		 int grade = 2;
		 
		 int coupon;
		 if (grade == 1) {
		 	coupon = 1000;
		} else if (grade ==2) {
		 	coupon = 2000;
		} else if (grade == 3) {
			coupon = 3000;
		} else {
			coupon = 500;
		} 
		 System.out.println("발급받은 쿠폰" + coupon);
	}

}
