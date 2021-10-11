package git01;

import java.util.Scanner;

public class Ex08_IfEx05 {

	public static void main(String[] args) {
		// 문자데이터를 이용해 출력문을 줄여보자
		
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		String grade = "";
		
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >=60) {
				grade = "D";
			} else {
				grade = "F";
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println(score + "점 " + grade + "학점");
	}

}
