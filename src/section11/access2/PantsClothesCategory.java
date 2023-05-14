package section11.access2;

public class PantsClothesCategory extends ClothesCategory{
	
	public String pantsClothesKind;
	
	public PantsClothesCategory(String pantsClothesKind) {
		super.clothesKind = "하의";
		this.pantsClothesKind = pantsClothesKind;
		super.discountRate = 0.3;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("의류 종류: " + clothesKind);
		System.out.println("하의 종류: " + pantsClothesKind);
		
	}
	
	public void belt() {
		System.out.println("벨트를 사은품으로 드려요.");
	}

}
