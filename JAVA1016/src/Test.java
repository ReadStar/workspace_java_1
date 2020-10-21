import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		/*
		 * 패스워드 복잡도(유효성) 검사(Validation Check)
		 * 
		 * < 패스워드 작성 규칙 >
		 * 1. 영문자, 숫자, 특수문자만을 사용하여 8 ~ 16자리 내로 작성
		 * 2. 영문 대문자, 소문자, 숫자, 특수문자(!@#$%)중
		 * 		4가지를 조합하면 "안전도 : 우수"
		 * 		3가지를 조합하면 "안전도: 보통"
		 * 		2가지를 조합하면 "안전도 : 위험"
		 * 		1가지만 사용하면 "사용 불가능한 패스워드"
		 */
		
		//유효셩 체크를 위한 패스워드 목록 생성
		String[] passwordArr = {
				"admin123!",
				"Admin123!",
				"admin123",
				"adminroot",
				"admin123패스워드",
				"1234"
		};
		
		//Pattern 클래스를 활용한 패스워드 길이 체크
		String lengthRegex = "^[A-Za-z0-9!@#$%]{8,16}$";
		//각 규칙에 따른 복잡도 검사를 위한 정규표현식 작성
		String engUpperRegex = "[A-Z]";
		String engLowerRegex = "[a-z]";
		String numberRegex = "[0-9]";
		String specRegex = "[!@#$%]";
		for (String password :passwordArr) {
			boolean lengthResult = Pattern.matches(lengthRegex, password);
//			System.out.println(password+":"+lengthResult);
			//=>Pattern.matches()메서드는 전체 문자열에 대한
			//		정규표현식 일치 여부만 체크 가능하므로
			// 		대문자, 소문자 등 각각의 조건을 만족하는지 검사 불가능
			//=>따라서, Matcher 클래스를 활용하여 각 조건을 따로 판별 수행
			
			//if문을 사용하여 길이 체크를 통과한 패스워드만 복잡도 체크 수행하고,
			//아니면, "패스워드길이 : 8 ~ 16자리 필수" 출력
			int i = 0;
			if(lengthResult) {
				//Pattern객체의 compile()메서드를 통해 정규표현식 등록 후
				//matcher() 메서드를 호출하여 Matcher객체를 리턴받은 뒤
				//find()메서드를 호출하여 각 조건(영문, 숫자, 특수문자)을 
//				if(Pattern.compile(engUpperRegex).matcher(password).find()) {
//					i++;
//				}if(Pattern.compile(engLowerRegex).matcher(password).find()) {
//					i++;
//				}if(Pattern.compile(numberRegex).matcher(password).find()){
//					i++;
//				}if(Pattern.compile(specRegex).matcher(password).find()) {
//					i++;
//				}
				//삼항연산자를 사용할 경우
				//정규표현식을 판별하여 규칙에 부합될 경우 카운트 + 1,
				//아니면 카운트 + 0
				i += Pattern.compile(specRegex).matcher(password).find() ? 1 : 0;
				i += Pattern.compile(engUpperRegex).matcher(password).find() ? 1 : 0;
				i += Pattern.compile(numberRegex).matcher(password).find() ? 1 : 0;
				i += Pattern.compile(engLowerRegex).matcher(password).find() ? 1 : 0;
				
				
				if(i>=4) {
					System.out.println(password+ "안전도 : 우수");
				}if(i<4 && i>=3) {
					System.out.println(password+"안전도 : 보통");
				}if(i<3 && i>=2) {
					System.out.println(password+ "안전도 : 위험");
				}if(i<2 && i>=1) {
					System.out.println(password+ "사용불가 패스워드");
				}
			}else {
				System.out.println(password+"- 패스워드 길이 오류");
			}
			}
		
		System.out.println("-----------------------------------------------------------");
		/*
		 * 식별자 작성 규칙 검사
		 * 1. 첫글자 숫자 사용 불가 (영문자 또는 특수문자 $, _만 사용 가능)
		 * 2. $ _ 만 사용 가능
		 * 3. 대소문자 조합 가능, 한글 사용 가능
		 * 4. 공백문자 사용 불가
		 * 5. 길이제한 없음(1글자 이상)
		 */
		String[] variables = {
			"num","7eleven","seven11","MAX_NUM","$my_money",
			"자바","my name", "myName","abc@.com"
		};
		String variableRegex = "^[A-Za-z가-힣$_][A-Za-z0-9가-힣$_]{0,}$";
		//=>영문자, 한글, 특수문자($) 중 한글자로 시작하고
		//		두번째 글자부터 영문자, 숫자, 한글, 특수문자($_)가 0번 이상 반복
		for(String variable : variables) {
			boolean result = Pattern.matches(variableRegex, variable);
			System.out.println(variable+":"+result);
		}
		
	}
}
