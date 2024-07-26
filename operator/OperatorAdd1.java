package operator;

public class OperatorAdd1 {

	public static void main(String[] args) {
		
		/* 
		 *증감 연산자
		 * 증가 및 감소 연산자를 줄여서 증감 연산자라 한다
		 * 증감 연산자는 ++와 --로 표현되며, 이들은 변수의 값을 1만큼 증가시키거나 감소시킨다.
		 * 프로그래밍에서는 값을 1씩 증가하거나 1씩 감소할 때가 아주 많기 때문에 이런 편의 기능을 제공한다.
		 * */
		
		int a = 0;
		
		a = a + 1;
		System.out.println("a = " + a); // 1
		
		a = a + 1;
		System.out.println("a = " + a); // 2

		//증감 연산자
		++a; // a = a + 1
		System.out.println("a = " + a); //3
		
		++a; // a = a + 1
		System.out.println("a = " + a); //4

	// ++ 증가 --감소
		/* 전위, 후위 증감연산자
		 * 증감 연산자는 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연산자의 위치에 따라 수행되는 시점이 달라진다
		 * ++a: 증감 연산자를 피연산자 앞에 둘 수 있따. 이것을 앞에 있따고 해서 전위(Prefix) 증감 연산자라 한다.
		 * a++: 증감 연산자를 피연산자 뒤에 둘 수 있따. 이것을 뒤에 있따고 해서 후위(Postfix) 증감 연산자라 한다.
		 * 
		 * */
	}

}
