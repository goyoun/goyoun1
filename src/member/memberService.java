package member;

import java.util.*;

public class memberService {
	Scanner scan = new Scanner(System.in);
	
	List <memberDTO> memberJoin (List <memberDTO> memberList){
		memberDTO join = new memberDTO();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사용하실 아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("이메일 주소 : ");
		String email = scan.nextLine();
		
		join.setId(id);
		join.setPassword(password);
		join.setName(name);
		join.setEmail(email);
			
		memberDTO d = new memberDTO(memberList.size()+1,id,password,name,email);
		memberList.add(d);
		
		return memberList;
	}
	
	void memberListView(List<memberDTO> memberList) {
		for(memberDTO d: memberList) {
			System.out.println(d);
		}
	}
	
	List<memberDTO> memberLogin(List<memberDTO>memberList){
		System.out.print("아이디 입력 : ");
		String id=scan.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password=scan.nextLine();
		
		boolean run = false;
		
		for (int i=0; i<memberList.size(); i++) {
			String ID = memberList.get(i).getId();
			String PW = memberList.get(i).getPassword();
			if(ID.equals(id) && PW.equals(password)) {
				System.out.println(memberList.get(i).getName() +"님 환영합니다.");
				run = false;
				break;
			} else {
				run = true;
			}
		}
			if (run) {
				System.out.println("틀렸습니다 다시 입력하세요");
			}
			return memberList;
		}


	
	List<memberDTO> memberUpdate (List<memberDTO>memberList) {
		
		boolean run = false;
		
		
		System.out.print("아이디 입력 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = scan.nextLine();
		
	for (int i=0; i<memberList.size(); i++) {
		String ID = memberList.get(i).getId();
		String PW = memberList.get(i).getPassword();
			
		if(ID.equals(id) && PW.equals(password)) {
		System.out.println(memberList.get(i).getName() +"님 환영합니다.");
		System.out.print("변경할 이메일 입력 : ");
		String email = scan.nextLine();
		memberList.get(i).setEmail(email);
		System.out.println("이메일 변경 완료");
				
		run = false;
		break;
		
			} else {
				run = true;
			}
		}
			if (run) {
				System.out.println("틀렸습니다 다시 입력하세요");
			}
			return memberList;
		}

}

