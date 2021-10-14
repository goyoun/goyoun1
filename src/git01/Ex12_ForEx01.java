package git01;

public class Ex12_ForEx01 {

	public static void main(String[] args) {
		
		// for 문을 이용하여 1부터 10까지 합계 구하기
		// for 문을 이용해서 1부터 10까지 숫자를 만들어야 하고 이 숫자들을 더하는 과정이 필요.
		// 합계를 구하기 위한 변수 하나가 필요함.
		// 1+2+3+4+5+6+7+8+9+10
		
		// 출력을 아래와 같이 나오도록 해보세요.
		// 1+2+3+4+5+6+7+8+9+10=55

		
		int sum = 0;
		for (int i=1; i <=10; i++) {
		//1~9는 숫자+ 10 숫자=
			sum += i;
			System.out.print(i);
			if (i < 10 ) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.println(sum);
	}

}
