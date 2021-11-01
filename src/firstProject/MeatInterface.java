package firstProject;

import java.util.*;

public interface MeatInterface {
	
	//고객 등록 메서드
	List<MeatShopBuyerDTO> buyerJoin (List<MeatShopBuyerDTO>buyerList);
	
	//고기 수입 메서드
	List<MeatShopDTO> meatPurchase (List<MeatShopDTO>meatList);
	
	//고기 목록 메서드
	void meatStockList (List<MeatShopDTO> meatList);
	
	//판매 메서드
	List<MeatShopDTO> meatSell (List<MeatShopDTO> meatList, List<MeatShopBuyerDTO> buyerList);
	
	//전체 판매 현황 메서드
	void meatTotalSales (List<MeatShopDTO>meatList);
	
	// 순매출 메서드
	void meatNetSales (List<MeatShopDTO>meatList);
	
	// 고객정보 출력 메서드
	void buyer1 (List<MeatShopBuyerDTO>buyerList);
	
	// 고객이름 핸드폰 확인용 메서드
	int buyerCheck(List<MeatShopBuyerDTO> buyerList);
	
	// 고기 이름 종류 개수 확인용 메서드
	int meatCheck (List<MeatShopDTO> meatList);
	

}
