package extends1.overriding;

public class ElectricCar extends Car {
	/*ElectricCar은 부모인 Car의 move()기능을 그대로 사용하고 싶지 않다. 메서드 이름은 같지만 새로운 기능을 사용하고싶다. 그래서 ElectricCar의 move()메서드를 새로 만들었다. 
	 * 이렇게 부모의 기능을 자식이 새로 재정의하는 것을 메서드 오버라이딩이라 한다. 이제 ElectricCar의 move()를 호출하면 Car의 move()가 아니라 ElectricCar의 move()가 호출된다.
	 * 
	 * 
	 * 이 애노테이션은 상위 클래스의 메서드를 오버라이드 하는 것임을 나타낸다.
	 * 이름 그대로 오버라이딩 한 메서드 위에 이 애노테이션을 붙여야 한다.
	 * 컴파일러는 이 애노테이션을 보고 메서드가 정확히 오버라이드 되었지는지 확인한다. 오버라이딩 조건을 만족하지 않으면 컴파일 에러를 발생시킨다. 따라서 실수로 오버라이딩을 못하는 경우를 방지해준다. 
	 * 예를 들어서 이 경우에 만약 부모에 move()메서드가 없드마녀 컴파일 오류가 발생한다. 참고로 이 기능은 필수는 아니지만 코드의 명확성을 위해 붙여주는 것이 좋다.
	 * */
	
	@Override //오버라이드가 정확이 되지 않으면 컴파일오류를 발생시켜 오류가 난 부분을 알려준다. 코드의 명확성을 위해 꼭 붙여주는것이 좋다.
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
	}

	public void charge() {
		System.out.println("충전합니다.");
	}
}
