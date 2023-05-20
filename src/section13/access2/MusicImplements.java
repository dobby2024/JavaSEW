package section13.access2;

public class MusicImplements implements Music{
	
	private String brand = "SM";

	@Override
	public void listen() {
		System.out.println("신나기 노래를 들어요!");
	}

	@Override
	public void sing() {
		System.out.println("즐겁게 노래를 불러요!");
	}
	
	public String getBrand() {
		return brand;
	}

}
