import java.text.DecimalFormat;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Test {

	public static void main(String[] args) {
		double num = Math.PI;
		//PI 값의 소수점 넷째자리에서 반올림하기
//		num = num * 1000;
		//원하는 자리 숫자가 소수점 첫번째에 오도록 가중치 곱함
//		Math.round(num);
//		System.out.println(Math.round(num));
		//가중치를 곱한 값의 반올림 계산 후 원래자리로 되돌리기 위하 다시 가중치로 나눔
		//단, 정수끼리 나눗셈이 되지 않도록 실수로 변환하여 나누기
//		System.out.println(Math.round(num * 1000) / 1000.0);
		
		
		//pow메서드를 사용하여 자릿수를 변경하면서 반올림 수행
		int roundPosition = 4; //받올림을 수행할 자릿수 지정
		//입력받은 자릿수 -1 값을 10의 승수로 계산하면 표현할 자릿수 계산^3 = 1000 을 가중치로 사용해야함
		int weight = (int)Math.pow(10, roundPosition -1);
		System.out.println(weight);
		System.out.println((double)Math.round(num * weight)/weight);
		
		/*
		 * 로또 번호 생성기
		 * -1~45 범위의 난수 6개를 myLotto 배열에 저장 후 출력
		 * -단, 배열에 저장되는 난수는 중복되는 숫자가 없어야 함
		 * -1등 당첨번호(35, 3, 1, 7, 9, 15)를 배열 thisWeekLotto 로 생성하여, 자신의 로또번호와 비교한 뒤
		 *   일치하는 숫자 갯수를 출력 
		 *   <실행 예시>
		 *   나의 로또 번호 : 40, 15, 10, 25, 7, 32
		 *   1등 당첨 번호 : 35, 3, 1, 7, 9, 15
		 *   일치하는 숫자 갯수 : 2개
		 */
		int thisWeekLotto[] = {8, 21, 25, 38, 39, 44, 28};
		int myLotto[];
		myLotto = new int[7];
//		1.for문을 사용하여 중복 비교
		for (int i = 0; i < myLotto.length; i++) {
			int rNum= (int)(Math.random()*45)+1; //난수 생성
			myLotto[i] = rNum; //배열에 저장
			//중복제거를 위해 배열 내의 저장된 숫자와 난수 비교
			//->현재 인덱스[i] 까지만 비교
			for (int j = 0; j < i; j++) {
				if (myLotto[i]==myLotto[j]) {
					//현재 인덱스 i를 1만큼 감소시켜 새 번호 저장
					i--;
					break;
					}
				}
		}
		//2.현재 저앙되는 로또 번호 갯수 카운팅 변수를 하나 선언한 뒤
//			  While무을 사용하여 중복 제거 작업을 수행
//		int count=0; //현재 저장된 로또 번호 갯수를 카운팅하는 변수
//		DUPLICATE_LOOP_POINT;
//		while(count <6) {
//			int rNum = (int)(Math.random()*45)+1;
//			//count 변수를 제어변수 역할로도 활용 가능
//			//for문을 사용하여 현재까지 저장된 숫자 중에서 중복 숫자 체크
//			//1. 중복 체크 변수 활
////			boolean isDuplicate = false;
////			for(int i =0; i<count; i++) {
////				if(rNum == myLotto[i]) {//중복되는 숫자가 존재할 경우
////					isDuplicate = true;//중복표시
////					break;
////				}
////			}
////			if(!isDuplicate) {
////				myLotto[count] = rNum;
////				count++;
////			}
//			//2 continue 문과 label을 활용할 경우
//			for(int i=0; i< count; i++) {
//				if(rNum==myLotto[i]) {
//					continue DUPLICATE_LOOP_POINT;
//				}
//			}
//			myLotto[count] = rNum;
//			count++;
//		}
		//1. 배열 내의 항목 오름차순 정렬
		Arrays.sort(myLotto);
		Arrays.sort(thisWeekLotto);
		//2. 배열 내의 요소를 문자열로 변환하여 리턴=> 출력용으로 주로 사용
		System.out.print("나의 로또 번호 : " + Arrays.toString(myLotto));
		System.out.print(" / 1등 당첨 번호 : " + Arrays.toString(thisWeekLotto));
		int sameCount = 0; //일치하는 갯수 변수
		for(int i =0; i<myLotto.length; i++) {
			for(int j=0; j<thisWeekLotto.length; j++) {
				if(myLotto[i] == thisWeekLotto[j]) {
					sameCount++;
				}
			}
				
		}
		System.out.println(" / 일치하는 번호 갯수 : " + sameCount);
//		4자리 난수
//		int num2 = (int)(Math.random()*10000);
//		System.out.println(Integer.toString(num2));
//		String ps="";
//		for (int i = 0; i <4; i++) {
//			int ran = (int)(Math.random()*10);
//			Integer.toString(ran);
//			System.out.println(ran++);
//			 ps += ran;
//		}
//		System.out.println(ps);
		System.out.println("==================================");
		// =====================================================
		// 실생활에서 사용하는 인증번호 발생 예제
		// ex) 0000 ~ 9999 사이의 인증번호 발생시키기 => 문자열로 표현하기
//		for(int i = 1; i <= 10; i++) {
//			// 1. 난수 발생
//			int rNum = (int)(Math.random() * 10000); // 0 ~ 9999
//			
//			// 2. 발생된 난수를 문자열로 변환
//			String verificationCode = rNum + "";
//
//			// 3. 발생된 난수의 자릿수를 계산(문자열.length())하여
//			//    4자리 기준으로 모자란 자릿수를 반복횟수로 지정 후
//			//    반복문 내에서 숫자 앞에 0 을 결합
//			// ex) 난수 = 12 일 때, 4 - 자릿수(2) = 카운트 2 이므로
//			//     반복문 반복 횟수 : 카운트 ~ 1까지 1씩 감소(2, 1)
//			//     "0" + "12" = "012"
//			//     "0" + "012" = "0012"
//			for(int count = 4 - verificationCode.length(); count > 0; count--) {
//				verificationCode = "0" + verificationCode;
//			}
//			
//			System.out.println(verificationCode);
//		}
		
		
		//DecimalFormat 클래스(형식화 클래스)를 활용하여
		//수치 데이터에 대한 형식을 지정한 뒤 문자열로 리턴받아 사용하는 법
		//1. DecimalFormat 클래스 인스턴스 생성 시 형식 문자열 지정
		DecimalFormat df = new DecimalFormat("0000");
		//=>정수 4자리 형식 지정(단, 빈자리는 0으로 채움)
		//	   만약, 0대신 #으로 사용 시 빈자리는 0으로 채우지 않고 비워둠
		//2. 형식 지정 문자열을 사용한 DecimalFormat 객체의 format() 메서드를 호출하여 변환하려는 정수 전달
		//		=>형식을 적용한 문자열이 리턴됨
//		for(int i=0; i<=10; i++) {
//		int rNum = (int)(Math.random()*10000);
//		String verificationcode = df.format(rNum);
//		System.out.println("인증코드 : " + verificationcode);
//		}
	}
}
