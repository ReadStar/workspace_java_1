
public class test3 {

	public static void main(String[] args) {
		// if ~ else if ~ else 연습
		// 1. 정수형 변수 num이 양수, 음수, 0인지를 판별

		int num = 3;
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");

		}
		System.out.println("---------------------");

		// 2. 정수형 변수 num이 홀수, 짝수, 0인지 판별하여 출력

		if (num % 2 == 1) {
			System.out.println("홀수");
		} else if (num % 2 == 0) {
			System.err.println("0!");
		} else {
			System.out.println("짝수");
		}
		System.out.println("-----------------------");

		// 문자 ch 가 대문자일 경우 소문자로 변환, 
				// 소문자일 경우 대문자로 변환
				// 아니면 "ch 는 영문자가 아닙니다!" 출력
				// ch 출력
		char ch = '#';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("소문자로 변환");
			ch += 32;
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("대문자로 변환");
			ch -= 32;
		} else {
			System.out.println("영문자가 아님");}
			System.out.println("ch = " + ch);
		System.out.println("-------------------------");

		// 문자 ch 가 대문자일 경우 "X : 대문자" 출력, 
		// 소문자일 경우 "X : 소문자" 출력,
		// 숫자일 경우 "X : 숫자" 출력,
		// 아니면 "X : 기타문자!" 출력
		if ( ch >= 'A' && ch <= 'Z') {
			System.out.println("소문자");
		} else if (ch > 'a' && ch <= 'z') {
			System.out.println("대문자");
		} else if (ch >= 0 && ch <= 9) {
			System.out.println("숫자");
		}else {
			System.out.println("기타문자");
		}
		System.out.println("----------------------------------");
		/*
		 * 학생 점수 (score)에 대한 학점 (grade) 판별
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 * 그 외 : :점수 입력 오류
		 */
		
		int score = 59; //점수
		String grade = ""; //학점
		//중첩 if문
		//-if문 안에 또 다른 if문이 중첩되는 형태
		// => 특정 조건을 만족할 때 새로운 if문이 다시 수행되는 문장
		if(score >= 0 &&score <= 100) {
			System.out.println("정상범위");
		//점수가 정상 범위 일 때만 학점 계산
		}
		if (score >= 90 && score <= 100) {
			grade = ("A");
		} else if (score >= 80 && score <= 89){
			grade = ("B");
		} else if (score >= 70 && score <= 79) {
			grade = ("C");
		} else if (score >= 60 && score <= 69) {
			grade = ("D");
		} else  grade = ("F");
		// else System.out.println("점수 입력 오류");
//			//0 ~ 100 사이의 점수가 아니면 계산 X
			System.out.println(score + "점" + grade + "입니다.");
			

	}
}
