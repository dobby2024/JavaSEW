package section10;

public class SmartTV extends SmartPhone{
	int countChannel;
	
	public SmartTV() {
		System.out.println("SmartTV() 생성자 입니다.");
	}
	
	public SmartTV(String brand) {	// String brand = "삼성";
		super(brand); // super("삼성");
		System.out.println(brand + " SmartTV() 생성자 입니다.");
	}
}
