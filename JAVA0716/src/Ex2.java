
public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 정수형에 숫자에 별도의 표시(접두사)가 없을 경우 10진수 (0 ~ 9)로 취급됨
		 * 2진수 (0 또는 1) 표기법 : 숫자 앞에 접두사 0b를 붙여서 표기
		 * 8진수 (0 ~ 7) 표기법 : 접두사 0을 붙여서 표기
		 * 16진수 (0 ~ 15, 0 ~ 9 그리고 A ~ F) 표기법 : 접두사 0x
		 * =>자동으로 10진수로 변환되어 사용
		 */
		
		System.out.println(255); //10진수
		System.out.println(0b11111111);//2진수
//		System.out.println(0b1234); //2진수 에서는 0 또는 1 외에는 표기 불가
		System.out.println(0377); //8진수
//		System.out.println(0378); //8진수에서는 0 ~ 7 외에는 표기 불가
		System.out.println(0xff); //16진수 F는 대소문자 무관
//		System.out.println(0xFg); //16진수 알파벳 A ~ F 외에는 표기 불가
		long l = 1_000_000_000_000L;
		System.out.println(l);
		
	}

}
