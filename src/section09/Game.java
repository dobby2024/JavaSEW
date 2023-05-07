package section09;

public class Game {
	public String title;
	public String genre;
	public int price;
	public String console;
	
	static {
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
	}
	
	public Game() {
		System.out.println("Game 생성자 1");
		this.title = "슈퍼 마리오";
		this.genre = "모험";
		this.price = 60000;
		this.console = "닌텐도";
	}
	
	// 오버로딩
	public Game(
			String title,
			String genre,
			int price,
			String console
			) {
		System.out.println("Game 생성자 2");
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.console = console;
	}
	
	public Game(int price) {
		this();
		System.out.println("Game 생성자 3");
		this.price = price;
	}
	
	public Game(String console) {
		this(55000);
		System.out.println("Game 생성자 4");
		this.console = console;
	}
	
	
	public void info() {
		System.out.println("게임명: " +title);
		System.out.println("장르: " +genre);
		System.out.println("가격: " + price);
		System.out.println("게임기종: " + console);
	}

}
