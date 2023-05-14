package section11.access2;

public class TopClothesCategory extends ClothesCategory{
	
	public String topClothesKind;
	
	public TopClothesCategory(String topClothesKind) {
		super.clothesKind = "상의";
		this.topClothesKind = topClothesKind;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("의류 종류: " + clothesKind);
		System.out.println("상의 종류: " + topClothesKind);
		
	}
	
	public void armband() {
		System.out.println("Armband를 사은품으로 드려요.");
	}

}
