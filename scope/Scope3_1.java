package scope;

public class Scope3_1 {

	public static void main(String[] args) {
		/*스코프 존재 이유
		 * 비효율적인 메모리 사용 
		 * 코드 복잡성 증가
		 * 좋은 코드는 둔더더기 없는 코드이기 때문에 스코프가 필요하다*/ 
		int m = 10;
		int temp = 0;
		if (m > 0 ) {
			temp = m * 2;
			System.out.println("temp = " + temp);
		}
		System.out.println("m =" + m);

	}

}
