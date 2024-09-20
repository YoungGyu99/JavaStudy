package pack;

import pack.a.User;  //pack.a.* 에서 별모양을 사용하면 해당 패키지 안에 있는 모든 클래스를 가져올 수 있다
public class PackageMain2 {

	public static void main(String[] args) {
		// import 를 사용하면 다른 패키지에 있는 클래스를 가져와 사용할 수 있다.
		Data data = new Data();
		User user = new User();
	}

}
