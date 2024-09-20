package construct;

public class MemberThis {
	/*this의 생략
	 * 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수다)를 먼저 찾고 없으면 그 다음으로 멤버 변수를 찾는다. 멤버 변수도 없으면 오류가 발생한다.
	 * 
	 * 이 경우 nameField는 앞에 this가 없어도 멤버 변수에 접근한다.
	 * - nameField는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다. 이 경우 없으므로 멤버변수에서 찾는다.
	 * - nameParameter는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다.이 경우 매개변수가 있으므로 매개변수를 사용한다.
	 * */  
	String nameField; 
	
	void initMember(String nameParameter) {
		nameField = nameParameter;// 자동으로 this.이 붙음 그리고 this.를 직접 적어도 결과는 똑같다. 생략이 되어있으면 한번 생각을 해야하지만 this.를 직접 넣으면 this를 사용하는것을 한눈에 볼 수 있다. 최근에는 적지 않는다. 
	}
}
