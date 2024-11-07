package poly.ex4;

public class AbstractMain {

	public static void main(String[] args) {
		// 추상 메서드는 반드시 오버라이딩 해야한다. 만약 자식에서 오버라이딩 메서드를 만들지 않으면 오류가 발생한다.
		// 추상클래스 생성 불가
//		AbstractAnimal animal = new AbstractAnimal(); 
		
		/*순수 추상 클래스 특징
		 * - 인스턴스를 생성할 수 없다.
		 * - 상속시 자식은 모든 메서드를 오버라이딩 해야 한다.
		 * - 주로 다형성을 위해 사용된다.
		 * */
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
		
		moveAnimal(dog);
		moveAnimal(cat);
		moveAnimal(caw);
		
	}
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
	private static void moveAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.move();
		System.out.println("동물 소리 테스트 종료");
	}
	

}
