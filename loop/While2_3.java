package loop;

public class While2_3 {

	public static void main(String[] args) {
		/*기존 문제: i부터 하나씩 증가하는 수를 3번까지 더해라 (i~i+2 더하기)
		 * 새로운문제 :i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum더하기)
		 * 
		 * 	i=1, endNum=3 이라고 하면 1 ~ 3 까지 총 3번 더해야한다.
		 *  i=1, endNum=10 이라고 하면 1 ~ 10까지 총 10번 더해야한다.
		 *  i=10, endNum=12 이라고 하면 1- ~ 12까지 총 3번 더해야한다.
		 * */
		int sum = 0;
		int i = 1;
		int endNum = 100;
		
		// i=3, endNum=3
		while (i <= endNum) { // 조건에 만족하지 않으면 while문 종료.
		sum = sum + i;
		System.out.println("i=" + i + " sum" + sum);
		i ++;

		}

		}
	}

