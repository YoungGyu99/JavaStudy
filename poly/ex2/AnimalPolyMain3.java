package poly.ex2;

public class AnimalPolyMain3 {

	public static void main(String[] args) {
		
		
		
		Animal [] animalArr = {new Dog(), new Cat(), new Caw()};
		for (Animal animal : animalArr) {
			soundAnimal(animal);
			}
		}
		
		//변하지 않는 부분  새로운 동물이 추가되어도 코드변경없이 유지가능
		private static void soundAnimal(Animal animal) {
			
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			System.out.println("동물 소리 테스트 종료");
		}
		
	}
	

