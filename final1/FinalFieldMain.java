package final1;

public class FinalFieldMain {

	public static void main(String[] args) {
		/*- FieldInit과 같이 final 필드를 필드에서 초기화 하는 경우, 같은 값을 가진다.
		 *- 여기서는 FieldInit 인스턴스의 모든 value 값은 10이 된다.
		 *- 왜냐하면 생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져있기 때문이다.
		 *모든 인스턴스가 같은 값을 사용하기 때문에 결과적을 메모리를 낭비하게 된다.(물론 JVM에 따라서 내부 최적화를 시도할 수 있다) 또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에는 명확한 중복이다. 
		 *이럴 때 사용하면 좋은것이 바로 static 영역이다. 
		 * */
		
		//final 필드 - 생성자 초기화
		System.out.println("생성자 초기화");
		ConstructInit constructInit1 = new ConstructInit(10);
		ConstructInit constructInit2 = new ConstructInit(20);
		System.out.println(constructInit1.value);
		System.out.println(constructInit2.value);
		
		//final 필드 - 필드 초기화
		System.out.println("필드 초기화");
		FieldInit fieldInit1 = new FieldInit();
		FieldInit fieldInit2 = new FieldInit();
		FieldInit fieldInit3 = new FieldInit();
		System.out.println(fieldInit1.value);
		System.out.println(fieldInit2.value);
		System.out.println(fieldInit3.value);
		
		//상수
		System.out.println("상수");
		System.out.println(FieldInit.CONST_VALUE);

	}

}
