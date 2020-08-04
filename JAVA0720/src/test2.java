
public class test2 {
	
	public static void main(String[] args) {
		//AND 연산자(&&) 연습문제
		int num = 25;
		
		//1. 정수 num이 10보다 크거나 같고 20보다 작거나 같은가?
		boolean result = num >= 10 && num <= 20;
				System.out.println(result);
		
				System.out.println("----------------------------");
				
				
		//2. 나이(age)가 20세 이상이고, 30세 미만(29세 이하)인가?
		int age = 15;
		result = age >= 20 && age<30 ;
		System.out.println(result);
		
		
		//OR : 두 비교 연산의 관계를 ~이거나, 또는 으로 정의
		//정수 num이 5보다 작거나, 또는 num이 10보다 큰가?
		num = 15;
		result = num < 5 || num > 10;
				System.out.println(result);
		System.out.println("-------------------------------");
				
		//3. 정수 num이 0보다 작거나, 100보다 큰가?
		num = 5;
		result = num<0 || num>100 ;
				System.out.println(result);
		
		//4. 나이(age)가 5세 미만이거나, 65세 이상인가?
		age = 4;
		result = age <5 || age >= 65;
				System.out.println(result);
				
		//NOT : 논리형 상태를 반대로 반전
				num = 8;
				result = !(num <5 || num > 10);
				System.out.println(result);
				
	}
}
