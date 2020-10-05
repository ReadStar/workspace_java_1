
public class Test3 {

	public static void main(String[] args) {
		//charAt() 메서드 연습
		//입력받은 주민번호(jumin)에 대한 성별 판별
		//=>뒷자리 첫번째 숫자가 1 또는 3이면 "남성" 출력
		//									  2 또는 4이면 "여성" 출력
		String jumin = "901010-1234567";
		char s = jumin.charAt(7);
		if(s == '1'|| s =='3') {
			System.out.println("남성");
		}if(s == '2'|| s=='4') {
			System.out.println("여성");
		}
		//substring() 메서드 연습
		//=>입력받은 전화번호(phone) 의 가운데 4자리 추출하여
		//		정보보호를 위해서 "****"문자열로 대체
		String Phone = "010-123-5678";
		//1. 가운데 4자리만 올때, 4자리를 "****"로 치환하는 경우
//		String midNum = Phone.substring(4, 8);
//		System.out.println(midNum);
//		System.out.println(Phone.replace(midNum, "****"));
		//2. 가운데 번호가 3자리 또는 4자리이고,
		//		가운데 번호와 뒤의 번호가 같을 수도 있을때
		//4번 인덱스부터 뒤의 '-'기호 앞까지 추출
		String midNum = Phone.substring(4, Phone.lastIndexOf('-'));
		System.out.println(midNum);
		String securityMark="";
		if(midNum.length() == 3 ) {
			securityMark="***";
		}else if(midNum.length() == 4) {
			securityMark="****";
		}
		System.out.println("전화번호 : " + Phone.replace(midNum, securityMark));
		
		String securityNum = Phone.substring(0, 4) + securityMark + Phone.substring(Phone.lastIndexOf('-'));
		System.out.println("전화번호 : " +securityNum);

		
		//split 메서드를 활용하여 문자열 분리
		String s1 = "안녕하세요.아이티윌 부산교육센터입니다.자바 수업 재밌습니까";
		String[] token1 = s1.split("\\.");
		for(String token : token1) {
			System.out.println(token);
		}
		
		//두가지 구분자를 순서대로 분리 후 출력
		String s2="자바&JSP/HTML5&CSS3/안드로이드&스프링";
		//=>슬래시 기호(/)를 기준으로 먼저 분리한 뒤
		//	   다시 &기호를 기준으로 분리
		String[] token2 = s2.split("/");
		for(String tokens2 : token2) {
//			System.out.println(tokens2);
		String[] token3=tokens2.split("&");
		System.out.println(token3[0] + "," + token3[1]);
		}
		
	}

}
