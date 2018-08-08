
public class OrderItem {
	// Properties
	private int id;
	Book book;
	private int quantity;
	
	public OrderItem(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
