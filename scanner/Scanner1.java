package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		/* Scanner scanner = new Scanner(System.in)
		 *  - Scanner 는 System.in을 사용해서 사용자의 입력을 편리하게 받도록 도와준다
		 *  - Scanner canner 코드는 scanner 변수를 선언하는 것이다.
		 * scanner.nextLine()
		 *  - 엔터(\n)을 입력할 때 까지 문자를 가져온다
		 * scanner.nextInt()
		 *  - 입력을 int 형으로 가져온다. 정수 입력에 사용한다.
		 * scanner.nextDouble()
		 *  - 입력을 double형으로 가져온다. 실수 입력에 사용한다.
		 * */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요:");
		String str = scanner.nextLine(); // 입력을 String으로 가져온다.
		System.out.println("입력한 문자열:" + str);
		
		System.out.print("정수를 이력하세요");
		int intValue = scanner.nextInt();
		System.out.println("입력한 정수:" + intValue);
		
		System.out.print("실수를 입력하세요:");
		double doubleValue = scanner.nextDouble();
		System.out.println("입력한 실수:"+ doubleValue);
	}

}
