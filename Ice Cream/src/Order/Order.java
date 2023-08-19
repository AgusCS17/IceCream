package Order;

public class Order {
	
		private Integer NoOrder;
		private String Type;
		private String Cup;
		private String Topping;
		private Integer Qty;
		
		
		
		
		
		public Order(Integer noOrder, String type, String cup, String topping, Integer qty) {
			super();
			NoOrder = noOrder;
			Type = type;
			Cup = cup;
			Topping = topping;
			Qty = qty;
		}
		public Integer getNoOrder() {
			return NoOrder;
		}
		public void setNoOrder(Integer noOrder) {
			NoOrder = noOrder;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public String getCup() {
			return Cup;
		}
		public void setCup(String cup) {
			Cup = cup;
		}
		public String getTopping() {
			return Topping;
		}
		public void setTopping(String topping) {
			Topping = topping;
		}
		public Integer getQty() {
			return Qty;
		}
		public void setQty(Integer qty) {
			Qty = qty;
		}
		
		
		
		
		
		
}	
