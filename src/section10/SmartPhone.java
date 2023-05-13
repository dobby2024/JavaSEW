package section10;

public class SmartPhone extends Computer{
	// 속성 멤버변수
	String bluetooth;
	String mike;
	String camera;
	String gps;
	String telcom;
	
	public SmartPhone() {
		System.out.println("SmartPhone() 생성자입니다.");
	}
	
	public SmartPhone(String brand) {	// String brand = "삼성";
		super.brand = brand;
	}

}
