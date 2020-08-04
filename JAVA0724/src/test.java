
public class test {

	public static void main(String[] args) {

		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다");
			break;
		default:
			System.out.println("손님입니다");
		}

		System.out.println("------------------");
		int num = 4;
		switch (num % 2) {// num을 2로 나눈 나머지를 조건식으로 설정
		case 0:// 나머지가 0일때
			System.out.println("짝수 or 0");
			break;
		case 1: // 나머지가 1일때
			System.out.println("홀수");
			break;}
		
			
			System.out.println("---------------------------");
			/*
			 * 학생 점수(score)에 대한 학점(grade) 판별 A 90 ~ 100 B 80 ~ 89 C 70 ~ 79 D 60 ~ 69 F 0 ~
			 * 59 그 외 점수입력오류
			 */
			int score = 89;
			// if 문을 사용하여 점수(score)가 정상범위인지 판별
			if (score >= 0 && score <= 100) {
				switch (score / 10) {
				case 10:
					System.out.println("A");
					break;
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
				}
			} else {
				System.out.println("점수입력오류");
			}
			System.out.println("=====================================");
			String name = "K";
			switch(name) {//문자열 데이터도 switch문 조건식으로 활용가능
			case "K":
			case "k": System.out.println("KOREA");break;
			case "A":
			case "a": System.out.println("America");break;
			
		}
			System.out.println("===================================");
			//실수는 switch문에 사용불가
		
		}
	}
	
