package section10;

import section09.Game;
import section10.access1.Book;
import section10.access1.Comic;

/*
 * 패키지(Package)
 *		관련된 클래스, 인터페이스 등 그룹화하는데 사용되는 디렉토리 구조.
 *
 * 		이름충돌 방지 : 같은이름 패키지를 달리하여 충돌 방지가능.
 * 		코드 구조화 : 관련된 클래스를 패키지 단위로 그룹화.
 * 		접근 제어 : 클래스나 멤버에 접근제어자를 적용하여, 해당 패키지 외부에서 접근 제한할 수 있다.
 * 
 * 접근 제한자(Access Modifier)
 * 	자바에서 클래스, 멤버변수, 메소드 등 접근 범위를 제어하는데 사용되는 키워드
 * 		public - 모든 클래스에서 접근 가능.
 * 		protected - 같은 패키지 또는 상속 관계에서 접근가능.
 * 		default - 같은 패키지 접근 가능.
 * 		private - 같은 클래스 안에서 접근 가능
 * 
 * import 
 * 	다른 패키지에 속한 클래스를 사용하기 위해 선언하는 키워드.
 * 	Ctrl + space : 하나씩 import 단축키
 * 	Ctrl + Shift + o : 전체 import 단축키
 * 	
 * 
 */

public class ExtendsClass03 {
	public static void main(String[] args) {
		Book book1 = new Book("멘토씨리즈 자바", 32000, 603, "김영우");
		System.out.println("제목: " + book1.title);
		// protected 접근제한자 라서 다른패키지 접근 불가
//		System.out.println("가격: " + book1.price+"원");	
		// default 접근제한자 라서 다른패키지 접근 불가
//		System.out.println("페이지수: " + book1.totalPage+"p"); 
		// private 접근제한자 다른 클래스 접근불가
//		System.out.println("저자: " + book1.author);
		
		
		System.out.println("====================================");
		
		Comic comic = new Comic();
		
	}
}

















