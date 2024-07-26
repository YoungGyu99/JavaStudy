package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		/* 문제3
		 * int 형 변수 score 를 선언하세요.
		 * score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력하세요.
		 * */ 
		int score = 80;
		boolean result = 80 >= score && score <= 100;
		System.out.println(result);
		
		/*정리
		 * 자주 사용하는 연산자
		 * 산술 연산자: +, -, *, /, %(나머지)
		 * 증가 및 감소 연산자: ++, --
		 * 비교 연산자: ==, !=, >, <, >=, <=
		 * 논리 연산자: && (AND), || (OR), ! (NOT)
		 * 대입 연산자: =, +=, -=, *=, /=, %=
		 * */

	}

}
