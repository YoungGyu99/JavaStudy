package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
/* 2차원 배열1
 * 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산한느 프로그램을 작성하자.
 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수를 입력하세요:");	
		int count = scanner.nextInt();
		int[][] scores = new int[count][3];
		String[] subjects = {"국어", "영어", "수학"};
		
		for(int i = 0; i < count; i++) {
			System.out.println((i+1) + "번 학생의 성적을 입력하세요");
			for (int j = 0; j < 3; j++) {
				System.out.print(subjects[j] + " 점수:");
				scores[i][j] = scanner.nextInt();

			}
		
		}
		for (int i = 0; i < count; i++) {
			int total = 0;
			for (int j = 0; j < 3; j++) {
				total += scores[i][j];
			}
			double average = total / 3.0;
		System.out.println((i+1) + "번 학생의 총점:" + total + ", 평균:" + average);
	}
	}
}
	