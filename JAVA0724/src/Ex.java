
public class Ex {

	public static void main(String[] args) {
		/*
		 * switch ~ case 문
		 * - if문과 유사하게 조건에 따른 실행 문장을 달리하는 조건문
		 * - if문과 달리 조건식이 정수값, 문자열, Enum 상수 중 하나의 결과가 와야한다.
		 * - case 문에는 조건식 판별 결과와 비교할 값을 사용하며
		 *   범위 지정이 불가능하고, 값만 사용 가능
		 *   => 조건식 결과와 일치하는 case 문의 : 뒤에 있는 문장들을 차례대로 실행
		 * - case 문의 값은 중복될 수 없으며, 순서는 상관 없다
		 * - case 문 실행 후 break 문을 사용하여 switch ~ case 문을 빠져나갈 수 있으며,
		 *   break 문이 없을 경우에는 조건과 상관없이 다음 case 문 또는 default 문을
		 *   모두 실행함(break 문을 만나거나 switch ~ case 문이 끝날때까지 실행)
		 *   
		 * - default 문은 if 문의 else 문과 동일한 역할을 수행하며
		 *   일치하는 case 문이 없을 경우 default 문을 실행(default 문은 생략 가능)
		 *   
		 * - if문은 실행 시점에서 조건을 판별하여 실행할 문장이 결정되지만,
		 *   switch ~ case 문은 번역 시점에 실행할 문장이 결정되므로 실행 속도가 if문보다 빠름
		 * - if문이 switch ~ case 문보다 유연하므로 
		 *   switch ~ case 문은 if문으로 100% 전환이 가능하지만
		 *   if문은 switch ~ case 문으로 전환이 불가능할 수 있다.
		 *   
		 * < 기본 문법 >
		 * switch(조건식) {
		 * 		case 값1 : 
		 * 				// 조건식 결과가 값1 과 일치할 경우 실행할 문장들...
		 * 				[break;]
		 * 		case 값n : 
		 * 				// 조건식 결과가 값n 과 일치할 경우 실행할 문장들...
		 * 				[break;]
		 * 		[default : // 일치하는 case 문이 없을 경우 실행할 문장들... ]
		 * }
		 */
		
		int num = 1;
		//결과가 정수 또는 문자열인 변수 또는 식을 switch문 ()안에 작성		
		switch(num) {//정수형 변수 num을 조건식으로 사용
				//case문을 사용하여 정수형 변수 num의 값을 비교할 값 지정
			case 1 : 
					System.out.println("num = 1");
					break;//현재switch문을 벗어남("프로그램 종료"출력)
			case 2 :
					System.out.println("num = 2");
					break; //현재switch문을 벗어남("프로그램 종료"출력)
			case 3 :
					System.out.println("num = 3");
					break;//현재switch문을 벗어남("프로그램 종료"출력)
				}
		System.out.println("프로그램 종료");
		
		System.out.println("----------------------------------");
		
		switch(num) {//num=1일 때, case 1 문장을 실행한 후 break 문이 없으므로
//		case1실행문 아래쪽의 모든 case와 default의 실행문을 실행
//		=>단, break문을 만나거나 switch문이 끝날때 까지 실행함
	case 1 : 
			System.out.println("num = 1");
			
	case 2 :
			System.out.println("num = 2");
			
	case 3 :
			System.out.println("num = 3");
			
		}
System.out.println("프로그램 종료");

System.out.println("----------------------------------");

		num = 2;
switch(num) {//num=1일 때, case 1 문장을 실행한 후 break 문이 없으므로
//case1실행문 아래쪽의 모든 case와 default의 실행문을 실행
//=>단, break문을 만나거나 switch문이 끝날때 까지 실행함
case 1 : 
	System.out.println("num = 1");
	
case 2 :
	System.out.println("num = 2");
	
case 3 :
	System.out.println("num = 3");
	default: //num이 1, 2, 3이 아닐 경우 무조건 실행되는 문장
			System.out.println("default 문 실행됨");
	
}
System.out.println("프로그램 종료");

System.out.println("--------------------------------------");

switch(num) {//정수형 변수 num을 조건식으로 사용
//case 1, 2, 3일때 실행문 실행 후 break 문을 만나므로
//다른 case문 또는 default 문이 실행되지 않는다
//또한, 일치하는 값이 없으면 default문을 실행함 
case 1 : 
	System.out.println("num = 1");
	break;
case 2 :
	System.out.println("num = 2");
	break;
case 3 :
	System.out.println("num = 3");
	break;
	default: //num이 1, 2, 3이 아닐 경우 무조건 실행되는 문장
			System.out.println("default 문 실행됨");
	
}
System.out.println("프로그램 종료");

System.out.println("============================");

//switch case문의 단점
//-조건식에도 제약사항이 있찌만
// case문 뒤에 값만 올 수 있고, 식이나 범위 지정이 불가능하므로
// if문에 비해 유연성이 떨어짐
int score = 89;
//입력받은 점수에 대한 학점 출력을 위해 switch 문 사용 시
//점수 범위 지정이 불가능하여 0 ~ 100점까지 case 문 모두 작성 필요
switch(score) {
	case 100 : System.out.println("A"); break;
}

}
	}
	
