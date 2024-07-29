package array;

public class ArrayDi4 {

	public static void main(String[] args) {


		int[][] arr= new int[2][3];
		

		int i = 1;
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = i++;
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + " "); //0열 출력

			}
			System.out.println(); //한 행이 끝나면 라인을 변경한다.
			
			/* - 중첩된 for문을 사용해서 값을 순서대로 입력한다.
			 * - arr[row][column] = i++ 후의 증감 연산자(++)를 사용해서 값을 먼저 대입한 다음에 증가한다.
			 * 		코드에서 int i = 1 으로 i가 1부터 시작한다.
			 * 
			 * 2차원 배열 선언 부분인 new int[2][3]을 new int[4][5] 처럼 다른 숫자로 변경해도 잘 동작하는 것을 확인할 수 있다.
			 * */
	
		
		}
		
	}
}
