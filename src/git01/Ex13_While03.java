package git01;

import java.util.Scanner;

public class Ex13_While03 {

	public static void main(String[] args) {
		// 정수를 입력하고 끝낼떄 0을 입력하세요
		
		Scanner scan = new Scanner (System.in);
		
		// 숫자 입력용 변수		
		int num = 0; 
		// 개수용 변수
		int count = 0; 
		// 합계용 변수
		int sum = 0;
		boolean run = true;
		
		System.out.println("정수를 입력하고 끝낼때 0을 입력하세요 ");
		
		while (run) {
			num = scan.nextInt(); //숫자를 입력받으면 합계를 구해야하고 갯수도 세야한다. 
			if( num == 0 ) {
				run = false;
			} else {
				sum +=num;
				count++; // count+=1;
			}
			
		}
		System.out.println("입력한 수는 "+count+ "개");
		System.out.println("평균은 "+(double)sum/count+" 입니다."); // 실수계산 결과를 실수 변수에 대입(소수점 이하값 있음.)
		System.out.println("평균은 "+sum/count+" 입니다."); // 정수 결과를 정수에 대입해서 몫만.

	}

}