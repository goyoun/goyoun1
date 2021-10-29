package firstProject;
import java.util.*;
public class MeatMain {

	public static void main(String[] args) {

	boolean run = true;
	Scanner scan = new Scanner(System.in);
	List<MeatShopDTO> meatList = new ArrayList<>();
	List<MeatShopBuyerDTO> buyerList = new ArrayList<>();
	MeatShopService meat = new MeatShopService();
	int pick = 0;

	while (run) {	
	System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	System.out.println("■□    [  1  ]    |      [  2  ]      |      [  3  ]       |   [  4  ]	|   [  5  ]    |   [  6  ]   |    [  7  ]   |   [  8  ]   □■");
	System.out.println("■□               |                   |                    |             |              |             |              |             □■");
	System.out.println("■□   신규 고객 등록  |    윤성이네 정육점　　  |     윤성이네 정육점	  |    판   매	|  전체 판매 현황  |    순 매 출   |    고객님 정보 　|    종  료   　□■");
	System.out.println("■□               |    수입 고기 입력     |       고기 목록	  |             |              |             |              |             □■");
	System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	System.out.print("※ 번호를 선택해주세요 : ");
	pick = scan.nextInt();

		switch (pick) {
		case 1:
		buyerList = meat.buyerJoin(buyerList);		
		break;
		
		case 2:
		meatList = meat.meatPurchase(meatList);
		break;
		
		case 3:
		meat.meatStockList (meatList);
		break;
		
		case 4:
		meatList = meat.meatSell(meatList, buyerList);	
		break;
		
		case 5:
		meat.meatTotalSales(meatList);				
		break;
		
		case 6:
		meat.meatNetSales(meatList);
		break;
		
		case 7:
		meat.buyer1(buyerList);
		break;		
		
		case 8:
		System.out.println("  시스템을 종료합니다. ");
		run = false;
		break;
		
		}
			}
				}
}


