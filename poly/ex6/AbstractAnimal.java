package poly.ex6;

public abstract class AbstractAnimal {
	
	public abstract void sound(); //순수 추상 x
	public void move() { //상속이 목적
		System.out.println("동물이 이동합니다.");
	}
}