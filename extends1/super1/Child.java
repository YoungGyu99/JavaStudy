package extends1.super1;

public class Child  extends Parent {
	
	public String value = "child";
	
	@Override
	public void hello() {
		System.out.println("Child.hello");
		
	}
	
	public void call() {
		System.out.println("this value = " + this.value); //this 생략 가능 생략시 내꺼에서 먼저 찾고 없을 시 부모 타입에서 찾는다.
		System.out.println("super value = " + super.value);
		/*this는 내 타입에서 찾을때 생략
		 * spuer는 내 부모 타입에서 찾을때 
		 * */
		
		this.hello(); //this생략 가능
		super.hello();
	}

}
