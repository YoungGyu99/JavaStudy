package loop;

public class DoWhile2 {

	public static void main(String[] args) {
		/*do-while문은 while문과 비슷하지마느 조건에 상관없이 무조건 한번은 코드를 실행한다.
		 * 
		 * do-while문 구조
		 * do {
		 *		// 코드
		 *	} while (조건식);
		 * 조건에 만족하지 않아도 한 번은 현재 값을 출력하고 싶다고 할때 사용한다.
		 * */
		int i = 10;
		
		do {
			System.out.println("현재 숫자는:" + i); // do while문은 최초 한번은 무조건 실행하고 조건문을 검색 false 일경우 한번만 출력하지만 true 일경우 계속 실행
			i++;
		} while (i < 3); 

	}
	

}
// do-while문은 최초 한번은 코드 블럭을 꼭 실행해야 하는 경우에만 사용된다.
