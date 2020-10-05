
public class Test2 {

	public static void main(String[] args) {
		/*
		 * char[] 배열에 저장된 문자들을 각 타입에 따라 분류하기
		 * =>배열에 저장된 문자들에 따라 각각 다음과 같이 분류
		 * 		[대문자, 소문자, 숫자, 공백문자, 기타문자, 특수문자]
		 */
		char[] chArr = {'A', 'r', '3', ' ', '#', '가'};
		for (int i = 0; i < chArr.length; i++) {
			if(Character.isUpperCase(chArr[i])){
			System.out.println("대문자");
			}else if(Character.isLowerCase(chArr[i])) {
				System.out.println("소문자");
			}else if(Character.isDigit(chArr[i]) ) {
				System.out.println("숫자");
			}else if(Character.isWhitespace(chArr[i]) ) {
				System.out.println("공백");
			}else if(Character.isLetterOrDigit(chArr[i]) ) {
				System.out.println("기타문자");
			}else {
				System.out.println("특수문자");
			}
		}
		System.out.println("-------------------------------");
		/*
		 * 입력받은 패스워드 복잡도(유효성)체크
		 * -입력받은 패스워드를 char[]타입으로 변환
		 * -해당 배열 내의 각 문자를 판별하여 해당되는 항목당 점수 증가
		 * 	 1)대문자, 소문자, 숫자, 특수문자 항목 당 1점 가산,
		 * 		=>단, 중복 항목에 대한 점수는 1점만 증가
		 * 		=>단, 전체 길이가 8자 미만이면 "8자 이상 필수" 출력 후 종료
		 * -점수가 4점이면 패스워드 xxx : 사용가능(안전)
		 *   점수가 2~3점이면 패스워드 xxx : 사용가능(보통)
		 *   점수가 1점 이하이면 패스워드 xxx : 사용불가
		 */
		String password = "Abcd123!";
		char[] chPassword = password.toCharArray();
		//패스워드 복잡도(적합성) 체크 시 점수를 저장하기 위한 변수
		int safetyPoint = 0;
		boolean isContainUpperCase = false;
		boolean isContainLowerCase = false;
		boolean isContainDigit = false;
		boolean isContainSpec = false;
		for (char ch :chPassword) {
			if(!isContainUpperCase && Character.isUpperCase(ch)) {
				safetyPoint++;
				isContainUpperCase = true;
			}else if(!isContainLowerCase && Character.isLowerCase(ch)) {
				safetyPoint++;
				isContainLowerCase = true;
			}else if(!isContainDigit && Character.isDigit(ch)) {
				safetyPoint++;
				isContainDigit = true;
			}else if(!isContainSpec && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
				safetyPoint++;
				isContainSpec = true;
			}
		}if(chPassword.length<8) {
			System.out.println("8자 이상 필수");
		}else if(safetyPoint<=1){
			System.out.println("패스워드" + password + "사용불가");
		}else if(safetyPoint <4){
			System.out.println("패스워드" + password + "사용가능(보통)");
		}else if(safetyPoint >4) {
			System.out.println("패스워드" + password +"사용가능(안전)");
		}
		System.out.println(safetyPoint);
	}
}