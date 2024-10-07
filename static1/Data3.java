package static1;

public class Data3 {
	/* - 변수 타입(int) 앞에 static 키워드가 붙어있다.
	 * - 이렇게 멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라 한다.
	 * - 객체가 생서되면 생성자에서 정적 변수 count의 값을 하나 증가시킨다.
	 */

	public String name;
	public static int count; //static
	
	public Data3(String name) {
		this.name = name;
		count++; //내 클래스 안에 있는 내용의 경우 this를 적어주지 않아도 된다.
		
	}
}
