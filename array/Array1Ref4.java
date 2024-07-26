package array;

public class Array1Ref4 {

	public static void main(String[] args) {
 		
		int[] students =  {90, 80, 70, 60, 50}; // int형 배열을 선언하는 것을 자바가 알아서 인식해 허용을 해준다.

		
		//변수 값 사용
		for (int i = 0; i < students.length; i++) {
			System.out.println("학생"+(i + 1) + "점수:" + students[i]); // 숫자같은 경우 괄호를 넣지 않으면 숫자가 문자형으로 바뀌기 때문에 ()를 넣는다.
		}

		

	}

}
