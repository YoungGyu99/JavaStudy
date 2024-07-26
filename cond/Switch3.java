package cond;

public class Switch3 {

	public static void main(String[] args) {
		
		int grade = 2;
		 int coupon;
		 switch (grade) {
		 case 1:
		 		coupon = 1000;
		 		break;
		 case 2:
		 case 3:
			 coupon = 3000;
			 break;
		default:
			coupon = 500;
			
		 }
		 System.out.println("발급받은 쿠폰" + coupon);

	}

}
/* 2등급의 경우 break문이 없어 바로 case 3으로 실행되어 발급받은 쿠폰은 3000으로 나온다.*/
