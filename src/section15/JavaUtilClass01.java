package section15;

import java.util.Random;

/*
 * 자바유틸패키지(java.util package)
 * 	자바에서 유용한 유틸클래스, 인터페이스를 포함하는 패키지
 * 
 * Random 클래스
 * 	난수 생성해주는 클래스
 * 
 */
public class JavaUtilClass01 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 0~99 사이 정수중 난수 발생
		int ranNum = ran.nextInt(100);
		System.out.println("난수: " + ranNum);
		
	}
}












