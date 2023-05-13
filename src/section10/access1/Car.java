package section10.access1;

public class Car {
	// 싱글톤(Singleton) 디자인패턴
	private static Car car = new Car(); 
	
	private Car() {
		System.out.println("Car() 생성자 입니다.");
	}
	
	public static Car getInstance() {
		return car;
	}
}
