
public class ex2 {

	public static void main(String[] args) {
		/*
		 * 삼항연산자(조건연산자) ?:
		 * -피연산자(항)가 3개인 연산자
		 * -?앞의 조건식에 따라 :앞 뒤의 문장을 고르는 연산자
		 *
		 *<기본 문법>
		 *조건식 ? 값1 : 값2;
		 *=>조건식은 연산 결과가 true 또는 false인 식만 올 수 있다
		 *=>조건식 결과가 true 이면 값1을 선택하고 
		 *	false이면 값2를 선택한다
		 *=>삼항연산자 연산 결과를 변수에 대입하거나,
		 *	출력문 등에 결합하여 사용할 수 있다.
		 */

		
		int num = 9;
		
		System.out.println(num >= 10 ? "num이 10 이상이다" : "num이 10 이상이 아니다");
		//=> num이 10 이상(true)일 때 "num이 10 이상이다" 문장을 선택하여 출력
		//	 num이 10 이상이 아닐(false) 때 "num이 10 이상이 아니다" 문장을 출력
		
		String result = num >= 10 ? "10 이상" : "10 이상이 아니다";
			System.out.println(result);
			
		System.out.println("---------------------------");
		
		num = 20;
		System.out.println("num이 10보다 큰가?"+(num>=10));
		//num이 10보다 크면 정수형 변수 result2의 값에 1을 더하고
		//아니면, 정수형 변수 result2의 값에 10을 더하기
		int result2 = 0;
//		result2 = result2 + 1; 
//		result2 = result2 +10;
//		result2 = num > 10 ? result2 + 1 : result2 + 10;
		result2 += num > 10 ? 1 : 10;
		//=>true와 false일 때 선택할 문장 부분에 연산식이 올 수도 있으나
		//	해당 식을 사용하여 값을 할당하는 문장에 사용해야함
		System.out.println(result2);
		
		/*
		 * 삼항연산자의 중첩 사용
		 * - 기본 삼항연산자는 두 가지 경우의 수를 판별할 수 있으나
		 * 	 세 가지 경우 이상은 판별이 불가능하다
		 * 	 =>이 때, 삼항연산자를 중첩해서 사용하면 
		 * 	   두 가지 이상의 경우의 수를 판별할 수 있다
		 * 
		 * <기본 문법>
		 * 조건식 1 ? 값 1 : 조건식 2 ? 값2 : 값3;
		 * =>조건식 1의 결과가 true 이면 값 1을 선택하고
		 * 	 아니면, 다시 조건식 2를 판별하여 
		 * 	 조건식 2의 결과가 true 이면 값 2를 선택하고
		 * 	 아니면 값 3을 선택
		 */
		num = 2;
//		result = num >= 10 ? "10이상" : "10 이상이 아니다";
		//num이 10보다 클 때, 10보다 작을 때, 10일 때 3가지 경우 판별
		result = num >= 10 ? "10이상"  :num<10 ? "10 보다 작다" : "10" ;
		System.out.println(result);
	}

}
