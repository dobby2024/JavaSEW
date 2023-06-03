package section15;

public class JavaLangClass06 {
	public static void main(String[] args) {
		String intStr = "70";
		String doubleStr = "60.5";
		
		int myScore = Integer.parseInt(intStr);
		double cutLineScore = Double.parseDouble(doubleStr);
		
		
		if(myScore >= cutLineScore ) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		
	}

}










