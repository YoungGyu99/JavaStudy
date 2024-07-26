package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 변수 초기화
		int a = 5;
		int b = 2;
		
		// 덧셈
		int sum = a + b;
		System.out.println("a + b = " + sum); // 출력 a + b =7
		
		// 뺄셈
		int diff = a - b;
		System.out.println("a - b = " + diff);
		
		// 곱셈
		int multi = a * b;
		System.out.println("a * b = " + multi);
		
		// 나누기
		int div = a / b; // 원래는 2.5가 나와야 하지만 int형은 소숫점을 표현하지 못하기 때문에 2라고 나온다.
		System.out.println("a / b = " + div);
		
		// 나머지
		int mod = a % b;
		System.out.println("a % b = " + mod);
		

	}

}
