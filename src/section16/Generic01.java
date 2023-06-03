package section16;
/*
 * 제네릭(Generic)
 * 	컴파일 시간에 타입 안정성을 보장하면서 유연성과 재사용성을 높이기 위한 기능
 * 	1. 잘못된 타입 들어오느 것 방지
 * 	2. 변환(cast) 필요없다.
 * 
 */
public class Generic01 {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<>();
		mc1.setData("Hello, Generic!");
		
		String data = mc1.getData();
		System.out.println(data);
		
		MyClass mc2 = new MyClass();
		mc2.setData("Nice to meet you!");	// 다형성!
		String data2 = (String) mc2.getData();
		System.out.println(data2);
	}
}















