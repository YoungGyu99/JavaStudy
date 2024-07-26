package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

	public static void main(String[] args) {
		/*문제와 풀이4
		 * 문제 - 입력한 숫자의 합계와 평균
		 * - 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요. 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여
		 *  숫자 입력을 종료한다고 가정합니다.
		 * - 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum과 평균 average를 출력하세요. 평균은 소숫점 아래까지 계산해야 합니다. 
		 * */
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		int input = 0;
		
		System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
//		while(true) {
//			input = scanner.nextInt();
//			if (input == -1) {
//			 break;
//			}
//			sum += input;
//			count++;
//			}
//		
		
		while ((input = scanner.nextInt()) !=-1) {
			sum += input;
			count++;
		}
		/*
		 * 반복문 실행
		 * while ((input = scanner.nextInt()) != -1)  //사용자 3입력
		 * while ((input = 3) != -1) //input에 3 대입
		 * while ((input(3)) != -1) //input의 값 읽기
		 * while ((3) != -1) //() 제거
		 * while (3 != -1) // 부등식 연산
		 * while (true) //while문 실행
		 * 
		 * 반복문 종료
		 * while ((input = scanner.nextInt()) != 1) //사용자 -1 입력
		 * while ((input = -1) != -1) //input에 -1 대입
		 * while ((input(-1)) != -1) //input의 값 읽기
		 * while ((-1) != -1) //() 제거
		 * whlie (-1 != -1) // 부등식 연산
		 * while(faslse) //while문 종료
		 * */
		
		double average = (double)sum / count;
		System.out.println("입력한 숫자들의 합계:" + sum);
		System.out.println("입력한 숫자들의 평균:" + average);

		
	}

}
