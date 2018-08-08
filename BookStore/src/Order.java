import java.util.Date;

class Order2 {
	// Properties
	private int id;
	double totalPrice;
	double discountPrice;
	double netPrice;
	OrderItem[] items = new OrderItem[2];
	private Date orderDate;
	private int counter;
	
	public void addItem(OrderItem orderItem) {
		items[counter++] = orderItem;
	}

	public void calculateTotalPrice() {
		for (OrderItem orderItem : items) {
			totalPrice += orderItem.getQuantity() * orderItem.book.getPrice();
		}
	}
	
	public void calculateNetPrice() {
		netPrice = totalPrice - discountPrice;
	}
}

//class OrderBuilder {
//	Order2 order = new Order2();
//	
//	public OrderBuilder setOrderItem(int numberOfItem) {
//		order.items = new OrderItem[numberOfItem];
//		return this;
//	}
//	
//	public OrderBuilder calculatePrice() {
//		order.totalPrice = order.items.length * 8;
//		order.discountPrice = 0;
//		order.netPrice = order.totalPrice - order.discountPrice;
//		return this;
//	}
//	
//	public Order2 build() {
//		return order;
//	}
//}

public class Order {
	public static void main(String[] args) {
		
		Book book1 = new Book("First book", 8);
		Book book2 = new Book("second book", 8);
		
		OrderItem orderItem1 = new OrderItem(book1, 1);
		OrderItem orderItem2 = new OrderItem(book2, 1);
		
		Order2 order = new Order2();
		order.addItem(orderItem1);
		order.addItem(orderItem2);
		
		order.calculateTotalPrice();
		order.calculateNetPrice();
		
		System.out.println(order.totalPrice);
		System.out.println(order.discountPrice);
		System.out.println(order.netPrice);
	}
}