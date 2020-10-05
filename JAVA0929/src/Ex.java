
public class Ex {

	public static void main(String[] args) {
		/*
		 * Java.lang.Math 클래스
		 * -수학 관련 기능을 제공하는 클래스
		 * -final 클래스 이므로 상속 불가하며
		 *   모든 멤버는 static으로 선언되어 있으므로 클래스 명만으로 접근 가능
		 */
		int num1 = -10;
		System.out.println("num1의 절대값" + Math.abs(num1));
		int num2= 10,  num3 = 20;
		System.out.println("num2과 num3의 최대값 : " + Math.max(num2, num3));
		System.out.println("num2과 num3의 최소값 : " + Math.min(num2, num3));
		//소수점 첫째자리를 기준으로 올림, 내림, 반올림 수행
//		double num4 = 3.141592;
		//파이 값을 미리 Math클래스에서 상수로 만들어 제공
		System.out.println("num4의 올림" + Math.ceil(Math.PI)); //올림 => 실수리턴
		System.out.println("num4의 내림" + Math.floor(Math.PI)); //내림 => 실수리턴
		System.out.println("num4의 반올림" + Math.round(Math.PI)); //반올림 => 정수리턴
		
		//Math,pow(x,y) : x의 y승 값(멱승)을 계산
		System.out.println(Math.pow(10, 2)); //10^2 = 100.0
		System.out.println(Math.pow(10, 3)); //10^3 = 1000.0
		
		System.out.println("-----------------------------------------------------");
		
		/*
		 * 난수(임의의 수) 발생
		 * -Math.random() 메서드 사용
		 * -난수 x의 범위 : 0.0 <= x <1.0 (double 타입)
		 * -주로 난수의 자릿수를 지정하여 정수화 시킨 후 활용
		 * 	 (ex. 난수의 소수점 6자리까지 정수화 = 6자리 정수형 난수)
		 * -하한값 n ~ 상한값 m까지의 난수 발생 공식
		 * 	  1)1 ~ n까지의 난수 : (int)(Math.random() *상한값m)+하한값n)
		 */
		
		
		System.out.println("기본 난수 : " + Math.random());
		//0.0 <= x <10.0범위의 난수 발생
		System.out.println(Math.random()*10);
		//0 <= x <10(0 ~ 9) 범위의 난수 발생(정수화)
		System.out.println((int)(Math.random()*10));
		//1<= x <10범위의 난수 발생(정수화)
		System.out.println((int)(Math.random()*10+1));
		//1<= x <20(1 ~ 20) 범위의 난수 발생(정수화)
		for(int i = 1; i<=10; i++) {
			System.out.println((int)(Math.random()*20)+1);
		}
	}

}
