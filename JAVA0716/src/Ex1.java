
public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 자바 기본 데이터타입
		 * -정수형 : byte(1) short(2) int(4) long(8)
		 * -실수형 : float(4) double(8)
		 * -문자형 : char(2)
		 * -논리형 : boolean(1)
		 * -각 데이터타입의 크기에 따라 표현 가능한 데이터의 범위가 달라짐
		 * byte 타입(1Byte = 8bit): -128 ~ +127 표현가능
		 * short 타입 (2Byte = 16bit) : -32768 ~ +32767 표현가능
		 * int 타입 (4Byte = 32bit) : -21억 ~ +21억 표현가능
		 * long 타입 (8Byte = 64bit) : -922경 ~ +922경 까지 표현가능
		 * =>long 타입 정수 표현을 위해서는 숫자 뒤에 접미사 L 붙여서 표현
		 *
		 *실수형 데이터타입
		 *-정수형과 다른 방식으로 숫자를 표현하기 때문에
		 *	메모리 크기와 상관없이 무조건 실수형은 정수형보다 큰 범위 숫자 표현 가능
		 * float 타입 (4Byte = 32bit)
		 * double 타입 (8Byte = 64bit)
		 */
		

		//정수형 표현 범위
		byte b = 127; // byte 타입 변수 b에 정수 100 저장
		System.out.println(b);
		//byte 타입 변수 b에 정수 128 저장
		//b = 128;//오류 발생! byte 타입에 저장 가능한 정수는 -128 ~ +127
		
		short s = 128;
		System.out.println(s);
		s = 32767;
		//s = 32768; //short 타입 short타입에 저장 가능한 정수 -32768 ~ +32767까지
		int i = 32768;
		System.out.println(i);
		i=2147483647;
//		i=2147483648; 정수형의 기본 타입은 int 형이며, int형의 표현 가능 범위는 약 21억이다.
//		따라서 정수 기본형태로 표현 가능한 숫자의 범위가 21억으로 한정되어 있음
//		int형으로 표현 불가능한 정수는 log 타입으로 표현해야함
//		long 타입 숫자를 나타내기 위해서는 숫자 뒤에 접미사 L을 붙여서 표현
//		I=2147483648L; // long 타입 데이터는 int형 변수에 저장 불가
		
		long l = 2147483648L;
		System.out.println(l);
		
		
		float f = 3.14f;
		System.out.println(f);
		f = 100000000000000000000f;
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
	}


}
