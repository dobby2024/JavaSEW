package section02;
/*
 * 출력문
 * 	데이터를 화면에 출력하는 방법
 * 
 * 	System.out.println() : 괄호안 내용출력 후 행 바꿈
 *  System.out.print() : 괄호안 내용출력 행 바꿈X
 *  System.out.printf() : 문자열을 서식 문자를 이용해 형식화된 내용 출력 행 바꿈X 
 * 
 */

public class ConsolePrint {

	public static void main(String[] args) {
		System.out.print("Welcom.");
		
		System.out.println("Java World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.", 4, 22);

	}

}




