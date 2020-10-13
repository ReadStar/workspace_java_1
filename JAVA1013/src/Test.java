import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		/*
		 * 정규표현식을 사용한 전화번호 양식 검증
		 * -배열에 전화번호 4개를 저장
		 * -저장된 각 번호를 정규표현식과 비교하여 규칙 일치 여부 체크
		 * -양식 : xxx-yyy-zzzz, xxx yyy zzzz 등
		 * =>앞자리 숫자 3자리로 시작(010 011)
		 * =>강둔데 자리는 숫자 3자리 또는 4자
		 * =>뒷자리는 숫자 4자리로 끝
		 * =>단, 각 자리 사이에는 - 또는 공백이 올 수도 있고, 안 올 수도 있음
		 * 
		 * 검사할 전화번호(문자열) 목록(배열 numbers 사용)
		 * 010-123-4567 = true
		 * 01112345678 =  true
		 * 010)1234 5678 = false
		 * 010 1234 567a = flase 
		 */
		String[] numbers = {"010-123-4567", "01112345678", "010)1234 5678", "010 1234 567a"}; 
		String regex = "^(010|011)(-|\\s)?\\d{3,4}[-\\s]?\\d{4}$";
		
		for (String number : numbers) {
		boolean checkRegex = Pattern.matches(regex, number);
		System.out.println(number+ "검사 결과 : " + checkRegex);
		}
	}

}
