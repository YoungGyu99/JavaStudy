package access;

public class Speaker {

	private int volume;
	
	Speaker(int volume){
		this.volume = volume;
	}
	
	void volumeUp() { //를 통해 음량이 한번에 10씩 등가하며 100을 넘기게 되면 더는 음량이 증가하지 않는다.
		if (volume >= 100) { 
			System.out.println("음량을 증가할 수 없습니다. 최대 음량 입니다.");
		} else {
			volume += 10;
			System.out.println("음량을 10 증가합니다.");
		}
	}
	void volumeDown() {
		volume -= 10;
		System.out.println("volumeDown 호출");
	}
	
	void showVolume() {
		System.out.println("현재 음량:" + volume );
	
	
}
}