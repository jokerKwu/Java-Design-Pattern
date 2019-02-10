package blogCh1;

public class Order {
	private String name;
	private OrderStrategy orderStrategy;
	public Order(String name) {
		this.name=name;
	}
	public void order() {
		orderStrategy.order();
	}
	public void setOrderStrategy(OrderStrategy orderStrategy) {
		this.orderStrategy=orderStrategy;
	}
	public static void Main(String[] args) {
		Order order=new Order("�ֹ�");
		order.setOrderStrategy(new RamenStrategy());
		order.order();
		
		order.setOrderStrategy(new ChikenStrategy());
		order.order();
	}
}
interface OrderStrategy{
	public void order();
}
class RamenStrategy implements OrderStrategy{
	public void order() {
		System.out.println("����� �ֹ��߽��ϴ�.");
	}
}
class ChikenStrategy implements OrderStrategy{
	public void order() {
		System.out.println("ġŲ�� �ֹ��߽��ϴ�.");
	}
}
class RiceStrategy implements OrderStrategy{
	public void order() {
		System.out.println("���� �ֹ��߽��ϴ�.");
	}
}