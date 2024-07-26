package cond;

public class If5 {

	public static void main(String[] args) {
		/*else if 문은 조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우에는 else if문을 사용하면 안되고 대신에 여러 if문을 분리해서 사용해야 한다. 
		 * 여러 독립적인 조건을 검사해야 하는 경우가 그런 상황의 대표적인 예시이다. 죽, 각 조건이 다른 조건과 연관되지 않고, 각각의 조건에 대해 별도의 작업을 수행해야 할 때 이런 상황이발생
		 
		 * 
		 * 문제 
		 * 온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
		 * 각각의 할인 조건은 다음과 같다.
		 * 
		 * 아이템 가격이 10000원 이상일 때, 1000원 할일
		 * 나이가 10살 이하일 때 1000원 할인
		 * 
		 * 이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수있다는 점이다.예를 들어, 10000원짜리 아이템을 구매할 때 1000원 할인을 받고, 동시에 나이가 10살 이하이면 추가로 1000원 더 할인을 받는다.
		 * 그래서 총 2000원 까지 할인을 받을 수있다.

		 * */ 
		
		int price = 10000;
		int age = 10;
		int discount = 0;
		
		if (price >= 10000) {
			discount = discount + 1000;
			System.out.println("10000원 이상 구매, 1000원 할인");
		}
		
		if (age <= 10) {
			discount = discount + 1000;
			System.out.println("어린이 1000원 할인");
		}
		
		System.out.println("총 할인 금액:" + discount + "원");
		}
		

	}


