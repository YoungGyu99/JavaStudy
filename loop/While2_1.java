package loop;

public class While2_1 {

	public static void main(String[] args) {
		/* while문2
		 * 문제: 1부터 하나씩 증가하는 수를 3번 더해라(1 ~ 3 더하기)
		 * 이 문제는 1부터 하나씩 증가하는 수이기 때문에 1 + 2 + 3을 더해야 한다
		 * */
		int sum = 0;
		sum = sum + 1;
		System.out.println("i=" + 1 + " sum" + sum);
		
		sum = sum + 2;
		System.out.println("i=" + 2 + " sum" + sum);

		sum = sum + 3;
		System.out.println("i=" + 3 + " sum" + sum);
		
		// 이런식으로 하는경우 정답이긴 하지만 변경에 유연하지 않다는 단점이 있다.
	}

}
