package operator;

public class Operator3 {

	public static void main(String[] args) {
		// 연산자 우선순위
		// 괄호를 넣으면 그 부분이 우선으로 계산된다
		int sum1 = 1 + 2 * 3; // 1 + (2 * 3)
		int sum2 = (1 + 2) * 3;
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		
	}

}
