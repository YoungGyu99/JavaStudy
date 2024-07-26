package loop;

public class While1_1 {

	public static void main(String[] args) {
		/*반복문 시작
		 * 반복문은 이름 그대로 특정 코드를 반복해서 실행할 때 사용한다.
		 * 자바는 다음 3가지 종류의 반복문을 제공한다.
		 * while, do-while, for
		 * 
		 * while문은 조건에 따라 코드를 반복해서 실행할 때 사용한다
		 * 
		 * while (조건식) {
		 *  //코드
		 *  }
		 *  - 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
		 *  - 조건식이 참이면 코드 블럭을 실행한다. 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다. (무한박복)
		 */
		int count = 0;
		
		count = count + 1;
		System.out.println("현재 숫자는:" + count);
		count = count + 1;
		System.out.println("현재 숫자는:" + count);
		count = count + 1;
		System.out.println("현재 숫자는:" + count);

		

	}

}
