package oop1;

public class MusicPlayerMain5 {

	public static void main(String[] args) {
		/* MusicPlayer 객체를 생성하고 필요한 기능(메서드)를 호출하기만 하면 된다. 필요한 모든 것들은 MusicPlayer 안에 있다.
		 * - MusicPlayer 를 사용한느 입장에서는 MusicPlayer의 데이터인 volume, isOn 같은 데이터는 전혀 사용하지 않는다.
		 * - MusicPlayer 를 사용하는 입장에서는 이제 MusicPlayer 내부에 어떤 속성(데이터)이 있는지 전혀 몰라도 된다.
		 * - MusicPlayer를 사용한느 입장에서는 단순하게 MusicPlayer가 제공한느 기능 중에 필요한 기능을 호출해서 사용하기만 하면 된다.
		 * 
		 * 캡슐화: MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속서와 기능이 마치 하나의 캡슐에 쌓여있는 것 같다. 이렇게 속성과 기능을 하나로 ㅁㄲ어서 필요한 기능을 메서드를 통해 외부에 제공하는
		 * 것을 캡슐화라고 한다.
		 * 
		 * 유지보수에 용의하다
		 * */

		MusicPlayer player = new MusicPlayer() ;
		// 음악 플레이어 켜기
		player.on();
		// 볼륨 증가
		player.volumeUp();
		// 볼륨 증가
		player.volumeUp();
		// 볼륨 감소
		player.volumeDown();
		// 음악 플레이어 상태
		player.showStatus();
		// 음악 플레리어 끅;
		player.off();

		}
	}