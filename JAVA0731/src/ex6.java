
public class ex6 {

	public static void main(String[] args) {
		/*
		 System.out.printf() 메서드
		 - 출력할 내용을 특정 형식에 맞춰 출력하는 메서드
		 - 형식 지정 문자열을 사용하여 출력할 형식을 결정하고
		   해당 형식 지정 문자열 위치에 사용될 데이터를 함께 기술
		 - 형식 지정 문자열은 % 기호 뒤에 형식을 지정할 글자 또는 숫자 지정
		 - 형식 지정 문자열 뒤에 해당 문자열에 출력할 데이트럴 차례대로 기술
		 - println() 메서드와 마찬가지로 괄호() 안에 아무것도 없으면 오류
		 	=>println()메서드는 줄바꿈 기능이 수행됨
		 */
//		System.out.println(); //줄바꿈
//		System.out.printf();  //오류
		
		//%d : 정수
		System.out.printf("값 : %d\n", 10);
		
		int num = 50000;
		System.out.printf("값 : %d\n", num);
		
		//%xd 지정 시 x만큼의 자릿수 확보 후, 우측부터 채움
		System.out.printf("값 : %10d\n", 50000);
		
		System.out.printf("값 : %f\n", 3.14);
		//%.xf 지정 시 x 만큼의 소수점 자릿수만 표현(반올림해서)
		System.out.printf("값 : %.1f\n", 3.14);
		
		//%c : 문자(char)
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("문자 : %c\n", 65); //정수 -> 문자로 변환
		System.out.printf("문자 : %C\n", 'a'); //소문자일 때 대문자로변환
		
		//%s : 문자열
		System.out.printf("문자 : %s\n", "KOREA");
		//%.xs : 문자열 좌측부터 x만큼만 출력   
		System.out.printf("문자 : %.3s\n", "KOREA");
		
		System.out.println("---------------------------");
		
		int dan = 2;
		while(dan <= 9) {
			System.out.printf(" < %d단 >", dan);
			int i = 1;
			while(i <= 9) {
				System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
				i++;
			}
		}
	}

}
