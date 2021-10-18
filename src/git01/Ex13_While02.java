package git01;

public class Ex13_While02 {

	public static void main(String[] args) {
		// while 문을 이용하여 1부터 10까지 합계 출력
		// 1+2+3+4+5+6+7+8+9+10 = 55 출력하기
		
		int i = 1;
		int sum = 0;
		
		while( i <= 10) {
			sum += i;
			System.out.print(i);
			i++;
			if (i <= 10) {
				System.out.print("+");
			} else {
				System.out.println("="+sum);
			}
			
			}

		}

	}
//		int i = 1, sum = 0 ; 선생님코드
//
//while(i <= 10) {
//	System.out.print(i);
//	sum += i;
//	if ( i < 10) {
//		System.out.print("+");
//	} else {
//		System.out.print("=");
//	}
//	i++;
//}
//System.out.println(sum);
//System.out.println(i);

