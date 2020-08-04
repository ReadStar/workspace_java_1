
public class Ex {

	public static void main(String[] args) {
		/*
		 * 비교(관계)연산자
		 * -두 피연산자 간의 대소 관계 비교를 수행하는 연산자
		 * -연산 수행 결과는 ture or false 값으로 나타낸다
		 * 	=>연산 결과를 출력문에서 출력하거나, boolean 타입 변수에 저장
		 * 1) == (동등비교연산자) : 두 피연산자가 같은지 비교
		 * 2) != (Not Equal) : 두 피연산자가 같은지 비교
		 * 3) >, >=, <=, < : 대소 관계 비교
		 */
		int a = 10, b = 4;
		System.out.println(a == b); //a와 b가 같은지 판별 결과를 출력
		// => a와 b는 같지 않으므로 false가 리턴되어 출력
		System.out.println(a != b); //a와 b가 다른지 판별
		// => a가 b보다 다르므로 true가 리턴되어 출력
		System.out.println(a > b); //a가 b보다 큰지 판별
		// => a가 b보다 크므로 true가 리턴되어 출력
		System.out.println(a >= b); //a가 b보다 크거나 같은지 판별
		// => a가 b보다 크거나 같으므로 true가 리턴되어 출력
		System.out.println(a <= b); //a가 b보다 작거나 같은지 판별
		// => a가 b보다 작거나 같지 않으므로 false가 리턴되어 출력
		System.out.println(a < b); //a가 b보다 작은지 판별
		// => a가 b보다 작으므로 false가 리턴되어 출력
		
		//대소 관계 비교 결과를 boolean타입 변수에 저장할 수 있다
		boolean result = a > b; //a > b 판별 결과가 result에 저장됨
		System.out.println("result = "+ result);
		
		
		//산술 연산자 등과 결합하여 사용할 수 있다
		//=>두 연산 결과를 비교연산자로 비교 가능
//		boolean result2 = a + b > a - b;
		//=> 산술 연산자가 비교 연산자보다 우선순위가 높으므로
		// 	별도의 괄호를 표시하지 않아도 산술연산을 먼저 수행함
		// 만약 명확하게 산술연산을 먼저 수행하도록 하려면 괄호표시
		boolean result2 = (a + b ) > (a - b);
		System.out.println(result2);
		
		
		
		//char 타입도 정수이므로 비교연산자 사용 가능
		char ch = 'A';
		System.out.println("ch가 대문자 A보다 큰가?" + (ch > 65));
		//비교연산자도 피연산자 타입이 다르면 일치시킨 후 연산 수행
		System.out.println(10 == 10.0);
		//=>int == double -> doulbe == double로 변환 후 수행
		
		//주의
		//실수(특히 double) 0.1의 유효 자릿수 문제 때문에
		//float  0.1f와 double 0.1 비교 시 문제 발생(=부정확)
		
		System.out.println(0.1 == 0.1f);
		float f = 0.1f;
		double d = 0.1;
		System.out.println(f == d);
		//=> float, double 타입 비교 시 반드시 float 타입으로 일치시킨 후 비교 연산을 수행해야한다.
		System.out.println(f == (float)(d));
	}

}
