package section15;

import section15.access1.Sports;

/*
 * java.lang 패키지
 * 	기본 제공해주는 패키지
 *  import 필요없이 사용가능!
 *  
 * Object 클래스
 * 	자바에서 모든 클래스의 최상위 클래스 
 * 	모든 클래스는 Object 클래스를 간접적으로 상속 받는다.
 * 	extends 생략!
 * 
 * 		equals() 메소드 : 두 객체가 동일한 객체면 true, 동일하지 않으면 false를 반환
 * 
 * 		hashCode() 메소드 : 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 * 		
 * 		toString() 메소드 : 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 * 
 * 		clone() : 새로운 객체로 복사
 * 				Cloneable 인터페이스 상속받은 객체만 사용가능
 * 
 */
public class JavaLangClass01 {
	public static void main(String[] args) {
		Sports sports1 = new Sports("수영", false);
		Sports sports2 = new Sports("수영", false);
		
		System.out.println(sports1);
		System.out.println(sports1.toString());
		
		if(sports1.equals(sports2)) {
			System.out.println("sports1 과 sports2는 같습니다.");
		} else {
			System.out.println("sports1 과 sports2는 다릅니다.");
		}
		
		System.out.println(System.identityHashCode(sports1));
		System.out.println(System.identityHashCode(sports2));
		
		System.out.println(sports1.hashCode());
		System.out.println(sports2.hashCode());
		
	}
	
	
	
}













