package static2;

public class DecoUtil2 {
	/*DecoUtil2는 앞선 예제와 비슷한데, 메서드 앞에 static이 붙어있다. 이 부분에 주의하자. 이렇게 하면 정적 메서드를 만들 수 있다. 그리고 이 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스명을 통해 바로호출할 수 있다. 
	 * */
	
	public static String deco(String str) {
		String result = "*" + str + "*";
		return result;
	}
}
