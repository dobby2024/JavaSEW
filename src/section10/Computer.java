package section10;

public class Computer {
	// 속성(멤버변수)
	String brand;
	String cpu;
	int ram;
	int hdd;
	String gpu;
	
	public Computer() {
		System.out.println("Computer() 생성자입니다.");
	}
	
	public void getInfo() {
		System.out.println("brand: " + brand);
		System.out.println("cpu: " + cpu);
		System.out.println("ram: " + ram +"Gb");
		System.out.println("hdd: " + hdd +"Gb");
		System.out.println("gpu: " + gpu);
	}

}
