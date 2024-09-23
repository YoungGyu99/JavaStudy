package access.b;

public class BankAccountMain {

	public static void main(String[] args) {
		/*private
		 * - balance : 데이터 필드는 외부에 직접 노출하지 않는다. BankAccount가 제공하는 메서드를 통해서만 접근할 수 있다.
		 * - isAmountValid() : 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이다. 따라서 private를 사용했다.
		 * 
		 * public 
		 * - deposit():입금
		 * - withdraw():출금
		 * - getBalance():잔고
		 * 
		 * BankAccount를 사용한느 입장에서는 단 3가지 메서드만 알면 된다. 나머지 복잡한 내용은 모두 BankAccount 내부에 숨어있다.
		 * 
		 * 만약 isAmountValid()를 외부에 노출하면 BankAcocount를 사용하는 개발자 입장에서 사용할 수 있는 메서드가 하나 더늘었다. 이렇게 되면 다른 개발자 입장에서는 입장과 출금 전에 본인이 먼저 
		 * isAmountValid()를 사용해서 검증을 해야 하나? 라고 의문이 들며 혼란을 줄것이다.
		 * */
		BankAccount account = new BankAccount();
		account.deposit(10000);
		account.withdraw(3000);
		System.out.println("balance = " + account.getBalance());
	}

}
