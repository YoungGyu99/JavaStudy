package oop1.ex;

public class RectangleOopMain {

	public static void main(String[] args) {
		/*문제1- 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
		 * 다음은 직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램이다.
		 * 
		 * - 절차 지향 프로그래밍 방식으로 되어 있는 코드를 객체 지향 프로그래밍 방식으로 변경해라.
		 * - Rectangle 클래스를 만들어라
		 * - RectangleOopMain에 해당 클래스를 사용하는 main() 코드를 만들어라.*/
		Rectangle rectangle = new Rectangle();
		rectangle.width = 8;
		rectangle.height = 8;

		int area = rectangle.calculateArea();
		System.out.println("넓이:" + area);
		
		int Perimeter = rectangle.calulatePerimeter();
		System.out.println("둘레 길이:" + Perimeter);
		
		boolean isSquare = rectangle.isSquare();
		System.out.println("정사각형 여부" + isSquare);		

	}
}