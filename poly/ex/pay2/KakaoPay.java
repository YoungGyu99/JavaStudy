package poly.ex.pay2;

public class KakaoPay  implements Pay{
	
	@Override
	public boolean pay(int amount) {
		System.out.println("카카오페이 시스템과 연결합니다.");
		System.out.println(amount + "원 결제를 시도중입니다");
		return true;
	}

}
