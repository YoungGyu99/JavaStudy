package loop;

public class While1_2 {

	public static void main(String[] args) {
		/*반복문 시작
		 * while (조건식) {
		 *  //코드
		 *  }
		 *  - 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
		 *  - 조건식이 참이면 코드 블럭을 실행한다. 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다. (무한박복)
		 */
		int count = 0;
		
		//count=1
		
		while (count < 100) { // true일때만 실행되면 false가 나오면 코드를 무시하고 while문 끝으로 이동한다.
			count = count + 1;
			System.out.println("현재 숫자는:" + count);

		

	}

}
	}
