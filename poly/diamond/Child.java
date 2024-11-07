package poly.diamond;

public class Child implements InterfaceA, InterfaceB { // 인터페이스는 다중구현이 가능 ,으로 구분만 하면 된다.

	@Override
	public void methodB() {
		System.out.println("Child.methodA");
	}

	@Override
	public void methodA() {
		System.out.println("Child.methodB");

	}

	@Override
	public void methodCommon() { //중복이 있을경우 하나만 구현하면 된다.
		System.out.println("Child.methodCommon");

	}

}
