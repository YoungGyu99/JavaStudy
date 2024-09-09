package ref;

public class VarChange1 {

	public static void main(String[] args) {
		/*변수의 대입은 변수에 들어있는 값을 복사해서 대입한다. 여기서 변수 a에 들어가있는 값 10을 복사해서 변수 b에 대입한다. 변수 a 자체를 b에 대입한느 것이 아니다
		 * */
		
		int a = 10;
		int b = a;
		System.out.println("a= " + a); // 10
		System.out.println("b =" + b); // 10
		
		//a 변경
		a = 20;
		System.out.println("변경 a = 20");
		System.out.println("a = "+ a); //20
		System.out.println("b = "+ b); //10
		
		//b 변경
		a = 30;
		System.out.println("변경 b = 30");
		System.out.println("a = " + a); //30
		System.out.println("b = " + b); //10
	}

}
