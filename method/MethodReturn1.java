package method;

public class MethodReturn1 {

	public static void main(String[] args) {
		boolean result = odd(2);
		System.out.println(result);
	}
	public static boolean odd(int i) {
		if (i % 2 == 1) {
			return true;
		} else {
			return false;
		}

	}

}
/*if 조건이 만족할 때는 true가 반환되지만, 조건을 만족하지 않으면 어떻게 될까? 조건을 만족하지 않는 경우에는 return문이 실행되지 않는다. 
 * */
 