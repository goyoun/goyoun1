package git01;

public class Ex13_While01 {

	public static void main(String[] args) {
	// while
	// while문을 이용하여 1부터 3까지 출력하기
				
	int i = 1; // 반복변수 
	while (i <= 3) { //조건체크 , 2번째 조건체크 , 3번째 조건체크
	System.out.println("while문 내부");
	System.out.println(i); // 1을출력 , 밑에서 1++됐기 때문에 2출력 , 밑에서1++됐으니 3출력
	i++;	// 1++ 다시 1++ 다시 1++
}
	System.out.println("while문 종료: " + i); // while문은 조건이 안맞으면 그냥 패스해버림.
				
	i = 10;
	do {
		System.out.println("do while 내부");
		System.out.println(i);
		i++; // do while 은 일단 한번 실행해보고 while에서 조건체크했을때 만족하지않으면 중단해서 10 + 1 이되기때문에 11을 출력하고 끝난다
	} while(i <=20 );
	System.out.println("while문 종료 : " + i);
	for (int j=1; j <=3; j++) {
		System.out.println(j);
				
	}
	}
	}


