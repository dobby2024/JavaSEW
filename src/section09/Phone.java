package section09;

public class Phone {
	String brand;
	int series;
	String color;
	int price;
	
	public Phone() {
		brand = "삼성 갤럭시";
		series = 23;
		color = "green";
	}
	
	// 오버로딩 생성자
	public Phone(String brand, int series, String color) {
		/*
		 * 인스턴스 변수와 메소드 지역변수 이름이 충돌할때 
		 * this 키워드를 사용하요 인스턴스 변수를 구분할수 있다.
		 * 
		 */
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	
	public Phone(String brand, int series, String color, int price) {
		this(brand, series, color);
		this.price = price;
	}
	
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series + " " + price);
	}

}







