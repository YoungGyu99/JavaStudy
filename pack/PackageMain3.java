package pack;

import pack.a.User;

public class PackageMain3 {

	public static void main(String[] args) {
		User userA = new User(); // 자주 사용하는 부분을 import하는게 좋다.
		pack.b.User userB = new pack.b.User();// 같은 이름의 경우 경로를 적어주어야 한다. 물론 둘다 경로를 다 적어도 상관없다.
	}

}
