package 배열;

public class Ex01배열기초 {
	public static void main(String[] args) {
		
		// 배열 : 같은 타입의 데이터를 손쉽게 관리하기 위해 사용하는 기능
		
		// 3명의 학생을 관리하는 프로그램 만들기 위해 이름 저장
		String stu1 = "황영규";
		String stu2 = "김예함";
		String stu3 = "장영주";
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(stu + i);
//		}
		// 변수명에는 for문에서 사용되는 i값을 적용 불가!
		//  --> 한번에 접근 불가능
		
		// 코드가 너무 길고, 메모리 공간을 많이 차지함
		
		// 1. 배열의 선언 및 생성
		// 자료형[] 배열명 = new 자료형[배열의 크기]
		// 배열명 --> 레퍼런스 변수명
		// 레퍼런스 --> 참조값 --> 주소값
		
		// String 자료형 3개를 저장 할 수 있는 dClass라는 배열을 만듦
		String[] dClass = new String[3];
		
		// 배열은 인덱스에 대응하는 데이터들로 이루어진 자료구조
		// 2. 배열에 데이터 저장
		dClass[0] = "조승재";
		dClass[1] = "최유솔";
		dClass[2] = "황영규";
//		dClass[3] = "조승재";  // 크기는 3이지만 인덱스 3 없음
		// 인덱스는 '0'부터 시작!
		// 배열의 크기 3 (인덱스 0, 1, 2)
		
		
		// Array -> 선언할 때 크기 정해놓으면 뒤에서 바꿀 수가 없다!
		
		// + 다른 방법 (선언과 초기화를 동시에 진행)
		
		String[] office = {"조자연", "최영화", "선영표", "나예호", "위홍주"};
		// 크기 : 4
		// 인덱스 : 0 - 3

		System.out.println(office);
		// 배열 위치의 주소가 출력됨 : [Ljava.lang.String;@7c30a502
		
		// 배열의 0번째 인덱스 접근
//		System.out.println(office[0]);
//		System.out.println(office[1]);
//		System.out.println(office[2]);
//		System.out.println(office[3]);
		
		// for문으로 배열의 값에 접근
		// 배열명.length  --> 배열의 크기를 알 수 있는 방법
		for (int i = 0; i < office.length; i++) {
			System.out.println(office[i]);
		}
		
		System.out.println("----------");
		
		// 정수형 배열 array 생성하기
		// 다음과 같은 값으로 배열 초기화
		// 3, 10, 4, 8, 17, 22, 31
		
		// 배열 선언
		// 자료형[] 배열명 = new 자료형[배열의 크기]
		int[] array = new int[7];
		int[] array1 = {3, 10, 4, 8, 17, 22, 31};
		
		System.out.print("배열 값 :");
		// 1. 배열에 들어가 있는 값을 모두 출력하기 (for문)
		// array1 -> 정수들이 들어가 있는 방들의 주소값
		// 접근 모든데이터에 하는 방법
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.print("배열의 짝수 :");
		// 2. 배열에 있는 값 중 짝수 출력
		// 출력하는 데이터 짝수만 --> 배열에 있는 데이터값이 짝수인지 아닌지 판단!
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {				
				System.out.print(array1[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("for-each문");
		
		for (int i : array1) {
			System.out.print(i + " ");
		}
		
	}

}
