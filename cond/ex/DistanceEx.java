package cond.ex;

public class DistanceEx {

	public static void main(String[] args) {
		/*문제:"거리에 따른 운송 수단 선택하기"
		 * 주어진 거리에 따라 가장 적합한 운송수단을 선택하는 프로그램을 작성하자. 다음과 같은 긴준을 따른다
		 * - 거리가 1km 이하이면:"도보"
		 * - 거리가 10km 이하이면: "자전거"
		 * - 거리가 100km 이하이면: "자동차"
		 * - 거리가 100km 초과이면: "비행기"
		 * */
		
		int distance = 150;
		
		if (distance <= 1) {
		System.out.println("도보를 이용하세요.");
		
		} else if (distance <= 10) {
		System.out.println("자전거를 이용하세요.");
		
		} else if (distance <= 100) {
		System.out.println("자동차를 이용하세요.");
		
		} else {
		System.out.println("비행기를 이용하세요.");
		}
	}

}
