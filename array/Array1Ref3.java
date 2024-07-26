package array;

public class Array1Ref3 {

	public static void main(String[] args) {
 		
		int[] students; //배열 변수 선언
		students = new int[] {90, 80, 70, 60, 50}; // 배열 생성과 초기화
		System.out.println(students); 
		
		//변수 값 사용
		for (int i = 0; i < students.length; i++) {
			System.out.println("학생"+(i + 1) + "점수:" + students[i]); // 숫자같은 경우 괄호를 넣지 않으면 숫자가 문자형으로 바뀌기 때문에 ()를 넣는다.
		}

		

	}

}
