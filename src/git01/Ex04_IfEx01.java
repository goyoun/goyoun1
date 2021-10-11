package git01;

import java.util.Scanner;

public class Ex04_IfEx01 {

	public static void main(String[] args) {
		// 스캐너로 정수를 입력받아 정수가 양수인지 음수인지 출력해보세요.
		// 0은 0입니다 라고 출력 (조건이 하나 추가되어야함)
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.println("정수 입력 : ");	
		num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
				
		

	}

}
