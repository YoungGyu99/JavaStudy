package ref;

public class VarChange2 {

	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		Data dataB = dataA;
		
	
		System.out.println("dataA 참조값= " + dataA); 
		System.out.println("dataB 참조값= " + dataB);
		System.out.println("dataA.value = " + dataA.value); 
		System.out.println("dataA.value= " + dataB.value); 
		/*변수의 대입은 변수에 들어있는 값을 복사해서 대입한다. 변수 dataA에는 참조값 x001 이 들어있다. 여기서 변수 dataA에 들어있는 참조값 x001을 복사해서
		 * dataB에 대입한다. 참고로 dataA가 가르키는 인스턴스를 복사하는 것이 아니다 변수에 들어있는 참조값만 복사해서 전달한다.
		 * dataA와 dataB에 들어있는 참조값은 같다. 따라서 둘다 같은 x001 Data 인스턴스를 가리킨다.
		 * */
		
		
		//dataA 변경
		dataA.value = 20;
		System.out.println("변경 dataA.value = 20");
		System.out.println("dataA.value= " + dataA.value); 
		System.out.println("dataB.value = " + dataB.value);
		/*dataA.value = 20 코드를 실행하면 dataA가 가르키는 x001 인스턴스의 value 값을 10에서 20으로 변경한다. 그런데 dataA와 dataB는 같은 x001
		 * 인스턴스를 참조하기 때문에 dataA.value와 dataB.value는 둘다 같은 값인 20을 출력한다.
		 * */

		//dataB 변경
		dataB.value = 30;
		System.out.println("변경 dataB.value = 30"); 
		System.out.println("dataA.value= " + dataA.value); 
		System.out.println("dataB.value = " + dataB.value); 
		/*dataB.value = 30코드를 실행하면 dataB가 가르키는 x001 인스턴스 value 값을 20에서 30으로 변경한다. 그런데 dataA와 dataB는 같은 x001 인스턴스를
		 * 참조하기 때문에 dataA.value와 dataB.value는 같은 값인 30을 출력한다.
		 * 
		 * 여기서 핵심은 Data dataB = dataA라고 했을때 변수에 들어있는 값을 복사해서 사용한다는 점이다. 그런데 그 값이 참조값이다. 따라서 dataA와 dataB는 같은
		 * 참조값을 가지게 되고, 두 변수는 같은 객체 인스턴스를 참조하게 된다.
		 * */
	}

}
