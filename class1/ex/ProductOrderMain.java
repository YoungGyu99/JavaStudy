package class1.ex;

public class ProductOrderMain {

	public static void main(String[] args) {
		ProductOrder [] orders = new ProductOrder[3];
		
		ProductOrder  Product1 = new ProductOrder();
		Product1 = new ProductOrder();
		Product1.productName = "두부";
		Product1.price = 2000;
		Product1.quantity = 2;
		orders[0] = Product1;
		
		ProductOrder  Product2 = new ProductOrder();
		Product2 = new ProductOrder();
		Product2.productName = "김치";
		Product2.price = 5000;
		Product2.quantity = 1;
		orders[1] = Product2;

		
		ProductOrder  Product3 = new ProductOrder();
		Product3 = new ProductOrder();
		Product3.productName = "콜라";
		Product3.price = 1500;
		Product3.quantity = 2;
		orders[2] = Product3;

		int totalAmount = 0;
		for (ProductOrder order : orders ) {
			System.out.println("상품명:" + order.productName + ", 가격: " + order.price + ", 수량" + order.quantity);
			totalAmount += order.price * order.quantity;
		}
		
		System.out.println("총 결제 금액: " + totalAmount);

	}

}
