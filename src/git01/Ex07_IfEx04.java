package git01;

import java.util.Scanner;

public class Ex07_IfEx04 {

	public static void main(String[] args) {
		// 학점 계산 예제
		// 90~100 : A , 80~89 : B , 70~79 : C 60~69:D 59이하 F
		// 100이상 값 = 오류
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("점수를 입력하세요 : ");
		num = scan.nextInt();
		
		if (num >= 90 && num <= 100){
			System.out.println("학점은 A입니다.");
		} else if (num >= 80 && num <=89){
			System.out.println("학점은 B입니다.");
		} else if (num >= 70 && num <=79) {
			System.out.println("학점은 C입니다.");
		} else if (num >=60 && num <=69) {
			System.out.println("학점은 D입니다.");
		} else if (num <= 59 && num >=0) {
			System.out.println("학점은 F입니다.");
		} else {
			System.out.println("오류입니다 다시 입력해주세요.");
		}

	}

}
