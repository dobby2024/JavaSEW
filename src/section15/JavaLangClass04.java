package section15;
/*
 * 래퍼클래스(Wrapper Class)
 * 	기본 자료형을 객체로 감싸서 사용할수 있도록 해주는 클래스
 * 	Boolean, Character, Byte, Short, Integer, Long, Float, Double  
 */

public class JavaLangClass04 {
	public static void main(String[] args) {
		// 문자열 "12345"를 정수형 int로 변환 
		String intStr = "12345"; 
		int iVal = Integer.parseInt(intStr);		
		System.out.println("iVal: " + iVal);
		
		// 기본형처럼 대입 가능
		Integer num1 = 10;
		System.out.println("num1 : " + num1);
		
		Integer num2 = 10000;
		/*
		 	num1.compareTo()
			결과가 음수이면 num1 < num2
			결과가 양수이면 num1 > num2
			결과가 0이면 num1 == num2
		*/
		System.out.println("compareTo: " + num1.compareTo(num2));
		
		
		// Integer 값 문자열로 변환
		String strNum = num1.toString();
		System.out.println("strNum: " + num1.toString());
	
	}
	
}










