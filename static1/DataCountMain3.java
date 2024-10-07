package static1;

public class DataCountMain3 {

	public static void main(String[] args) {
		// count 정적 변수에 접근하는 방법이 조금 특이한데 Data3.count와 같이 클래스명에 .(dot)을 사용한다. 마치 클래스에 직접 접근한느 것 처럼 느껴진다.
		Data3 data1 = new Data3("A");
		System.out.println("A count=" + Data3.count);
		
		Data3 data2 = new Data3("B");
		System.out.println("B count=" + Data3.count);
		
		Data3 data3 = new Data3("C");
		System.out.println("C count=" + Data3.count);
		/*최종적으로 메서드 영역에 있는 count 변수의 값은 3이 된다.
		 * static 이 붙은 정적 변수에 접근하려면 Data3.count와 같이 클래스명 + .(dot) + 변수명으로 접근하면 된다.
		 * 참고로 Data3의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명을 생략할 수 있다.
		 * 
		 * static 변수를 사용한 덕분에 공용 변수를 사용해서 편리하게 문제를 해결할 수 있다.
		 * 
		 * 정리 
		 * static 변수는 쉽게 이야기해서 클래스인 붕어빵 틀이 특별히 관리한느 변수이다. 붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재한다.반명 인스턴스인 붕어빵은 인스턴스의 수 만큼 변수가 존재한다.
		 * 
		 * 
		 * 추가 
		 * 인스턴스를 통한 접근*/
		Data3 data4 = new Data3("D");
		System.out.println(data4.count); // 읽을때 오해하기 쉽고 어려울수 있기때문에 추천하지 않는다.

		//클래스를 통한 접근
		System.out.println(data3.count); //클래스를 통한 접근이 직접 봤을때 정적변수에 접근하는것이 한눈에 보이기 때문에 더욱 보기 좋다.
	}

}
