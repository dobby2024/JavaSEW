package section09;


public class Constructor02 {
	public static void main(String[] args) {
		Game game1 = new Game();
		game1.info();
		
		System.out.println("===================================");
		
		Game game2 = new Game("젤다","모험",76000,"닌텐도");
		game2.info();
		
		System.out.println("===================================");
		
		Game game3 = new Game(35000);
		game3.info();
		
		System.out.println("===================================");
		
		Game game4 = new Game("PlayStation");
		game4.info();
		
		
	}
}
