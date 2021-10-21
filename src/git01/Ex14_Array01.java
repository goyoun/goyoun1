package git01;

public class Ex14_Array01 {

	public static void main(String[] args) {
//			정수 타입의 number 배열 객체 선언 (값, 크기는 결정되지 않은 상태)
			int[] number;
//			System.out.println(number[0]); 값이 없어서 출력을 할수 없음.
			int number1[];
			int[] number2 = null;
			String[] strVars = null;

			// 배열 선언 하면서 초기값 지정
			int[] number3 = { 1, 3, 12, 100, 123 };
			String[] strVars1 = { "가나", "가나다라", "abcdef", "123456@#!@" };

			// 배열에 저장된 값 출력하기 (인덱스 활용)
			System.out.println(number3[0]);
			System.out.println(number3[1]);
			System.out.println(number3[2]);
			System.out.println(number3[3]);
			System.out.println(number3[4]);
//			System.out.println(number3[5]); // out of bounds exception 발생
			System.out.println(strVars1[0]);
			System.out.println(strVars1[1]);
			System.out.println(strVars1[2]);
			System.out.println(strVars1[3]);
//			System.out.println(strVars1[4]); // out of bounds exception 발생

			// 배열 데이터 바꾸기
			// number3 배열의 2번 인덱스에 99 저장
			System.out.println(number3[2]);
			number3[2] = 99; // [] 에 번호지정을 해줘야 바뀐다.
			System.out.println(number3[2]);

			// 배열의 크기, 데이터개수 ( 몇개의 데이터가 있는지 ) 확인
			System.out.println(number3.length);
			int number3Size = number3.length;
			System.out.println(number3Size);
			// number3 배열의 크기 : 5
			// number3 배열 인덱스 : 0~4
			System.out.println(strVars1.length);
			strVars1[2] = "굳";
			System.out.println(strVars1[2]);

			// 타입 : 정수형
			// 이름 : number4
			// 크기 : 3
			// 인덱스 : 0~2
			int[] number4 = new int[3]; // 크기는3 인덱스는 0~2
			System.out.println(number4[0]); // 기본 0 으로 출력
			number4[0] = 111;
			System.out.println(number4[0]);

			// 타입 : 더블형
			// 이름 : number5
			// 크기 : 2
			// 인덱스 : 0~1
			double[] number5 = new double[2];
			System.out.println(number5[0]); // 기본 0.0 으로출력

			// 타입 : String
			// 이름 : strVars2
			// 크기 : 3
			// 인덱스 : 0~2
			String[] strVars2 = new String[3];
			System.out.println(strVars2[0]); // 기본 null 로 출력

			// 34,555,7898,1111 이 들어있는 정수형 배열 num을 선언하고
			// 이 배열에 들어있는 값을 for문을 통해 출력해보시오.

			int[] num = { 34, 555, 7898, 1111 };
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "\t");
			}

			// num 배열에 저장된 데이터의 총합과 평균 계산
			int sum = 0;
			for (int i = 0; i < num.length; i++) {
				sum += num[i];
			}
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum / num.length);

		}
	}


