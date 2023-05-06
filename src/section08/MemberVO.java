package section08;
/*
 * VO(Value Object), DTO(Data Transfer Object)
 * 	값 오브젝트로써 목적의 맞는 변수의 집합.
 * 	주로 Database 또는 네트워크 통신 값 운반용으로 사용.
 * 
 * 	캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 
 * 					외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 */
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
