package git01;

import java.util.Scanner;

public class Ex10_IfEx07 {

	public static void main(String[] args) {
		// 학년, 점수를 각각 입력받고 합격 / 불합격을 판단한다
		// 1~3학년 : 점수가 60점 이상일때 합격
		// 4학년 : 점수가 70점 이상일때 합격
		// 위 두조건을 만족하지 않을때는 불합격

		Scanner scan = new Scanner(System.in);
		int score = 0;
		int year = 0;
		System.out.print("학년을 입력하세요 : ");
		year = scan.nextInt();
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();

		if (score >= 60) {
			if (year < 4 ) {
				System.out.println("합격");
			} else if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}

	}

}
