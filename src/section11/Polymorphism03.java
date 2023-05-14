package section11;

import section11.access2.Category;
import section11.access2.PantsClothesCategory;
import section11.access2.TopClothesCategory;

public class Polymorphism03 {
	
	public static void main(String[] args) {
		
		TopClothesCategory tcc1 = new TopClothesCategory("반팔");
		tcc1.getInfo();
		tcc1.getDiscountRate();
		
		System.out.println("=============================");
		PantsClothesCategory pcc1 = new PantsClothesCategory("청바지");
		pcc1.getInfo();
		pcc1.getDiscountRate();
		
		System.out.println("=============================");
		Category c1 = tcc1;
		c1.getInfo();
		c1.getDiscountRate();	// 10% 할인 ...
		
		System.out.println("=============================");
		Category c2 = pcc1;
		c2.getInfo();
		c2.getDiscountRate();	// 30% 할인 ...
		
		
		
	}
}











