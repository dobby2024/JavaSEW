package section12.access1;

// 추상클래서 
public abstract class Human {
	private String name;
	private int age;
	
	public void say() {
		System.out.println("말을 해요!");
	}
	
	// 구현되지 않은 추상메소드
	public abstract void useFire();

	/*
	 * private 변수 접근할수 있는 
	 * getter / setter 메소드
	 * 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
