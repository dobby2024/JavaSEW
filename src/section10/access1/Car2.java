package section10.access1;

public class Car2 {
	
	private Car2() {
		System.out.println("Car2() 생성자 입니다.");
	}
	
	// 팩토리 패턴(Factory Pattern)
	public static Car2 createCar() {
		return new Car2();
	}

}
