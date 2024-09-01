package method.ex;

public class MethodeEx2 {

	public static void main(String[] args) {
		String message = "Hello, world";
		
		printMessage(message, 3);
		printMessage("HTML", 5);
		printMessage("JavaScript", 7);

	}
	public static void printMessage(String message, int times){
		for(int i = 0; i< times; i ++){
			System.out.println(message);
	}
		
}
}