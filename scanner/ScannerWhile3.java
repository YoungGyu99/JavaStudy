package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sum = 0; // 이곳에서 사용자가 입력한 값을 누적한다.
		
		while (true) {
			System.out.println("정수를 입력하세요 (0을 입력하면 종료):");
			int number = input.nextInt();
			
			if (number == 0) {
				break;	
			}
			sum += number; // 사용자가 입력한 number값을 sum에 누적해서 더한다.
						   // += 을 사용했으므로 다음 코드와 같다: sum = sum + number
		}
		System.out.println("입력한 모든 정수의 합:" + sum);
	}

}
