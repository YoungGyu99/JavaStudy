package poly.car1;

public class CarMain1 {

	public static void main(String[] args) {
		/* OCP(Open-Closed Principle) 원칙을 잘 지킨 코드
		 * 
		 * 확장에 열려있다는 의미
		 * Car 인터페이스를 사용해서 새로운 차량을 자유롭게 추가할 수 있다. Car 인터페이스를 구현해서 기능을 추가할 수 있다는 의미이다. 그리고 Car 인터페이스를 사용하는 클라이언트 코드인 Driver도 Car 인터페이스를 통해 새롭게 추가된
		 * 차량을 자유롭게 호출할 수 있다. 이것이 확장이 열려있다는 의미이다.
		 * 
		 * 코드 수정은 닫혀있다는 의미
		 * 새로운 차를 추가하게 되면 기능이 추가되기 때문에 기존 코드의 수정은 불가피하다. 당연히 어딘가 코드는 수정해야 한다.
		 * 
		 * 변경하지 않는 부분
		 * 새로운 차를 추가할 때 가장 영향을 받는 중요한 클라이언트는 바로 Car의 기능을 사용하는 Driver이다. 핵심은 Car 인터페이스를 사용하는 클라이언트인 Driver의 코드를 수정하지 않아도 된다는 뜻이다.
		 * 
		 * 변하는 부분
		 * main()과 같이 새로운 차를 생성하고 Driver에게 필요한 차를 전달해주는 역할은 당연히 코드 수정이 발생한다. main()은 전체 프로그램을 설정하고 조율하는 역할을 담당한다. 이런 부분은 OCP를 지켜도 변경이 필요하다.
		 * 
		 * 정리
		 * - Car를 사용하는 클라이언트 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있다.
		 * - 다형성을 활용하고 역할과 구현을 잘 분리한 덕분에 새로운 자동차를 추가해도 대부분의 핵심 코드들을 그대로 유지할 수 있게 되었다.
		 * */
		
		Driver driver = new Driver();
		
		//차량 선택(K3)
		K3Car k3Car = new K3Car();
		driver.setCar(k3Car);
		driver.drive();
		
		//차량 변경(k3 -> Model3)
		Model3Car model3Car = new Model3Car();
		driver.setCar(model3Car);
		driver.drive();
		
		//차량 변경(model3 -> newCar)
		NewCar newCar = new NewCar();
		driver.setCar(newCar);
		driver.drive();
		
	}

}
