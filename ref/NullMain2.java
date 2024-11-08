package ref;

public class NullMain2 {

	public static void main(String[] args) {
		/*결과적으로 null  값은 참조할 주소가 존재하지 않는다는 뜻이다. 따라서 참조할 객체 인스턴스가 존재하지 않으므로 다음과 같이 jva.lang.NullPointerException
		 * 이 발생하고, 프로그램이 종료된다. 참고로 예외가 발생했기 때문에 그 다음 로직은 수행되지 않는다.
		 * */
		Data data = null;
		data.value = 10; //NullPointerException 예외 발생
		System.out.println("data = " + data.value);

	}

}
