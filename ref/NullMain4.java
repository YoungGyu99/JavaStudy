package ref;

public class NullMain4 {

	public static void main(String[] args) {
		BigData bigData = new BigData();
		bigData.data = new Data(); // 참조하는 값을 넘겨주면 x002가 생성되고 null이 뜨지 않는다.
		System.out.println("bigData.count=" + bigData.count);
		System.out.println("bigData.data=" + bigData.data);
		
		//NullPointe
		System.out.println("bigData.data.value=" + bigData.data.value);

	}

}
