package git01;

public class Ex02_WhileEx {

	public static void main(String[] args) {
		//
		
	boolean run = true;
		
		while (run) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			System.out.println("(" + i + ", " + j + ")");
		
			if ( ( i + j ) == 5 ){
				System.out.println("주사위의합이 " + (i+j) + " 이므로 종료되었습니다.");
				run = false;
			}
		}

	}

}
