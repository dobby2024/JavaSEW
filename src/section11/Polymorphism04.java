package section11;
/*
 * instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인
 * 
 */

import section11.access2.Category;
import section11.access2.PantsClothesCategory;
import section11.access2.TopClothesCategory;

public class Polymorphism04 {
	public static void main(String[] args) {
		int selectNum = Integer.parseInt(args[0]);
		Category selectCategory = getCategory(selectNum);
		selectCategory.getInfo();
		setCategory(selectCategory);
		
//		setCategory(new TopClothesCategory("반팔"));
	}
	
	public static Category getCategory(int selectNum) {
		Category category;
		if(selectNum == 1) {
			category = new TopClothesCategory("긴팔");
		} else {
			category = new PantsClothesCategory("청바지");
		}
		return category;
	}
	
	public static void setCategory(Category selectCategory) { //Category selectCategory = new TopClothesCategory("반팔");
		if(selectCategory instanceof TopClothesCategory) {
			TopClothesCategory tcc = (TopClothesCategory) selectCategory;
			tcc.armband();
		} else {
			PantsClothesCategory pcc = (PantsClothesCategory) selectCategory;
			pcc.belt();
		}
	}
	
}




