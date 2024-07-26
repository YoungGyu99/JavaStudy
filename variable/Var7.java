package variable;

public class Var7 {

	public static void main(String[] args) {
		
		int a = 100; //정수 -도 가능 ""같은걸 넣으면 오류가 발생한다
		double b = 10.5; //예) 0.2, 1.5, 100.121 실수 -도 가능 
		boolean c = true; //불리언(boolean) true, false  입력가능
		char d = 'A'; //문자 하나 '' 작은따움표
		String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입 "" 큰따움포
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		/*
		 * 변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재한다. 이러한 형식을 영어로는 타입(type)이라고 하고, 우리말로는 형식 또는 형이라고 한다.
		 * 예를 들어사 int 타입, int 형식, int형 등으로 부르다. 특별히 구분하지 않고 섞어서 부르기 때문에 모두 같은 말로 이해하면 된다.*/
		
		/* 리터럴
		 * 코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java"와 같은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.
		 * 변수의 값은 별할 수 잇지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.
		 * 리터럴이라는 단어의 어원은 문자 또는 글자를 의미한다.
		 * */
	}

}
