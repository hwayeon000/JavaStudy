package ex변수;

public class Ex02변수종류 {
	public static void main(String[] args) {
		
		// 변수의 종류 알아보기
		// 크게 두가지로 나뉨
		// 1. 기본타입(Basic, Primitive)
		
		// 정수형 (byte, char, short, int, long)
		// byte (1byte, 8bit) : -128 ~ +127
		byte num1 = 127;
		// short (2byte, 16bit)
		short num2 = 4000;
		// int (4byte, 32bit)
		int num3 = 200000;
		// long (8byte, 64bit)
		long num4 = 22222222;
		
		// 실수형 (float, double)
		// float (4byte, 32bit)
		// java에서는 기본 실수형태 자료형을 double로 인식함
		// float로 사용하고 싶다면 데이터 앞에 (float) 또는
		// 데이터 뒤에 F, f 라고 명시해줘야 함
		// float num5 = (float)3.14;
		// float num5 = 3.14F;
		float num5 = 3.14f;
		// double (8byte, 64bit)
		double num6 = 25.15;
		
		// 논리형 (boolean)
		// boolean (1byte, 8bit)
		boolean isCheck1 = true;
		boolean isCheck2 = false;
		
		// 문자형 (char)
		// char (2byte, 16bit)
		// 문자 - 한글자만 해당 ''로 표현
		// 문자열 - 한글자를 포함한 두글자 이상 ""로 표현
		char ch = '가' + 10;
		System.out.println(ch);
		
		// 문자열을 저장 할 수 있는 자료형 : String
		// 레퍼런스 데이터 타입 --> oop 
		String name = "박화연";
		// "" (큰따옴표)를 사용해서 저장하고싶은 데이터 감싸주기
		System.out.println(name);
		System.out.println("name");
		// print문을 사용하여 변수 확인을 원하면 '', "" 붙이면 안됨
		
		
		
		
		// 2. 참조타입(Reference)
		// 나중에~ 
		
		
	}

}
