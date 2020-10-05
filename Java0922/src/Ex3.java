
public class Ex3 {
	public static void main(String[] args) {
		/*
		 * String 클래스의 다양한 메서드
		 * 
		 */
		String s1 =  "Java Programming!";
		String s2 = "               아이티윌       부산 교육센터             ";
		String s3 = "뫄뫄/솨솨/롸롸";
		//length(): 문자열 길이 리턴
		System.out.println("s1.length(): " + s1.length());
		//equals(Object o) : 문자열 비교(대소문자 구별)
		System.out.println("s1 과 s2는 같은 문자열인가?" + s1.equals(s2));
		//equalsIgnoreCaseObject o() : 문자열 비교(대소문자 구별 없음)
		System.out.println("s1과 JAVA PROGRAMMING!은 같은 문자열인가?"
				+s1.equalsIgnoreCase("JAVA PROGRAMMING!"));
		//charAt(int index) : 인덱스(index)위치의 문자 1개 리턴
		//=>인덱스 번호는 자동으로 부여되며, 0~문자열길이 -1까지 사용
		System.out.println("s1의 5번 인덱스 문자 : " + s1.charAt(5));
//		System.out.println("s1의 5번 인덱스 문자 : " + s1.charAt(17));
		//=>배열과 마찬가지로 존재하지 않는 인덱스일 경우 오류가 발생함
		
		//indexOf(String str)
		System.out.println("s1 문자열에 Program이 존재하는가?" 
															+s1.indexOf("Program"));
		//char 타입으로도 파라미터 전달 가능(문자 1개)
		System.out.println("s1문자열에 a가 존재하는가?" + s1.indexOf('a'));
		//int lastIndexOf(String str 또는 int ch)
		//=>문자열의 마지막(뒤)부터 탐색(역방향 탐색) = 인덱스 번호는 동일
		System.out.println("s1문자열에 a가 존재하는가?" + s1.lastIndexOf('a'));
		//boolean contains(CharSequence s) : 문자열 존재(포함) 여부 리턴
		System.out.println("s1 문자열에 Program이 존재하는가? " + s1.contains("Program"));
		System.out.println("s1 문자열에 JSP가 존재하는가?" + s1.contains("JSP"));
		
		//replace() : 문자 또는 문자열 치환
		//String replace(char, char) or String replace(String, String)
		
		System.out.println("s1 문자열의 a를 @로 치환" + s1.replace('a', '@'));
		System.out.println("s1 문자열의 Java를 JSP로 치환 " + s1.replace("Java", "JSP"));
		
		//substring() : 부분 문자열 추출
		//substring(int beginIndex) : beginIndex 부터 끝까지 추출
		//substring(int beginIndex, int endIndex) : beginIndex 부터 endIndex-1 까지 추출
		System.out.println("s1의 5번 인덱스부터 끝까지 추출 : " + s1.substring(5));
		System.out.println("s1의 5번 인덱스부터 끝까지 추출 : " + s1.substring(5, 12));
		
		//toUpperCase() : 대문자 변환
		System.out.println("s1.toUpperCase() :" + s1.toUpperCase());
		//toLowerCase() : 소문자 변환
		System.out.println("s1.toLowerCase() : " + s1.toLowerCase());
		
		//concat():문자열 결합 (연결연산자 +에 비해 결합 속도가 빠름)
		System.out.println("s1.concat()" + s1.concat("ITWILL"));
		
		//trim() : 문자열 앞 뒤의 불필요한 공백 제거
		System.out.println("s2.trim() :"  + s2.trim() + "!");
		
		
		//String[] split(String regex) : 구분자(분리자 = Delimeter)를 사용하여 문자열 분리
		//구분자는 정규표현식 문법을 사용
		String[] tokens = s3.split("/");
		//=>슬래시기호(/)를 기준으로 문자열 분리하여 String[]배열에 저장
		//=>마침표(.)를 기준으로 지정하려면 "\\." 형태로 저장
		for(String token : tokens) {
			System.out.println(token);
		}
				
				
		//valueOf() : 기본 데이터타입 데이터타입 -> 문자열로 변환
		int num = 20;
		String str2 = String.valueOf(20);
		
		//String str = num.toString(); //기본타입 변수는 메서드 호출 불가
		String str = num + " "; //기본타입->문자여롤 변환(널스트링 결합)
		
		//----------------------------
		//format(String str, Object...args)
		//=>문자열 내에 형식 지정 문자를 사용하여 전달된 데이터를 형식에 맞는 문자열로 포맷을 변환
		//=>String str 파라미터에 형식 문자를 지정하고, object...args의 가변인자는 형식 지정문자 자리에 전달될 데이터를 형식 지정 문자 갯수에 맞춰 전달
		//=>prinft() 메서드와 동일한 역할을 수행하며, printf()메서드는 출력용으로만 사용 가능하지만, format()메서드는 String타입  변수에 문자열 저장이 가능
				String formatString = String.format("이름 : %s, 나이 : %d, 키 : %f", 
						"홍길동", 20, 180.5);
				System.out.println(formatString);
				System.out.printf("이름 : %s, 나이 : %d, 키 : %f", 
						"홍길동", 20, 180.5);
				
				
				
				System.out.println("================================");
				//String 클래스는 불변 클래스이므로
				//어떤 작업을 수행하더라도 원본 문자열은 변하지 않는다
				//=>작업 결과가 대부분 새로운 문자열로 생성됨
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				
				//String 클래스의 리턴타입이 String 타입인 경우
				//결과값에 이어서 바로 다른 메서드 호출 가능
				System.out.println(s2.trim().substring(0,5).indexOf("아이티윌"));
				
				
				
				// =빌더 패턴(Builder Pattern)
				System.out.println(s2.trim().indexOf("아이티윌"));
				
				//=>trim() 메서드로 공백을 제거한 뒤, 바로 "아이티윌"을 검색하여
				//		0번 인덱스 리턴(공백이 제거되었으므로 아이티윌은 0번부터 시작)
	}
}
