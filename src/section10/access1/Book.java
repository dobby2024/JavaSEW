package section10.access1;

public class Book {
	// 속성 - 멤버변수
	public String title;
	protected int price;
	int totalPage;
	private String author;
	
	public Book() {
	}
	
	public Book(String title, int price, int totalPage, String author) {
		this.title = title;
		this.price = price;
		this.totalPage = totalPage;
		this.author = author;
	}

}
