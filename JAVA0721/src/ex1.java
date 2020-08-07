
public class ex1 {

	public static void main(String[] args) {
		/*
		 * 비교연산자와 논리연산자를 활용한 char 타입 연산
		 * -char 타입은 주로 비교연산자와 논리연산자를 활용하여
		 * 특정 범위 내의 문자인지를 판별하는 용도로 사용
		 * 	ex)대문자 판별, 소문자 판별, 영문자 판별, 숫자 판별 등
		 * 
		 */
		
		char ch = 'a';
		boolean result = ch >= 'A';
		System.out.println(ch + "이(가) 대문자 A 이상인가?" + result);
		
		result = ch <= 'Z';
		System.out.println(ch + "이(가) 대문자 Z(90) 이상인가?" + result);

		//문자 ch가 대문자인지 판별
		//=>대문자란 ? 'A'(65)보다 크거나 같고, 'Z'(90)보다 작거나 같음
		// => ~~고의 조건은 AND 연산자인 &&를 사용하여 결합
		result = ch >= 'A' && ch <= 'Z';
		System.out.println(ch + "이(가) 대문자인가?" + result);
		
		//문자 ch가 소문자인지 판별
		//=>소문자란" 'a'(97)보다 크거나 같고, 'z'(122)보다 작거나 같음
		result = ch >= 'a' && ch <= 'z';
		System.out.println(ch + "이(가) 소문자인가?" + result);
		
		//문자 ch가 영문자인지 판별
		//=>영문자란? 대문자 또는 소문자
		ch = 'r';
		result = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
		System.out.println(ch + "이(가) 영문자인가?" + result);
		
		//문자 ch가 숫자인지 판별
		//=> 숫자란? '0'(48) ~ '9'(57)
		ch = '1';
//		result = ch >= '0' && ch <= '9';
//		result = ch >= 48 && ch<= 57;
		result = !(ch<48)&& !(ch>57);
		System.out.println(ch + "이(가) 숫자인가?" + result);
		
	}

}
