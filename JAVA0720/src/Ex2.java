
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 논리연산자(&&, ||, !, ^)
		 * - 두 피연산자 간의 논리적인 판별을 수행하는 연산자
		 * - 피연산자는 모두 boolean 타입 데이터만 사용 가능하며, 
		 *   결과값도 boolean 타입으로 리턴
		 * - 주로 비교(관계)연산자 등과 결합하여 사용
		 * 	1)AND : 두 비교 연산의 관계를 ~이고, ~이면서, 그리고 로 정의
		 * 		ex) A가 B보다 크고, C보다 작거나 같을 경우
		 * 	2) OR : 두 비교 연산의 관계를 ~이거나, 또는 으로 정의
		 * 		ex) A가 B보다 크거나, C보다 클 경우
		 * -Short Circuit Operation을 위한 && 또는 || 연산자를 통해 연산 과정을 짧게 줄일 수 있음
		 * 
		 * < AND 연산자(& 또는 &&) - 논리곱 >
		 * - 두 피연산자가 모두 true 일 경우에만 결과값이 true 이고,
		 *   하나라도 false 일 경우 결과값이 false
		 * - F AND F = F, F AND T = F, T AND F = F, T AND T = T
		 * - &와 &&의 차이점
		 * 		&&연산자는 두 피연산자 중 앞의 피연산자가 false일 경우
		 * 		뒤의 피연산자 검사를 생략하고 결과를 바로 false로 리턴 (즉 연산 과정이 짧아짐)
		 * 
		 * < OR 연산자(| 또는 ||) - 논리합 >
		 * - 두 피연산자 중 하나라도 true 일 경우 결과값이 true 이고,
		 *   모두 false 일 경우에만 결과값이 false
		 * - F OR F = F, F OR T = T, T OR F = T, T OR T = T
		 * - |과 ||의 차이점
		 * 	||연산자는 두 피연산자 중 앞의 피연산자가 true 일 경우
		 * 	뒤의 피연산자 검사를 생략하고 결과를 바로 true로 리턴 (즉 연산 과정이 짧아짐)
		 * 
		 * < NOT 연산자(!) - 논리부정 >
		 * - 단항 연산자로, 현재 값을 반대로 반전시킴
		 * - F -> T, T -> F
		 * 
		 * < XOR 연산자(^) - 배타적 논리합(배타적 OR) >
		 * - 두 피연산자가 서로 다를 때 true, 같을 때 false
		 * - F XOR F = F, F XOR T = T, T XOR F = T, T XOR T = F
		 */
		
		boolean a = false, b = true;
		System.out.println("a && a = " + (a && a));
		System.out.println("a && b = " + (a && b));
		System.out.println("b && a = " + (b && a));
		System.out.println("b && b = " + (b && b));
		
		System.out.println("a || a = " + (a || a));
		System.out.println("a || b = " + (a || b));
		System.out.println("b || a = " + (b || a));
		System.out.println("b || b = " + (b || b));
		
		System.out.println("a ^ a = " + (a ^ a));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("b ^ a = " + (b ^ a));
		System.out.println("b ^ b = " + (b ^ b));
		
		System.out.println("!a =" + !a); //false - > true
		System.out.println("!b =" + !b); //true - > false
		
		System.out.println("--------------------------------------");
		
		//비교연산자와 결합하여 사용하는 경우
		int num = 5;
		//정수 num이 보다 큰가?
		//한가지 비교만 수행하는 경우 비교연산자만 사용 가능
//		boolean result = (num > 5);
//		System.out.println(result);
		//두 가지 이상의 비교를 조합해야 하는 경우 논리연산자와 결합 필요
		//AND : 두 비교 연산의 관계를 ~이고, ~이면서, 그리고 로 정의
		//정수 num이 5보다 크고, 정수 num이 10보다 작거나 같은가?
		//1)정수 num이 5보다 크다 : num > 5
		//2)정수 num이 10보다 작거나 같다 : num <= 10
		//=>~이고, 그리고 가 포함되므로 두 연산을 AND연산(&&)으로 묶음
		boolean result = num > 5 && num <= 10;
		System.out.println(result);
	}

}














