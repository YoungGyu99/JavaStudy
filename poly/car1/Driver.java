package poly.car1;

public class Driver {
	/* - Driver 는 멤버 변수로 Car car 를 가진다.
	 * - setCar(Car car): 멤버 변수에 자동차를 설정한다. 외부에서 누군가 이 메서드를 호출해주어야 Driver는 새로운 자동차를 참조하거나 변경할 수 있다.
	 * - driver() : Car 인터페이스가 제공하는 기능들을 통해 자동차를 운전한다.
	 * */
	
	private Car car;
	
	public void setCar(Car car) {
		System.out.println("자동차를 설정합니다 " + car);
		this.car = car;
	}
	public void drive() {
		System.out.println("자동차를 운전합니다");
		car.startEngine();
		car.pressAccelerator();
		car.offEngine();
		
	}

}
