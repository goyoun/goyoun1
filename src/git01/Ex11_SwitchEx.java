package git01;

import java.util.Scanner;

public class Ex11_SwitchEx {

	public static void main(String[] args) {
		
			/*
			 * switch case를 이용한 간단한 사전
			 * 이 사전에는 딱 4개의 단어만 들어 있음.
			 * desk(책상), chair(의자), monitor(모니터), mouse(마우스)
			 * 
			 * 프로그램을 실행하면 영어 단어를 입력 받고 위의 네 단어중 하나를 입력 했을 때 해당 의미를 출력해줌.
			 * 사전에 없는 단어를 입력하면 사전에 없는 단어 입니다 라고 출력
			 */
			
			Scanner scan = new Scanner(System.in);
			String word = "";
			System.out.print("단어를 입력하세요 : ");
			word = scan.nextLine();
			
			switch (word) {
			case "desk" :
				System.out.println("책상 입니다.");
				break;
			case "chair" :
				System.out.println("의자 입니다.");
				break;
			case "monitor" :
				System.out.println("모니터 입니다.");
				break;
			case "mouse" :
				System.out.println("마우스 입니다.");
				break;
			default :
				System.out.println("사전에 없는 단어 입니다.");
				
			}

	}

}
