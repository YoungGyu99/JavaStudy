package array;

public class Array1Ref1 {

	public static void main(String[] args) {

		
		//변수 값 대입
		// 변수는 0부터 시작하기 때문에 5번째에 넣을시 4라고 적어야 한다.
		
		/*기본형vs참조형
		 * 자바의 변수 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류할 수 있다. 사용하는 값을 직접 넣을 수 있는 기본형, 그리고 배열 변수와 메모리의 참조값을
		 * 넣을 수 있는 참조형으로 분류할 수 있다.
		 * 
		 * -기본형(Primitive Type):int, long, double, boolean 처럼 변수에 사용할 값을 직접 넣을 수 잇는 데이터 타입을 기본형(Primitive Type)이라 한다.
		 * -참조형(Reference Type):int[] students와 가이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형(Reference Type)이라 한다.
		 * 
		 * 참조형을 사용하는 이유
		 * 기본형은 모두 사이즈가 명확하게 정해져 있다.
		 * int i; //4byte
		 * long l; //8byte
		 * double d; //8byte
		 * 
		 * 그런데 배열은 다음과 같이 ㅅ이즈를 변경할 수 있다.
		 * int size=10000; // 사용자가 입력한 값을 넣었다고 가정해보자.
		 * new int[size]; //이 코드가 실행되는 시점에 배열의 크기가 정해지다.
		 * 
		 * - 기본형은 선언과 동시에 크기가 정해진다. 따라서 크기를 동적으로 바꾸거나 할 수는 없다. 반면에 앞서본 배열과 같은 참조형은 크기를 동적으로 할당할 수 있다.
		 * 예를 들어서 Scanner를 사용해서 사용자 입력에 따라 size 변수의 값이 변하고, 생성되는 배열의 크기도 달라질수 있다. 이런 것을 동적 메모리 할당이라고 한다. 
		 * 기본형은 선언과 동시에 사이즈가 정적으로 정해지지만, 참조형을 사용하면 이처럼 동적으로 크기가 유연성을 제공할 수 있다.
		 * - 기본형은 사용할 값을 직접 저장한다. 반면에 참조형은 메모리에 저장된 배열이나 객체의 참조를 저장한다. 이로 인해 참조형은 더 복잡한 데이터 구조를 만들고 관리할 수 있다.
		 * 반면 기본형은 더 빠르고 메모리를 효율적으로 처리하다.
		 * */
		int[] students; //배열 변수 선언
		students = new int[5];
		System.out.println(students);
		
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		
		System.out.println("학생1 점수:" + students[0]);
		System.out.println("학생2 점수:" + students[1]);
		System.out.println("학생3 점수:" + students[2]);
		System.out.println("학생4 점수:" + students[3]);
		System.out.println("학생5 점수:" + students[4]);



	}

}
