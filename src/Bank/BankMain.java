package Bank;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		List<BankDTO> clientList = new ArrayList<>();
		BankService cli1 = new BankService();

		int pick = 0;
		
		
		
		while (run) {
System.out.println("====================================================== ");
System.out.println("| 1.고객등록 | 2.전체고객조회 | 3.입금 | 4.출금 | 5. 잔액확인 |");
System.out.println("======================================================");
System.out.print("선택하세요 > ");
pick = scan.nextInt();

		switch (pick) {
			case 1:
			clientList=cli1.clientJoin(clientList);		
	
			break;
			
			case 2:
				cli1.clientListView(clientList);
	
				break;
			case 3:
				cli1.deposit(clientList);

				break;
			case 4:
				cli1.withdraw(clientList);
	
				break;
				
			case 5:
				cli1.checkBalance(clientList);
				
				break;
	
			case 6:
				System.out.println("종료합니다");
				run = false;
				break;
			}

	}

	}
}