package section07;

public class Car {
	int wheel = 4;	// 바퀴 4개 
					// 클래스 필드, 멤버필드 선언 및 초기화
	
	String color;
	int camera;
	
	// 메소드 - 객체에서 기능역할
	public static void drive() {
		System.out.println("운전을 해요!");
	}
	
	public void cleanUp() {
		String str = "깨끗하게";
		System.out.println("세차를 해요!");
	}
	
	public void countWheel() {
		System.out.println("바퀴 개수 : " + wheel);
	}	
}


