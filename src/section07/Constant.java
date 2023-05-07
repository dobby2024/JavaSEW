package section07;
/*
 * 상수
 * 	처음 할당된 값 변경되지 않는다.
 * 	final 예약어 사용
 * 	보통 대문자로 선언한다.
 * 
 */
public class Constant {
	
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		// 원의 반지름
		int r = 10;
		
		// 원의 넓이
		double area = PI * r * r;
		System.out.println("원의 넓이: " + area);
		
		area = 0;
		area = Math.PI * Math.pow(r, 2);
		
		
	}
}







