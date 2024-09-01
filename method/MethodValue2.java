package method;

public class MethodValue2 {

	public static void main(String[] args) {
		/*자바는 항상 변수의 값을 복사해서 대입한다.*/
		int number = 5;
		System.out.println("1. changeNumber 호출 전, num:" + number); //5
		changeNumber(number);
		System.out.println("4. changeNumber 호출 후, num1:" + number); //5
	}
	
	public static void changeNumber(int number) {
		System.out.println("2. changeNumber 변경 전, num2:" + number); //5
		number = number * 2;
		System.out.println("3. changeNumber 변경 후, num2:" + number); //10
	
		
	}

}
/*실행 과정
 * changeNumber(number); changeNumber를 호출한다. main의 nuber(5)
 * changeNumber(5); number의 값을 읽는다.
 * 
 * main의 number값 5가 changeNumber의 number에 복사된다.
 * 결과: main의 number(5), changeNumber의 number(5)
 * void changeNumber(int number=5)
 * 
 * changeNumber의 number에 값 10을 대입한다
 * 결과: main의 number(5), changeNumber의 number(10)
 * number = number * 2;
 * main의 number을 출력한다: main의 number의 값인 5가 출력된다.
 * */
 