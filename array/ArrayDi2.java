package array;

public class ArrayDi2 {

	public static void main(String[] args) {

		//리펙토링2
		int[][] arr = new int[2][3]; //행2, 열3
			arr[0][0] = 1; //0행, 0열
			arr[0][1] = 2; //0행, 1열
			arr[0][2] = 3; //0행, 2열
			arr[1][0] = 4; //1행, 0열
			arr[1][1] = 5; //1행, 1열
			arr[1][2] = 6; //1행, 2열
		
		// 2차원 배열의 길이를 활용
		for (int row = 0; row < arr.length; row++) { // arr.length는 행의 길이를 뜻한다.
			for (int column = 0; column < 3; column++) {
				System.out.print(arr[row][column] + " "); //0열 출력

			}
			System.out.println(); //한 행이 끝나면 라인을 변경한다.
	
		
		}
		
	}
}
