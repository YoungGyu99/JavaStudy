package poly.ex6;

public class Bird extends AbstractAnimal implements Fly { // AbstractAnimal 클래스를 상속하고 Fly 인터페이스를 구현
	//extends를 통한 상속은 하나만 할 수 있고 implements를 통한 인터페이스는 다중 구현 할 수 있기 때문에 둘이 함께 나온 경우 extends가 먼저 나와야 한다.

	@Override
	public void sound() {
		System.out.println("짹짹");
		
	}

	@Override
	public void fly() {
		System.out.println("새 날기");
	}
	

}
