package loop;

public class For2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int endNum = 3;
		
		//1+2+3 = 6
		for (int i = 1; i <= endNum; i++ ) {
			sum = sum + i;
			System.out.println("i=" + i + " sum=" + sum);	
		}
	}

}
/* for문2
 * for문 구조
 * for (초기식; 조건식; 증감식){
 *	// 코드
 *}
 *for문에서 초기식, 조건식, 증감식은 서택이다. 다음과 같이 모드 생략해도 된다. 단 생략해도 각 영역을 구분하는 세미콜론(;)은 유지해야한다.
 *
 *for (;;) {
 *	//코드
 *}
 *이렇게 하면 조건이 없기 때문에 무한 반복하는 코드가 된다. 따라서 다음과 같은 코드가 된다.
 *
 *while (true){
 *		// 코드
 * }
 *
 *
 *
 * */
