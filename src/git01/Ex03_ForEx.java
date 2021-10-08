package git01;

public class Ex03_ForEx {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) { // 구구단 단수 출력 
			for (int j = 1; j <= 9; j++) { // 곱하는수 출력 
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
			}
			System.out.println(); //줄바꿈
			
		}

	}

}
