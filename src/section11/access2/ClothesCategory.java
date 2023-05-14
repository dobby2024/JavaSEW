package section11.access2;

public class ClothesCategory extends Category {
	
	public String clothesKind;	// 의류종류
	
	public ClothesCategory() {
		categoryCd = "001";
		categoryName = "의류";
		discountRate = 0.1;	// 10% 할인
	}
	
	
	@Override
	public void getInfo() {
		super.getInfo();
		
	}
	
	

}
