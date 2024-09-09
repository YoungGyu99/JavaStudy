package ref;

public class NullMain1 {

	public static void main(String[] args) {
		Data data = null; //Data 타입을 받을 수 있는 참조형 변수 data를 만들었다. 그리고 여기에 null값을 할당해다. 따라서 data 변수에는 아직 가리킨느 객체가 없다는 뜻이다.
		System.out.println("1. data= " + data);
		data = new Data(); // 새로운 Data 객체를 생성해서 그 참조값을 data 변수에 할당했다. 이제 data 변수가 참조할 객체가 존재한다.
		System.out.println("2. data = " + data);
		data = null; // data에 다시 null값을 할당했다. 이렇게 하면 data 변수는 앞서 만든 Data인스턴스를 더는 참조하지 않는다.
		System.out.println("3. data = " + data);
	}

}
/*GC - 아무도 참조하지 않는 인스턴스의 최후
 * data에 null을 할당했다. 
 * */
 