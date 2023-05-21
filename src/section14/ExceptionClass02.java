package section14;
/*
 * try-catch 에서 catch 블록을 사용하여 다양한 예외 처리를 할수 있다.
 * 
 * 부모 Exception은 하단으로 catch 블록 만들어야한다. (자식 Exception 순으로) 
 * 다형성 가능!
 * 
 */

public class ExceptionClass02 {
	
	public static void main(String[] args) {
		
		String str = "ABCDE";
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			
			System.out.println("str 첫글자 값: " + str.charAt(0));
			result = num1 / num2;
			
			System.out.println("result : " + result);
			
		} catch(NullPointerException ne) {
			System.out.println("null 포인터 익셉션 발생하였습니다.");
		} catch(ArithmeticException ae) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		} catch(Exception e) { // 다형성
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}















