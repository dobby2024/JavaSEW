package section09;
/*
 * this
 * 	현재 객체를 참조하는데 사용되는 키워드.
 * 	this를 통해 내부의 인스턴스 변수, 인스턴스 메소드 또는 다른 생성자 참조 가능. 
 * 
 */
public class Constructor03 {
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.phoneInfo();
		
		Phone p2 = new Phone("아이폰", 14, "black");
		p2.phoneInfo();
		
		Phone p3 = new Phone("아이폰", 15, "white", 200);
		p3.phoneInfo();
		
		
	}

}
