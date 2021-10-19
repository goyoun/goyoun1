package git01;

public class Ex14_Array04 {

	public static void main(String[] args) {
			// 정렬 알고리즘
			// 정렬되어가는 과정
			// 1. 32154 > 23154 > 13254
			// 2. 12354
	// 3. 12354
	// 4. 12345

	int[] num = { 3, 2, 1, 5, 4 }; // 1,2,3,4,5 순서로 출력되게 하여라
	// ㄴ {1, 2, 3, 4, 5} 만들기
	int num2 = 0;
			
		for (int i = 0; i < num.length; i++) {
			num2 = num[i];
			System.out.println("그냥아이 :"+i);
			for (int j = i+1; j < num.length; j++) {
				System.out.println("그냥제이: "+ j);

				if (num2 > num[j]) {
					num2 = num[j];
					num[j] = num[i];
					num[i] = num2;
				System.out.println("넘아이: "+ num[i]);
				System.out.println("넘투: "+ num2);
				System.out.println("넘제이: "+ num[j]);
					}
				} System.out.println(num[i]+" ");
			}
		}
	}


