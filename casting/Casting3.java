package casting;

public class Casting3 {

	public static void main(String[] args) {
		/* 지정된 숫자범위를 넘어서면 오버플로우가 발생한다 처음숫자로 돌아간다 
		 * 오버플로우가 발생하면 오류가 터진것이니 이것을 활용할 생각하지말고 상위타입으로 바꿔서 사용
		 * */
		long maxIntValue = 2147483647; //int 최고값
		long maxIntOver  = 2147483648L; //int 최고값
		int intValue = 0;
		
		intValue = (int) maxIntValue; //형변환
		System.out.println("maxIntValue casting= " + intValue);
		
		intValue = (int) maxIntOver; //형변환
		System.out.println("maxIntOver casting=" + intValue);

	}

}
