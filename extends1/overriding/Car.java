package extends1.overriding;

public class Car {
	// 상속 관계 덕분에 중복은 줄어들고, 새로운 수소차를 편리하게 확장(extend)한 것을 알 수 있다.

	public void move() {
		System.out.println("차를 이동 합니다.");
	}
	
	//추가
	public void openDoor() {System.out.println("문을 엽니다.");}
	}
