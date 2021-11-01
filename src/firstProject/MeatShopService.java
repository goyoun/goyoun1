package firstProject;

import java.util.*;

public class MeatShopService {
	
	Scanner scan = new Scanner(System.in);
	
	// 고객등록 메서드
	// 리턴타입 : List<MeatShopBuyerDTD>
	// 매개변수 : List<MeatShopBuyerDTO>buyerList
	List<MeatShopBuyerDTO> buyerJoin (List<MeatShopBuyerDTO>buyerList){
		
		System.out.print("고객님 성함을 입력해주세요 : ");
		String buyer = scan.next();
		System.out.print("고객님 휴대폰번호를 입력해주세요 : ");
		String buyerNum = scan.next();
		
		MeatShopBuyerDTO buy = new MeatShopBuyerDTO(buyer, buyerNum); //리스트에 추가하기위한 코드
		buyerList.add(buy);
		
		return buyerList;
	}
	// 고기 매입 메서드
	// 리턴타입 : List<MeatShopDTD>
	// 매개변수 : List<MeatShopDTO>meatList 
	List<MeatShopDTO> meatPurchase (List<MeatShopDTO>meatList) {
		
		System.out.print("구매하신 고기의 종류를 입력하세요 ex)돼지,소,닭,양,말 : ");
		String meatName = scan.next();
		System.out.print("고기의 부위를 입력해주세요 ex)삼겹살,갈비살,목살 : ");
		String meatKinds = scan.next();
		System.out.print("구매하신 개수를 입력해주세요 : ");
		int meatCount = scan.nextInt();
		System.out.print("구매하신 금액을 입력해주세요 : ");
		int meatPrice = scan.nextInt();
		
//		for (int i = 0; i < meatList.size(); i++) {
//			if (meatList.get(i).meatKinds.equals(meatKinds)) {
//				meatList.get(i).setMeatCount(meatList.get(i).getMeatCount()+ meatCount);
//				meatList.get(i).setMeatPrice(meatList.get(i).getMeatPrice()+ meatPrice);
				
//			}
//		}
		
		MeatShopDTO pur = new MeatShopDTO(meatName, meatKinds, meatCount, meatPrice);
		meatList.add(pur);
		
		MeatMoneyDTO money = new MeatMoneyDTO();
		money.setTotalPrice(meatPrice+money.getTotalPrice());
		
	
		
		return meatList;
	}
	
	//고기목록 메서드
	// 리턴타입 : void
 	// 매개변수 : List<MeatShopDTO>meatList
	void meatStockList (List<MeatShopDTO> meatList) {
		
		for (MeatShopDTO m : meatList) {
		System.out.println(m);
		}
	}
	
	
	// 고기 판매 메서드
	// 리턴타입 : List<MeatShopDTD>
	// 매개변수 : List<MeatShopDTO>meatList , List<MeatShopBuyerDTO> buyerList
	List<MeatShopDTO> meatSell (List<MeatShopDTO> meatList, List<MeatShopBuyerDTO> buyerList) {
		
		int buyerIndex = buyerCheck(buyerList);
		int meatIndex = meatCheck(meatList);
		
		if (buyerIndex >= 0 && meatIndex >= 0) {
					
		System.out.print("판매하실 고기 개수를 입력해주세요 : ");
		int meatCount = scan.nextInt();
		System.out.print("판매하실 금액을 입력해주세요 : ");
		int meatSales = scan.nextInt();
		
		if (meatList.get(meatIndex).getMeatCount() >= meatCount) {
		
		MeatMoneyDTO money = new MeatMoneyDTO();
		money.setTotalSales(meatSales+money.getTotalSales());
		
		meatList.get(meatIndex).setMeatCount(meatList.get(meatIndex).getMeatCount() - meatCount);
		meatList.get(meatIndex).setMeatSales(meatList.get(meatIndex).getMeatSales() + meatSales);
		
		System.out.println(meatList.get(meatIndex).getMeatName() + meatList.get(meatIndex).getMeatKinds() + " "
		                 + meatCount + "개를 " + (meatSales) + "원 에 팔았습니다. " +
		                 meatList.get(meatIndex).getMeatCount()+"개 남았습니다. ");
//		System.out.println(meatList.get(meatSales)+"원 에 팔았습니다");
		} else {
			System.out.println("입력이 잘못되었습니다. 다시 입력 해주세요");
		}

		}
		return meatList;	
	
	}
	//각 고기 판매 현황
	// 리턴타입 : void
	// 매개변수 : List<MeatShopDTO>meatList 
	void meatTotalSales (List<MeatShopDTO>meatList) {
		
		for (int i = 0; i < meatList.size(); i++) {
		System.out.println(meatList.get(i).getMeatName() + meatList.get(i).getMeatKinds() + " "
	     + "총 " + meatList.get(i).getMeatSales() + "원 팔았습니다. " ); 
		}
		
	}
	
	//현재 매출 메서드
	// 리턴타입 : void
	// 매개변수 : List<MeatShopDTO>meatList 
	void meatNetSales (List<MeatShopDTO>meatList) {
		int totalSales = 0;
		int totalPrice = 0;
		
		for(int i = 0; i < meatList.size(); i++) {
		totalSales = meatList.get(i).getMeatSales()+ totalSales;
		totalPrice = meatList.get(i).getMeatPrice()+ totalPrice;
		}
		System.out.println("현재까지 지출금액 : " + totalPrice + "원 \t현재까지 판매 매출 : " + totalSales + "원 이므로");
		System.out.println("현재 순매출은 " + (totalSales - totalPrice) + "원 입니다.");
	}
	
	// 고객정보 메서드
	// 리턴타입 : void
	// 매개변수 : List<MeatShopBuyerDTO>buyerList 
	void buyer1 (List<MeatShopBuyerDTO>buyerList) {
			
		for (MeatShopBuyerDTO b : buyerList) {
		System.out.println(b);
		
		}
	}
	
	
	// 고객이름 휴대폰 확인 메서드
	// 리턴타입 : List<MeatShopBuyerDTD>
	// 매개변수 : List<MeatShopDTO>buyerList 
	int buyerCheck(List<MeatShopBuyerDTO> buyerList) {

		System.out.print("고객님 성함을 입력해주세요 : ");
		String buyer = scan.next();
		System.out.print("고객님 휴대폰번호를 입력해주세요 : ");
		String buyerNum = scan.next();

		int indexNumber = -1;
		for (int i = 0; i < buyerList.size(); i++) {
			if (buyer.equals(buyerList.get(i).getBuyer()) 
					&& buyerNum.equals(buyerList.get(i).getBuyerNum())) {
				indexNumber = i;
			}
		}
		return indexNumber;
		
	}
	
	// 고기 이름,종류,수량 확인 메서드
	// 리턴타입 : List<MeatShopDTD>
	// 매개변수 : List<MeatShopDTO>meatList 
	int meatCheck (List<MeatShopDTO> meatList) {
		
		System.out.print("고기 종류를 입력해주세요 : ");
		String meatName = scan.next();
		System.out.print("고기 부위를 입력해주세요 : ");
		String meatKinds = scan.next();
//		System.out.print("개수 : ");
//		int meatCount = scan.nextInt();
		
		int indexNum = -1;
		for (int i = 0; i < meatList.size(); i++) {
			if (meatName.equals(meatList.get(i).getMeatName())
					&& meatKinds.equals(meatList.get(i).getMeatKinds())) {
//					&& meatCount <= (meatList.get(i).getMeatCount())) {
				indexNum = i;
			}
		}
		
		return indexNum;
	}
	


}



