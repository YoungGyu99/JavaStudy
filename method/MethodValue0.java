package method;

public class MethodValue0 {

	public static void main(String[] args) {
		/*메서드 호출과 값 전달1
		 * 중요!
		 * 자바는 항상 변수의 값을 복사해서 대입한다.
		 * 이 대원칙은 반드시 이해해야 한다. 그러면 아무리 복잡한 상황에도 코드를 단순하게 이해할 수 있다.*/
		
		int num1 = 5;
		int num2 = num1;
		num2 = 10;
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);

	}

}
/*int num2 = num1;
 * 이 부분은 생각해보면 num1에 있는 가밧 5를 복사해서 num2에 넣는 것이다.
 *   복사한다고 표현한 이윤느 num1에 있는 값 5를 복사해서 num2에 넣는 것이다.
 *  	- 복사한다고 표현한 이유는 num1의 값을 읽어도 num1에 있는 기존 값이 유지되고, 새로운 값이 num2에 들어가기 때문이다. 마치 num1의 값이
 *  	 num2에 복사가 된 것 같다.
 *  	- num1이라는 변수 자체가 num2에 들어가는 것이 아니다. num1에 들어가는 값을 읽고 복사해서 num2에 넣는 것이다.
 *    	- 간단하게 num1에 있는 값을 num2에 대입한다고 표현한다. 하지만 실제로는 그 값을 복사해서 대입하는 것이다.
 * */
 