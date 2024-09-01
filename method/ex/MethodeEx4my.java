package method.ex;

import java.util.Scanner;

public class MethodeEx4my {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int balance = 0;
		while (true) {
		System.out.println("------------------------");
		System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
		int option = input.nextInt();
		if (option == 1) {
			System.out.println("선택:1");
			input.nextLine();
			System.out.println("입금액을 입력하세요:");
			int deposit = input.nextInt();
			balance += deposit;
			System.out.println(deposit + "원을 입금하였습니다. 현재 잔액 :" + balance);
			
		}
		if (option == 2) {
			System.out.println("선택:2");
			input.nextLine();
			System.out.println("출금액을 입력하세요:" );
			int withdraw = input.nextInt();
		if(balance >= withdraw){
			balance -= withdraw;
			System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액 :" + balance);
			} else {
			System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
			}
		}
		if (option == 3) {
			System.out.println("선택:3");
			System.out.println("현재 잔액:" + balance);
		}
		if (option == 4) {
			System.out.println("시스템을 종료합니다.");
			break;
		}

	}
	}
}
