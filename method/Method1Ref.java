package method;

public class Method1Ref {

	public static void main(String[] args) {
		/*메서드 호출과 용어정리
		 * 메서드를 호출할 때는 메서드에 넘기는 값과 파라미터의 타입이 맞아야 한다. 물론 넘긴느 값과 매개변수(파라미터)의 순서와 갯수도 맞아야 한다.
		 * 호출: call("hello", 20)
		 * 메서드 정의: int call(String str, int age)
		 * 
		 * 인수(Argument)
		 * 여기서 "hello",20처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라 한다.
		 * 실무에서는 아규먼트, 인수, 인자라는 용어를 모두 사용한다.
		 * 
		 * 매개변수(Parameter)
		 * 메서드를 정의할 때 선언한 변수인 String str, int age를 매개변수, 파라미터라 한다. 메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
		 * 실무에서는 매개변수, 파라미터 용어를 모두 사용한다.
		 * 
		 * 용어정리
		 * - 인수라는 용어는 '인'과 '수'의 합성어로,'들어가는 수'라는 의미를 가진다. 즉, 메서드 내부로 들어가는 값을 의미한다. 인자도 같은 의미이다.
		 * - 매개변수, parameter는 '매개'와'변수'의 합성어로, '중간에서 전달하는 변수'라는 의미를 가진다. 즉, 메서드 호출부와 메서드 내부 사이에서
		 *  값을 전달한느 역할을 하는 변수라는 뜻이다.
		 *  
		 *  메서드 정의
		 *  public static int add(int a, int b){
		 *   메서드 본문, 실행 코드
		 *   }
		 *   
		 *   제어자 반환타입 메서드이름(매개변수 목록){
		 *   메서드 본문
		 *   }
		 *   
		 *   - 제어자(Modifier): public, static과 같은 부분이다.
		 *   - 반환 타입(Return Type): 메서드가 실행 된 후 반환하는 데이터의 타입을 지정한다. 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 void를 
		 *     사용해야 한다. 예) void print(String str)
		 *   - 메서드 이름(Method Name): 메서드의 이름이다. 이 이름은 메서드를 호출하는데 사용된다.
		 *   - 매개변수(Parameter):입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다. 매개변수는 옵션이다. 입력값이 필요 없는 메서드는 매개변수를
		 *     지정하지 않아도 된다. 예) add()
		 *   - 메서드 본문(Method Body):실제 메서드의 코드가 위치한다. 중괄호 {} 사이에 코드를 작성한다.
		 * */
		//계산1

		int sum1 = add(5, 10);
		System.out.println("결과1 출력:" + sum1);
		
		//계산2
		int sum2 = add(15, 20);
		System.out.println("결과 2 출력:" + sum2);

	}
	public static int add(int a, int b) {
		System.out.println(a + "+" + b + " 연산 수행을 합니다!");
		int sum = a + b;
		return sum;

	}
}
