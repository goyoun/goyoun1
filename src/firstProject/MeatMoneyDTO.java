package firstProject;
public class MeatMoneyDTO {
	
	int totalSales;
	int totalPrice;
	
	MeatMoneyDTO(){
		
	}
	MeatMoneyDTO(int totalSales, int totalPrice) {
		super();
		this.totalSales = totalSales;
		this.totalPrice = totalPrice;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "MeatMoneyDTO [총 판매한 금액=" + totalSales + ", 총 수입한 금액=" + totalPrice + "]";
	}
	
	

}


