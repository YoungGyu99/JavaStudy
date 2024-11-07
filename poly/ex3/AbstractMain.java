package poly.ex3;

public class AbstractMain {

	public static void main(String[] args) {
		// 추상 메서드는 반드시 오버라이딩 해야한다. 만약 자식에서 오버라이딩 메서드를 만들지 않으면 오류가 발생한다.
		// 추상클래스 생성 불가
//		AbstractAnimal animal = new AbstractAnimal(); 
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		cat.sound();
		cat.move();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
		
	}
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
	

}
