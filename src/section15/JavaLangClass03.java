package section15;

/*
 * String 클래스
 * 	자바에서 문자열을 다루기 위해 사용되는 내장 클래스 
 * 	'java.lang' 패키지에 포함
 * 
 * 	불변(immutable)의 객체 - 생성된 후 메모리에서 문자열 값이 변경되지 않는다.
 * 						  변경 불가능 객체
 * 		1. 메모리 절약
 * 		2. 보안성 Up
 * 		3. Thread Safe
 * 
 * StringBuffer
 * 	문자열을 동적으로 다루기위한 클래스
 * 	Thread Safe O	
 * 
 * 
 * StringBuilder
 * 	문자열을 동적으로 다루기위한 클래스
 * 	Thread Safe X
 * 
 * 
 */

public class JavaLangClass03 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		if(str1.equals(str2)) {
			System.out.println("str1 과 str2는 같다.");
		} else {
			System.out.println("str1 과 str2는 다르다.");
		}
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		if(str1.equals(str3)) {
			System.out.println("str1 과 str3는 같다.");	// 1
		} else {
			System.out.println("str1 과 str3는 다르다.");	// 2
		}
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("==========================================");
		
		if(str1 == str2) {
			System.out.println("str1 과 str2는 같다.");	// 1
		} else {
			System.out.println("str1 과 str2는 다르다.");	// 2
		}
		
		if(str1 == str3) {	// 주소값 비교
			System.out.println("str1 과 str3는 같다.");	// 1
		} else {
			System.out.println("str1 과 str3는 다르다.");	// 2
		}
		
		System.out.println("==========================================");
		
		System.out.println(System.identityHashCode(str1));
		
		str1 = "def";
		System.out.println(System.identityHashCode(str1));
		
		
		// 문자열을 동적으로 다루기위한 클래스
		StringBuffer sb = new StringBuffer();
		// 문자열 추가
		sb.append("abc");
		System.out.println("sb: " + sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println("sb: " + sb);
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abc");
		System.out.println(System.identityHashCode(sBuilder));
		sBuilder.append("def");
		System.out.println(System.identityHashCode(sBuilder));
		System.out.println("sBuilder: " + sBuilder);
		
	}
}






