package git01;

import java.util.Scanner;

public class Ex05_IfEx02 {

	public static void main(String[] args) {
		// 정수를 입력 받아서 홀수, 짝수를 판단해보세요
		// 0보다 큰 숫자에 대해서만 홀/짝 판단을 하고 0이하의 숫자는 다시입력하라는 내용을 출력
		// 중첩 if문을 사용해보기
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수 입니다.");
			} else {
				System.out.println("홀수 입니다.");
			}
		} else {
			System.out.println("다시 입력 하세요.");
		}
		
		

	}

}
