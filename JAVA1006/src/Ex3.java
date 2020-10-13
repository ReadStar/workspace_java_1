import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) throws ParseException {
		/*
		 * 형식화 클래스
		 * 
		 * 1. SimpleDateFormat 클래스
		 * 		-날짜/시각 정보에 대한 패턴을 사용하여 파싱/포맷팅처리
		 * 		-파싱 : 문자열을 Date타입으로 변환 =>parse() 메서드
		 * 		  포맷팅 : Date타입 갭체를 문자열로 변환 => format() 메서드
		 * 2. DecimalFormat 클래스
		 * 		-숫자에 대한 패턴을 사용하여 파싱/포맷팅 처리
		 * 		-메서드는 SimpleDateFormat 클래스와 동일
		 * 		-형식 지정 문자(패턴)만 다름
		 * 		  0: 0 ~ 9 사이 숫자 1자리(값이 없으면 0으로 채움)
		 * 		  # : 0 과 동일하나 값이 없으면 0으로 채우지 않음
		 * 		   . : 천 단위 구분 기호
		 * 3. MessageFormat 클래스
		 */
		
		
		//1. SimpleDateFormat
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E KK:mm:ss");
		//지정된 형식에 맞게 Date 타입을 문자열로 변환 = 포맷팅
		String strDate = sdf.format(d);
		System.out.println(strDate);
		
		Date parsedDate = sdf.parse(strDate);
		System.out.println(parsedDate);
		
		//2.DecimalFormat
		double originalNum = 123.55; //원본
		//DecimalFormat 클래스의 객체 생성 시 형식 지정문자(패턴) 설정
		DecimalFormat df = new DecimalFormat("₩#,###.#");
		//=>맨 앞에 통화기호 뒤에 정수와 실수 지정
		//		정수는 3자리마다 콤마(,) 표기, 실수는 1자리로 표기
//		System.out.println(df.format(originalNum));
		String formatNum = df.format(originalNum);
		System.out.println(formatNum);
		
		double parsedNum = (double)df.parse(formatNum);
		System.out.println(parsedNum);
		System.out.println("-------------------------------");
		
		//3.MessageFormat
		//특정 패턴을 사용하여 데이터를 변수처럼 지정한 후 연결에 사용
		
		String pattern = "이름 {0}, Java : {1}, JSP: {2}, DB : {3}";
		String name = "홍길동";
		int java = 90, jsp = 100, DB = 80;
		String parsedStr = MessageFormat.format(pattern, name, java, jsp, DB);
		System.out.println(parsedStr);
		
		String originalStr = "홍길동 : 90:100:80, 이순신:50:50:50, 강감찬:80:70:100";
		
		//메세지 패턴 생성 => 패턴에 포함될 데이터가 들어갈 자리를
		//중괄호{} 로 지정하고, 중괄호 안에 패턴 데이터 순서 번호(0부터) 지정
		//=>패턴 문자열 내부에 데이터가 들어갈 부분이 4군데
		
		String[] strArr = originalStr.split(",");
		for(String str : strArr) {
//			System.out.println(str);
			System.out.println(MessageFormat.format(pattern, str.split(":")));
		}
		
	}

}
