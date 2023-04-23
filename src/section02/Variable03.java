package section02;
/*
 * 3. 정수형
 * 	byte  (1byte) : -2^7~(2^7)-1 / -128 ~ +127
 * 	short (2byte) : -2^15~(2^15)-1 / -32,768 ~ +32,767 
 * 	int   (4byte) : -2^31~(2^31)-1 
 * 						/ -2,147,483,648 ~ +2,147,483,647  
 * 	long  (8byte) : -2^63~(2^63)-1 
 * 						/ -9,223,372,036,854,775,808
 * 							~ +9,223,372,036,854,775,807		
 */

public class Variable03 {
	public static void main(String[] args) {
		// 정수형 변수 선언과 동시에 값 대입하기
		byte iByte = 10;
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;
		
		System.out.println("byte 형: " + iByte);
		System.out.println("short 형: " + iShort);
		System.out.println("int 형: " + iInt);
		System.out.println("long 형: " + iLong);
		
		// 오버플로우(overflow) 테스트
		iByte += 120;	// iByte = iByte + 120;
		System.out.println("byte overflow: " + iByte);
		
	}

}










