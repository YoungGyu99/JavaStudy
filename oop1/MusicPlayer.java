package oop1;

public class MusicPlayer {
	/*객체지향 프로그래밍 캡슐화
	 * MusicPlayer 클래스에 음악 플레이어에 필요한 속성과 기능을 모두 정의했다. 이제 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용할 수 있다. 음악플레이어를 사용하는데 
	 * 필요한 모든 속성과 기능이 하나의 클래스에 포함되어있다.
	 * 
	 * 호출부분은 변경하지 않아도 되기때문에 유지보수에 용의하다.
	 * */

	int volume = 0;
	boolean isOn = false;
	
	 void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	 void off() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	 }	
	 void volumeUp() {
		volume++;
		System.out.println("음악플레이어 볼륨:" + volume);

	 }
	 void volumeDown() {
		volume--;
		System.out.println("음악플레이어 볼륨:" + volume);

	 }
	void showStatus() {
		isOn = true;
		System.out.println("음악 플레이어 상태 확인");
		if (isOn) {
			System.out.println("음악 플레이어 NO, 볼림:" + volume);
		}else {
			System.out.println("음악 플레이어 OFF");
		}
	}
	}
