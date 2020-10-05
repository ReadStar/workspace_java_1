import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Date클래스, Calendar클래스
		 * -날짜 및 시각 정보를 처리하는 클래스
		 * -일반적으로 Calendar 클래스를 사용하여 날짜 정보를 조작,
		 *   Date 클래스를 사용하여 날짜 정보를 표현
		 */
		
		Date d = new Date();
		System.out.println(d); //toString() 생략 가능(날짜 정보 표시)
		//실제 사용하지 않지만 연, 월, 일 정보를 전달하여 객체 생성 가능
		//=>단, 연도는 1900년을 기준으로 덧셈 수행
		//	   만약 2000년도를 지정해야할 경우 100 지정
		//	   월은 0 ~ 11 사이의 범위 값을 사용하므로 1 ~ 12월 지정 시
		// 	   실제 값 -1 값을 전달해야함(가져올때는 +1 값을 사용)
//		Date d2 = new Date(100, 0, 1);//2001년 1월 1일
//		System.out.println(d2);
		//Date 객체에허 연, 월, 일 등의  개별 정보를 가져올 경우
		//getXXX() 메서드를 호출(XXX는 각 항목 정보 이름)
		int year = d.getYear() + 1900;
		System.out.println(year);
		
		//long 타입 값을 파라미터로 갖는 Date(long) 생성자 호출
		//=>1900년 1월 1일을 기준으로 long 값을 밀리초(ms) 단위로 사용하여
		//		해당 날짜 및 시각 정보를 설정
		Date d3 = new Date(1500000000000L);
		System.out.println(d3);
		
		//getTime() 메서드를 사용하여 1970년 1월 1일을 기준으로
		//밀리초 단위의 날짜 및 시각 정보를 가져올 수 있다.
		//=>초, 분, 시간, 일 단위로 변환 시
		// 	   한꺼번에 계산하기 보다 각 단위별로 따로 변환을 추천
		long gap = d.getTime() - d3.getTime();
		System.out.println(gap);
		long gapSec = gap / 1000;
		System.out.println(gapSec);
		long gapMin = gap / 1000 / 60;
		System.out.println(gapMin);
		long gapHour = gap/ 1000/ 60 /60;
		System.out.println(gapHour);
		long gapDay = gap / 1000 / 60 / 60 / 24;
		System.out.println(gapDay);
		
		System.out.println("----------------------------------------------");
		/*
		 * SimpleDateFormat 클래스
		 * -날짜 형식을 지정하여 표현 가능한 클래스
		 * -형식 지정문자 사용하여 표현할 형식 지정
		 * 	  yyyy : 연도 4자리
		 *   MM : 월 2자리
		 *   dd : 일 2자리
		 *   EEEE : 요일(전체), EE : 요일(약식 1글자)
		 *   HH: 0 ~ 23시간(KK : 1 ~ 12시간)
		 *   hh : 1 ~ 11시간 (kk : 1 ~ 24시간)
		 *   mm : 분 2자리
		 *   ss : 초 2자리
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(d));
	}

}
