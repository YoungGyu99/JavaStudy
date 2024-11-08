package extends1.ex2;

public class CarMain {

	public static void main(String[] args) {
		/*상속은 부모의 기능을 자식이 물려받는 것이다. 따라서 부모의 기능을 물려 받아서 사용할 수 있다.
		 * 반대로 부모 클래슨는 자식 클래스에 접근할 수 없다. 자식 클래스는 부모 클래스의 기능을 물려 받기 때문에 접근할 수 있지만, 그 반대는 아니다. 부모 코드에는 자식에 대한 정보가 하나도 없다.
		 * 반면 자식 코드는 extends Car 를 통해서 부모를 알고있다.
		 * */
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}

}
