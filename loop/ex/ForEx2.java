package loop.ex;

public class ForEx2 {

	public static void main(String[] args) {
		/*문제: 짝수 출력
		 * 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, num이라는 변수를 사용하여 수를 표현해야 합니다.
		 while문, for문 2가지 버전의 정답을 만들어야 한다.
		 * */
		for(int num = 2, count = 1; count <= 10; num +=2, count ++ ) {
			System.out.println(num);
		}
				


	}

}
