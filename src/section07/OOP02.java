package section07;

public class OOP02 {
	public static void main(String[] args) {
		System.out.println(Card.height);
		System.out.println(Card.width);
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 number: " + card1.number);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);
		
		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 number: " + card2.number);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
		
		System.out.println("=======================================");
		
		card1.number = "K";
		
		System.out.println(card1.number);
		System.out.println(card2.number);
		
		Card.width = 72;	// static 변수 모든객체가 공유한다.
		System.out.println(Card.width);
		System.out.println(Card.width);
		
		
		
		
	}
}












