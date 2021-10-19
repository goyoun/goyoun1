package git01;

import java.util.Scanner;

public class Ex14_Array03 {

	public static void main(String[] args) {
		// 거스름돈 계산하기
		Scanner scan = new Scanner(System.in);
		
		int[] coin = { 1000, 500, 100, 50, 10 };
		System.out.print("거스름돈 총액 : ");
		int change =scan.nextInt();
		int money = 0;
		
		for (int i = 0; i < coin.length; i++) {
			money = change / coin[i];
			System.out.println(coin[i]+"원 : " + money + " 개");
			change = change % coin[i];
			} 
			
	}
	}

