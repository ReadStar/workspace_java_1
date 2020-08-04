
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 자바의 기본 데이터 타입 8가지
		 * byte, chort, int, long, float, double, char, boolean
		 *1. 정수형
		 *	-byte
		 *	-short
		 *	-int(기본형)
		 *	-long
		 *2. 실수형
		 *	-float
		 *	-double(기본형
		 *3. 문자형 - char
		 *4. 논리형 - boolean
		 *
		 *-----------------------------------------------
		 *상수(Literal)
		 *-항상 같은 값을 가지는 데이터
		 *-실제 사용하는 데이터들은 리터럴이라고 함
		 *	(ex. 정수형 리터럴, 실수형 리터널, 문자형 리터럴, 논리형 리터럴, 문자열형 리터럴                                                                                                                                                                                                                                                                                                                               )
		 */
		System.out.println(10);//정수형(int) 데이터 10 출력
		System.out.println(3.14);//실수형(double) 데이터 3.14 출력
		System.out.println('A'); //문자형(char) 데이터 'A' 출력
		System.out.println(true);//논리형(boolean)데이터 true 출력
		//정수형 중에서 long 타입 데이터는 숫자 뒤에 접미사 L 붙여서 표현
		System.out.println(100L);
		//실수형 중에서 float 타입 데이터는 숫자 뒤에 접미사 F 붙여서 표현
		System.out.println(1.5F);
		//큰 따옴표 사이에 1개 이상의 문자를 사용하는 경우 문자열이라고 함.
		// 자바에서 string 타입 데이터라고도 하며, 기본형 데이터가 아님.
		System.out.println("Hello, World");
	}

}
