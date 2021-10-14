package git01;

import java.util.Scanner;

public class Ex12_ForEx02 {
	
	public static void main(String[] args) {
		// 시작값과 끝값을 지정해서 그 수를 더하는 프로그램
		// x 부터 y 까지의 합은 z 입니다 까지 출력

		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int num = 0;
		int num2 = 0;

		System.out.print("시작값 : ");
		num = scan.nextInt();

		System.out.print("끝값 : ");
		num2 = scan.nextInt();

		for (int i = num; i <= num2; i++) {
			sum += i;
			System.out.print(i);
			if (i < num2) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}

		}
		System.out.println(sum);
		System.out.println(num + "부터 " + num2 + " 까지의 합은 " + sum + " 입니다.");
	}

}


