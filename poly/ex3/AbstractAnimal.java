package poly.ex3;

public abstract class AbstractAnimal { //추상클래스가 하나라도 있으면 abstract을 선언해야 한다.
	
	public abstract void sound(); // 바디부분을 만들 수 없다.
	
	public void move() { // 추상메서드가 아니기 때문에 오버라이딩 하지 않아도 된다.
		System.out.println("동물이 움직입니다.");
	}

}
