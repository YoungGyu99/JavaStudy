package array;

public class ArrayDi1 {

	public static void main(String[] args) {

		
		int[][] arr = new int[2][3]; //행2, 열3
		
		arr[0][0] = 1; //0행, 0열
		arr[0][1] = 2; //0행, 1열
		arr[0][2] = 3; //0행, 2열
		arr[1][0] = 4; //1행, 0열
		arr[1][1] = 5; //1행, 1열
		arr[1][2] = 6; //1행, 2열
		
		/*for문을 통해 행(row)를 반복해서 접근한다. 각 행 안에서 열(column)이 3개이므로 arr[row][0], arr[row][1],arr[row][2] 3번 출력한다. 이렇게 하면
		 * for문을 한번 도는 동안 3개의 열을 출력할 수 있다.
		 *  - row=0 의 for문이 실행되면 arr[0][0], arr[0][1], arr[0][2]로 1 2 3이 출력된다.
		 *  - row=1 의 for문이 실행되면 arr[1][0], arr[1][1], arr[1][2]로 4 5 6이 출력된다.
		 * */
		
		for (int row = 0; row < 2; row++) {
			System.out.print(arr[row][0] + " "); //0열 출력
			System.out.print(arr[row][1] + " "); //1열 출력
			System.out.print(arr[row][2] + " "); // 2열 출력
			System.out.println(); //한 행이 끝나면 라인을 변경한다.
			}
		
	}

}
