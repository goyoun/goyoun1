package git01;

import java.util.Scanner;

public class Ex06_IfEx03 {

	public static void main(String[] args) {
		// 중첩 if문을 &&연산을 이용하여 if / else if / else로 표현해보기

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else if (num > 0 && num % 2 != 0){ 
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("0보다 큰 숫자를 입력하세요");
		}
	}

}
