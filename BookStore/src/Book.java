
public class Book {
	// Properties
	private String name;
	private double price;
	
	public double getPrice() {
		return price;
	}

	// Constructor
	public Book() {
		this("N/A", 0);
	}
	
	public Book(String name) {
		this(name, 8);
	}

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
		
	// Methods
	public static Book createNewBookWithName(String name) {
		Book book = new Book();
		book.name = name;
		book.price = 8;
		return book;
	}


}

class BookStore {
	public static void main(String[] args) {
		Book book1 = new Book("First Name", 8);
	}
}