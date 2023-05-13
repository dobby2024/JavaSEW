package section10;
/*
 * 상속(extends)
 * 	부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며
 * 	자식 클래스는 부모 클래스를 선택해서 그 부모의 멤버를 상속받아
 * 	그대로 사용이 가능하다.
 * 
 * 	클래스 1개당 상속 1개 가능!
 * 
 * super 부모객체를 참조하는 키워드
 * 
 * 오버라이딩(Overriding)
 * 	상속받은 메소드를 자식클래스에서 재정의하여 사용하는것을 말한다.
 * 
 * 오버로딩(Overloading)
 * 	클래스 내에서 같은 이름을 가진 메소드를 여러개 정의하는 것을 말한다.
 * 	매개변수 개수 또는 타입이 다르면 가능.
 * 
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
		
		System.out.println("=============================");
		
		Laptop laptop = new Laptop();
		laptop.brand ="맥북프로";
		laptop.cpu ="M2";
		laptop.ram = 16;
		laptop.hdd = 500;
		laptop.gpu = "M2";
		laptop.display = "4K UHD";
		
		laptop.getInfo();
		
	}
}












