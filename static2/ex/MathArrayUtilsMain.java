package static2.ex;

import static  static2.ex.MathArrayUtils.sum;
import static  static2.ex.MathArrayUtils.average;
import static  static2.ex.MathArrayUtils.min;
import static  static2.ex.MathArrayUtils.max;

public class MathArrayUtilsMain {
	

	public static void main(String[] args) {

		/*문제2: 수학 유틸리티 클래스
		 * 다음 기능을 제공하는 배열용 수학 유틸리티 클래스(MathArrayUtils)를 만드세요.
		 * - snm(int[ array) : 배열의 모든 요솔르 더하여 합계를 반환합니다.
		 * - average(int[] arry): 배열의 모든 요소의 평균값을 계산합니다.
		 * - min(int[] array): 배열에서 최솟값을 찾습니다.
		 * - max(int[] array): 배열에서 최대값을 찾습니다.
		 * 
		 * 요구사항
		 * - MathArrayUtils는 객체를 생성하지 않고 사용해야 합니다. 누군가 실수로 MathArrayUtils의 인스턴스르 생성하지 못하게 막으세요
		 * - 실행 코드에 static import를 사용해도 됩니다.
		 * */
		
		int[] values = {1,2,3,4,5};
		System.out.println("sum= " + sum(values));
		System.out.println("average= " + average(values));
		System.out.println("min= " + min(values));
		System.out.println("max= " + max(values));

		
	}

}
