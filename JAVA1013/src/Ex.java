import java.util.regex.Pattern;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 정규 표현식(Regular Expression)
		 * -패턴을 기반으로 특정 조건에 맞는 문자를 검색, 치환 등 수행
		 * 		ex)패스워드 복잡도(안전도)검사, 전화번호 양식 검사 등
		 * 			=>Validation 체크
		 * -언어 등 도구와 관계 없이 동일한 패턴을 사용
		 * 		ex)자바, 자바스크립트, SQL, 네트워크 프로그래밍 등
		 * 
		 * 정규 표현식에 사용되는 클래스
		 * -java.util.regex.Pattern, java.util.regex.Matcher
		 * -Pattern클래스는 정규표현식을 컴파일 해서 관리하며, 입력 문자열에 대한 전체 일치 여부 검사 등을 수행
		 * 	 =>Matchers() : 문자열이 정규표현식에 부합되는지 검사
		 * -Matcher클래스는 패턴을 해석하고, 입력 문자열에 대한 일치 여부 검사
		 * 
		 */
		
//		//정규표현식 작성
//		//알파벳(대소문자) 2~4글자
//		String regex = "^[A-Za-z]{2,4}$";
//		String input = "abc1";
		
		
		//정규표현식 작성
		//알파벳(대소문자) 2~4글자
		String regex = "[A-Za-z-0-9가-힣]{4}$";
		String input = "abc1";
		//Pattern 클래스의 static메서드 matches()를 호출하여
		//정규 표현식문자열과 검사할 문자열을 파라미터로 전달
		//=>해당 문자열이 정규표현식에 부합되는지를 boolean 타입으로 리턴
	boolean checkRegex = Pattern.matches(regex, input);
	System.out.println(input+ "검사 결과 : " + checkRegex);
	}

}
