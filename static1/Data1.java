package static1;

public class Data1 {
	//생성된 객체의 술르 세어야 한다. 따라서 객체가 생성될 때 마다 생성자를 통해 인스턴스의 멤버 변수인 count 값을 증가시킨다.
	public String name;
	public int count;
	
	public Data1(String name) {
		this.name = name;
		count++;
	}

}
