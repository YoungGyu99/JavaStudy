package array;

import java.util.Iterator;

public class EnhancedFor1 {

	public static void main(String[] args) {
		/*향상된 for문
		 * 각가의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부른다. 향상된 for문은 배열을 사용할 때 기존 for문보다 더 편리하게 사용할 수 있다.
		 * 
		 * 향상된 for문의 정의
		 * for (변수 : 배열 또는 컬렉션) {
		 *  // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
		 *  }
		 * */
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		//일반 for문 
		for(int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.println(number);
	}
	
			//향상된 for문, for-each문
			for (int number : numbers) {
				System.out.println(number);
			/* - 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다. 단순히 해당 배열을 처음부터 끝까지 탐색한다.
			 * - :의 오른쪽에 numbers와 같이 탐색할 배열을 선택하고, : 의 왼쪽에 int number와 같이 반복할 때 마다 찾은 값을 저장할 변수를 선언한다. 그러면 
			 * 배열의 값을 하나씩 꺼내서 왼쪽에 있는 number에 담고 for문을 수행한다. for문의 끝에 가면 다음 값을 꺼내서 number에 담고 for문을 반복 수행한다. 
			 * numbers 배열의 끝에 도달해서 더 값이 없으면 for문이 완전히 종료된다.
			 * - 향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에 코드가 간결하고 가독성이 좋다.
			 * */
			}
			
			//for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
			for (int i = 0; i < numbers.length; i++) {
				System.out.println("number" + i + "번의 결과는:" + numbers[i]);
			}
		}

	}
