package firstProject;
public class MeatShopBuyerDTO {
	
	String buyer;
	String buyerNum;
		
	MeatShopBuyerDTO(String buyer, String buyerNum) {
		super();
		this.buyer = buyer;
		this.buyerNum = buyerNum;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getBuyerNum() {
		return buyerNum;
	}
	public void setBuyerNum(String buyerNum) {
		this.buyerNum = buyerNum;
	}
	@Override
	public String toString() {
		return "MeatShopBuyer [고객님성함=" + buyer + ", 고객님 번호=" + buyerNum + "]";
	}
	
	
	

}


