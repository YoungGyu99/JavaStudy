package class1;

public class ClassStart2 {

	public static void main(String[] args) {
		/*배열 사용의 한계
		 * 배열을 사용해서 코드 변경을 최소화하는데는 성공했지만, 한 학생의 데이터가 studentNames[], studentAges[], studentGrades[]라는 3개의 배열에
		 * 나누어져 있다. 따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다. 예를 들어서 학생 2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서
		 * 제거해주어야 한다.
		 * 
		 * 한 학생의 데이터가 3개의 배열에 나누어져 있기 때문에 3개의 배열을 각각 변경해야 한다. 그리고 한 학생의 데이터를 관리하기 위해 3개 배열의 인덱스 순서를 항상 
		 * 정확하게 맞추어야 한다. 이렇게 하면 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다. 이 코드는 컴퓨터가 볼 때는 아무 문제가 없겠지만, 사람이 관리하게에는 좋은 
		 * 코드가 아니다.
		 * 
		 *  정리 
		 *  지금처럼 이름,나이,성적을 각각 따로 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.
		 *  사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것이다. 그리고 각각의 학생 별로 본인의 이름, 나이, 성정을 관리하는 것이다.*/
		String[] studentNames = {"햑생1", "학생2","학생3"};
		int [] studentAges = {15, 16, 17};
		int [] studentGrade = {90, 80, 70};
		for (int i = 0; i < studentNames.length; i++) {
		System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrade[i]);


	}
		}

}