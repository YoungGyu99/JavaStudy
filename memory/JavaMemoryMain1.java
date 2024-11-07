package memory;

public class JavaMemoryMain1 {

	/* - 처음 자바 프로그램을 실행하면 main()을 실행한다. 이때 main()을 위한 스택 프레임이 하나 생성된다.
	 * 		main() 스택 프레임은 내부에 args라는 매개변수를 가진다.
	 * - main()은 method1()을 호출한다. method1() 스택프레임이 생성된다.
	 * 		method1()는 m1, cal 지역 변수(매개변수 포함)를 가지므로 해당 지역 변수들이 스택 프레임에 포함된다.
	 * - method1()은 method2() 를 호출한다.method2() 스택 프레임이 생성된다. method2()는 m2 지역 변수(매개변수포함)를 가지므로 해당 지역 변수가 스택 프레임에 포함된다.
	 * */
	public static void main(String[] args) {
		System.out.println("main start");
		method1(10);
		System.out.println("main end");

	}
	static void method1(int m1) {
		System.out.println("method1 start");
		int cal = m1 * 2;
		method2(cal);
		System.out.println("method1 end");
		
	}
	static void method2(int m2) {
		System.out.println("method2 start");
		System.out.println("method2 end");
		/* - method2()가 종료된다. 이때 method2() 스택 프레임이 제거되고, 매개변수 m2도 제거된다. method2() 스택 프레임이 제거 되었으므로 프로그램은 metho1()로 돌아간다. 물론 method1()을 처음부터 시작하는 것이
		 * 	아니라 method1()에서 method2()를 호출한 지점으로 돌아간다.
		 * - method1()이 종료된다. 이때 method1() 스택 프레임이 제거되고, 지역변수(매개변수 포함) m1, cal도 제거된다. 프로그램은 main()으로 돌아간다.
		 * - main() 이 종료된다. 더 이상 호출할 메서드가 없고, 스택 프레임도 완전히 비워졌다. 자바는 프로그램을 정리하고 종료한다.
		 *
		 * 
		 * 
		 * 정리
		 * - 자바는 스택 영역을 사용해서 메서드 호출과 지역 변수(매개변수 포함)를 관리한다.
		 * - 메서드를 계속 호출하면 스택 프레임이 계속 쌓인다.
		 * - 지역 변수(매개변수 포함)는 스택 영역에서 관리한다.
		 * - 스택 프레임이 종료되면 지역 변수도 함께 제거된다.
		 * - 스택 프레임이 모두 제거되면 프로그램도 종료된다.*/

		
	}

}

