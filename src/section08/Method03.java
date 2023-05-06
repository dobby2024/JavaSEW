package section08;

public class Method03 {
	public static void main(String[] args) {
		MemberVO member = new MemberVO();
		
		member.setId("1");
		member.setName("홍길동");
		
		System.out.println("id: " + member.getId());
		System.out.println("name: " + member.getName());
		
	}

}
