package poly.car0;

public class Driver {
	/* 새로운 차량을 추가하면 다시 Driver 코드를 많이 변경해야 한다. 만약 운전할 수 있는 차량의 종류가 계속 늘어난다면 점점 더 변경해야 한느 코드가 많아질 것이다. 
	 * 이 코드는 역할과 구분을 하지 않아 복잡해진 코드이다.
	 * */

	private K3Car k3Car; // x001
	private Model3Car model3Car; // x002
	
	public void setK3Car(K3Car k3Car) { 
		this.k3Car = k3Car;	
	}
	
	public void setModel3Car(Model3Car model3Car) {
		this.model3Car = model3Car;
	}
	
	public void drive() {
		System.out.println("자동차를 운전합니다.");
		if (k3Car != null) {
		k3Car.startEngine();
		k3Car.pressAccelerator();
		k3Car.offEngine();
		} else if (model3Car != null) {
			model3Car.startEngine();
			model3Car.pressAccelerator();
			model3Car.offEngine();
			/* - K3를 운전하던 운전자가 Model3로 차량을 변경해서 운전하는 코드
			 * - driver.setK3Car(null)을 통해서 기존 K3Car의 참조를 제거
			 * - driver.setModel3Car(model3Car)를 통해서 새로운 model3Car의 참조를 추가한다.
			 * - driver.driver()를 호출한다.
			 * */
			
		}
	}
}
