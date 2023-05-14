package section11.access2;

public class Category {
	public String categoryCd;	// 카테고리 코드
	public String categoryName;	// 카테고리 이름
	public double discountRate;	// 카테고리 할인율
	
	
	public void getInfo() {		// 카테고리 정보
		System.out.println("카테고리: "+categoryName);
	}
	
	public void getDiscountRate() {	// 카테고리 할인 정보
		int iDiscount = (int) (discountRate*100);
		System.out.println(iDiscount + "% 할인 행사중 입니다.");
	}
	

}
