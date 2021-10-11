package git01;

import java.util.Scanner;

public class Ex09_IfEx06 {

	public static void main(String[] args) {
		// 3의 배수인지 5의 배수인지 공배수인지 둘다아닌지 알아보기
		// 음수를 입력했을시 다시 입력해달라는 문구 뜨게하기
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		if (num > 0) {
		  if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("공배수 입니다.");
		   } else if (num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		   } else if (num % 5 == 0 ) {
			System.out.println("5의 배수 입니다.");
		   } else {
			System.out.println("둘다 아닙니다.");
		}
		} else {
			System.out.println("음수이므로 다시 입력해주세요");
		}

	}

}
