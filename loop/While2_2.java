package loop;

public class While2_2 {

	public static void main(String[] args) {
		/* while문2
		 * 문제: 10부터 하니씩 증가하는 수를 3번 더해라(10~12더하기)
		 * 이렇게 되면 10 + 11 + 12를 계산 해야 한다. 문제는 코드를 너무 많이 변경해야 한다는 점이다.
		 * 변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경된느 부분을 변수 i로 바꾸어보자.
		 * 문제 : i부터 하나씩 증가하는 수를 3번 더해라 (i~i+2 더하기)
		 * */
		int sum = 0;
		int i = 10;
		
		sum = sum + i;
		System.out.println("i=" + 1 + " sum" + sum);
		i ++;
		
		sum = sum + i;
		System.out.println("i=" + 2 + " sum" + sum);
		i ++;


		sum = sum +	i;
		System.out.println("i=" + 3 + " sum" + sum);
		
		// 이런식으로 하는경우 정답이긴 하지만 변경에 유연하지 않다는 단점이 있다.
	}

}
