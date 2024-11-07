package poly.ex.pay2;
import java.util.Scanner;
public class PayMain1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PayService payService = new PayService();
		
		while(true) {
			System.out.println("결제 수단을 입력하세요:");
			String payOption = scanner.nextLine();
			
			if(payOption.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.println("결제 금액을 입력하세요");
			int amoumt = scanner.nextInt();
			scanner.nextLine();
			payService.processPay(payOption, amoumt);
		}
		}
	}
