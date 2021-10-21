package member;

import java.util.*;

public class memberMain {

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		List<memberDTO> memberList = new ArrayList<>();
		memberService get = new memberService();

		int pick = 0;
		
		
		
		while (run) {
System.out.println("================================================= ");
System.out.println("| 1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.회원정보변경 |");
System.out.println("=================================================");
System.out.print("선택하세요 > ");
pick = scan.nextInt();

		switch (pick) {
			case 1:
				memberList=get.memberJoin(memberList);		
				
				break;
			case 2:
				get.memberListView(memberList);
				
				break;
			case 3:
				memberList=get.memberLogin(memberList);

				break;
			case 4:
				memberList=get.memberUpdate(memberList);
				
				break;
				
			case 5:
				System.out.println("종료합니다");
				run = false;
				
				break;
				
			}
			
		}
		
		

	}

}
