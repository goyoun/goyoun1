package Bank;

import java.util.*;

public class BankService {

	/*
	 * 고객등록 메서드 이름 : clientJoin 리턴 타입 : List<BankDTO> 매개 변수 :
	 * List<BankDTO>clientList
	 */

	List<BankDTO> clientJoin(List<BankDTO> clientList) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("계좌번호 : ");
		String accountNumber = scan.next();
		int clientNumber = clientList.size() + 1;
		int balance = 0;

		BankDTO client = new BankDTO(name, accountNumber, clientNumber, balance);
		clientList.add(client);

		return clientList;

	}

	/*
	 * 전체고객 조회 메서드이름 : clientListView 리턴 타입 : void 매개변수 : List<BankDTO>clientList
	 */

	void clientListView(List<BankDTO> clientList) {
		for (BankDTO m : clientList) {
			System.out.println(m);
		}

	}

	/*
	 * 입금 메서드 이름 : deposit 리턴 타입 : void 매개 변수 : List<BankDTO>clientList
	 */
	List<BankDTO> deposit(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		int result = clientCheck(clientList);

		if (result >= 0) {
			System.out.print("입금하실 금액 입력 : ");
			int money = scan.nextInt();
			clientList.get(result).setBalance(money + clientList.get(result).getBalance());
			System.out.println("현재 잔액은 " + clientList.get(result).getBalance());
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}

		return clientList;
	}

	/*
	 * 출금 메서드 이름 : withdraw 리턴타입 : List<BankDTO> 매개변수 : List<BankDTO>clientList
	 */
	List<BankDTO> withdraw(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		int result = clientCheck(clientList);

		if (result >= 0) {
			System.out.print("출금하실 금액 입력 : ");
			int money = scan.nextInt();
			if (clientList.get(result).getBalance() - money >= 0) {
				System.out.println(money + "원 이 출금 되었습니다.");
				clientList.get(result).setBalance(clientList.get(result).getBalance() - money);
				System.out.println("현재 잔액은 " + clientList.get(result).getBalance() + "원 입니다.");
			} else if (clientList.get(result).getBalance() - money < 0) {
				System.out.println("잔액이 부족합니다");
			}
		} else {
			System.out.println("틀렸습니다 다시 입력하세요");
		}
		return clientList;
	}

	/*
	 * 잔액 확인 메서드 이름 : checkBalance 리턴 타입 : 매개 변수 :
	 */
	void checkBalance(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		int result = clientCheck(clientList);
		if (result >= 0) {
			System.out.println("현재 잔액은 : " + clientList.get(result).getBalance());

		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	int clientCheck(List<BankDTO> clientList) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("계좌번호 : ");
		String accountNumber = scan.nextLine();

		// 로그인한 회원의 인덱스 번호를 가져가기 위한 변수 (회원번호아님)
		int indexNumber = -1;
		for (int i = 0; i < clientList.size(); i++) {
			if (name.equals(clientList.get(i).getName())
					&& accountNumber.equals(clientList.get(i).getAccountNumber())) {
				indexNumber = i;

			}
		}
		return indexNumber;
	}
}
