package method;

public class MethodReturn2 {

	public static void main(String[] args) {
/*return문을 만나면 그 즉시 메서드를 빠져나간다.
 * - 18살 미만인경우: 미성년자는 출입이 불가합니다.
 * - 18살 이상의 경우: 입장하세요*/
		checkAge(20);
	}
	public static void checkAge(int age) {
		if (age < 18) { 
			System.out.println(age + "살 미성년자는 출입이 불가합니다");
			return;
		}
			System.out.println(age + "살 입장하세요");
	}

}

 