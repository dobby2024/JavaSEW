package section10;

public class Laptop extends Computer{
	String battery;
	String display;
	String camera;
	
	@Override
	public void getInfo() {	// 오버라이딩
		super.cpu = super.cpu +"x4";
		super.getInfo();
		System.out.println("battery: " + battery);
		System.out.println("display: " + display);
		System.out.println("camera: " + camera);
	}

}
