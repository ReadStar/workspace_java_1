
//com.lg.tv 패키지를 소스코드에 포함시키기 위한 import 작성
//import com.lg.tv.*; //패키지 내의 모든 클래스를 포함하는 경우
//import com.lg.tv.Tv; //패키지 내의 특정 클래스만 포함하는 경우

//패키지가 다르고 이름이 동일한 클래스는 동시에 import 불가능
//iport com.samsung.tv.Tv; =>오류
//사용가능
import com.samsung.tv.*;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 패키지(Package)
		 * -클래스 파일이 위치하는 물리적 폴더 구조
		 * -패키지가 다르면 같은 이름의 클래스도 각각 별도로 관리가 가능함
		 * -패키지명은 상위패키지와 하위패키지로 구분하여
		 *   패키지 내에 또 다른 패키지를 생성할 수 있음
		 *   =>각 패키지 단계를 마침표(.)로 구분하여 지정
		 * -패키지명은 보통 각 회사의 도메인 이름을 사용하며
		 *  도메인 이름을 상위도메인부터 역순으로 나열하여 지정
		 *  (ex. samsung.com일 경우 com.samsung으로 지정)
		 * -특정 패키지에 소속된 클래스의 소스코드 최상단에는 반드시
		 *   package키워드를 사용하여 소속 패키지의 이름을 명시해야함
		 *   =>단, 하나의 클래스는 하나의 패키지에 소속되므로
		 *       package문은 소스 코드 최상단에서 단 한번만 선언 됨    
		 * -특정 클래스의 이름을 나타내는 기본적인 규칙은
		 * 	  "패키지명.클래스명"의 형태로 지정하는 것이 기본이나
		 *   현재 패키지 내에 중복되는 클래스가 없을 경우 패키지명 생략 가능   
		 *   <기본문법>
		 *   package 상위패키지명.하위패키지명;
		 *   
		 *  import 
		 * -특정 패키지에 소속된 클래스를 소스코드에 포함시키는 문
		 * -해당 패키지명과 클래스명을 조합하여 특정 클래스를 지정하거나
		 * -클래스명 대신 * 기호로 해당 패키지의 모든 클래스를 지정 가능
		 * -package 문과 class 선언부 사이에 위치하며,
		 * 	 package 문과 달리 갯수 제한없이 여러번 사용 가능
		 * -자동 import 단축키 : shift + cmd + O
		 * -java.lang 패키지는 유일하게 import 문 생략이 가능한 패키지
		 *  (자바에서 가장 기본이 되는 패키지이므로 자동으로 포함됨)
		 *  
		 * <기본문법>
		 * import 상위패키지명.하위패키지명.클래스명;
		 * import 상위패키지명.하위패키지명.*;
		 */

		//원래 사용흐던 클래스 지정 방식(패키지명을 생략하고 사용)
		String str = "홍길동";
		
		//실제 String클래스를 지정하는 정석적인 방법
		//=> java.lang 패키지 내에 위치하므로
		java.lang.String str2 = "홍길동";
		
		//com.lg.tv 패키지의 Tv클래스 지정하여 객체 생성
//		com.lg.tv.Tv tv = new com.lg.tv.Tv();
		
		//com.lg.tv 패키지명을 생략하기 위해서는
		//해당 패키지를 import문을 통해 현재 소스에 포함시켜야함
		Tv tv = new Tv();
		
		//com.samsung.tv 패키지 내의 Tv클래스를 사용해야 하는 경우
		//=>이미 com.lg.tv 패키지의 Tv 클래스가 import 되어 있으므로
		//	    다른 페키지의 Tv 클래스는 패키지명을 포함해서 지정해야함
		//		(동일한 클래스를 import 할 수 없다)
		com.samsung.tv.Tv tv2 = new com.samsung.tv.Tv();
		
		//import 문을 사용하여 com.lg.tv.Tv 위치를 지정했을 경우
//		Tv2 lgTv2 = new Tv2();
		
		//import 문을 사용하여 com.lg.tv.Tv위치를 지정했을 경우
//		LgTv lgTv = new LgTv(); //위치를 몰라 사용 불가
		//=>import 문을 추가하거나 tv.*로 변경해야하거나 패키지명.클래스명 형태로 지정
		
		//import 문을 사용하여 "com.samusng.tv.*"위치를 지정했을 경우
		SamsungTv samsungTv = new SamsungTv(); // 사용가능
	}

}
