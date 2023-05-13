package section10;
/*
 * 상속(extends)
 * 	부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며
 * 	자식 클래스는 부모 클래스를 선택해서 그 부모의 멤버를 상속받아
 * 	그대로 사용이 가능하다.
 * 
 * 	클래스 1개당 상속 1개 가능!
 * 
 */

public class ExtendsClass01 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.brand = "삼성";
		com1.cpu = "i5";
		com1.ram = 16;
		com1.hdd = 500;
		com1.gpu ="기본 인텔 그래픽카드";
		
		com1.getInfo();
		
	}
}












