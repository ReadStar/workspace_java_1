import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		//객체 생성 대신 시스템으로부터 생성된 객체 정보 가져오기
		Calendar now = Calendar.getInstance();
		
		//get()메서드를 호출하여 해당 정보 가져오기
		//=> Calendar.XXX 상수를 파라미터로 전달하여 정보의 종류 지정
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 월(0~11) => +1 필요
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek="화";
			break;
		case Calendar.WEDNESDAY:
			strWeek="수";
			break;
		case Calendar.THURSDAY:
			strWeek="목";
			break;
		case Calendar.FRIDAY:
			strWeek="금";
			break;
		case Calendar.SATURDAY:
			strWeek="토";
			break;
		case Calendar.SUNDAY:
			strWeek="일";
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month +"월");
		System.out.println(day + "일");
		System.out.println(strWeek +"요일 ");
		System.out.println(strAmPm + " ");
		System.out.println(hour +"시 ");
		System.out.println(minute + "분 ");
		System.out.println(second + "초 ");
		
		//----------------------------------------
		//Calendar 객체의 set()메서드를 호출하면 날짜 및 시각 설정 가능
//		Date d = new Date();
		Calendar cal2 = Calendar.getInstance(); //Calendar 객체 가져오기
//		Date d = cal2.getTime(); //Calendar 객체로부터 Date객체 얻어오기
		
		//Calendar 객체의 set()메서드를 호출하면 날짜 및 시각 설정 가능
		//1. set(필드명, 값)
//				=>필드명에 해당하는 정보를 전달받은 값으로 설정(변경)
		cal2.add(Calendar.DAY_OF_YEAR, 2000); //연도를 2000년으로 변경
		System.out.println(cal2.get(Calendar.YEAR));
		
		//2. set(연, 월, 일, 시, 분, 초)=>해당 값으로 날짜 및 시각 변경
		cal2.set(1999, 11, 31, 23, 59, 59);
		
		//Calendar 객체=>Date 객체로 변환 후 날짜  및 시각 정보 출력
		Date d = cal2.getTime();// Calendar객체로부터 Date객체 얻어오기
		
		//SimpleDateFormat 클래스를 활용하여
		//XXXX년 XX월XX일X요일 XX시 XX분 XX초 형식으로 출력
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 dd일 EEEE hh시 mm분 ss초");
		System.out.println(sdf.format(d));
	}
}
