package section15.access1;

public class Sports implements Cloneable{
	public String name;
	public boolean isTeam;
	
	public Sports(String name, boolean isTeam) { 
		this.name = name;
		this.isTeam = isTeam;
	}
	
	// 오버라이딩 - 부모 메소드 자식클래스에서 재정의
	@Override
	public String toString() {
		return name + "@" + isTeam;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
}









