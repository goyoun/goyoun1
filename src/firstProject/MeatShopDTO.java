package firstProject;

public class MeatShopDTO {
	
	String meatName;
	String meatKinds;
	int meatCount;
	int meatPrice;
	int meatSales;
	
	
	MeatShopDTO(String meatName, String meatKinds, int meatCount, int meatPrice) {
		super();
		this.meatName = meatName;
		this.meatKinds = meatKinds;
		this.meatCount = meatCount;
		this.meatPrice = meatPrice;

	}

	public String getMeatName() {
		return meatName;
	}
	public void setMeatName(String meatName) {
		this.meatName = meatName;
	}
	public String getMeatKinds() {
		return meatKinds;
	}
	public void setMeatKinds(String meatKinds) {
		this.meatKinds = meatKinds;
	}
	public int getMeatCount() {
		return meatCount;
	}
	public void setMeatCount(int meatCount) {
		this.meatCount = meatCount;
	}
	public int getMeatPrice() {
		return meatPrice;
	}
	public void setMeatPrice(int meatPrice) {
		this.meatPrice = meatPrice;
	}
	public int getMeatSales() {
		return meatSales;
	}
	public void setMeatSales(int meatSales) {
		this.meatSales = meatSales;
	}

	@Override
	public String toString() {
		return "MeatShopDTO [meatName=" + meatName + ", meatKinds="
				+ meatKinds + ", meatCount=" + meatCount + ", meatPrice=" + meatPrice + ", meatSales=" + meatSales
				+ "]";
	}


	
}



