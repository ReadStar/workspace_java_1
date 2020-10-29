
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 예외 처리(Exception Handling)
		 * -예외가 발생할 경우 예외가 발생하지 않도록
		 * 	 예외 발생 코드를 수정하는 것이 아니라
		 * 	 예외가 발생하더라도 별도의 작업을 통해 작업이 끝까지 수행되어
		 * 	 프로그램이 정상적으로 종료될 수 있도록 처리하는 것
		 * -try ~ catch 블록을 사용햐여 기본적인 예외 처리
		 * 	 =>try 블록 내에 예외가 발생할 것으로 예상되는 코드를 기술하고
		 * 		 catch 블록에서 예외를 전달받을 클래스를 선언하여 예외 감지 후
		 * 		 해당 예외를 처리할 코드를 기술
		 * 
		 * <기본 문법>
		 * try{
		 * 		예외 발생 예상 코드들
		 * }catch(예외클래스명 변수명){
		 * 		해당 예외 발생 시 수행할 코드들
		 * }
		 *  
		 */
		
		System.out.println("프로그램 시작");
		int num =3 , num2 = 0;
		//0으로 나눗셈 수행 시 예외가 발생하는데
		//이 때, 0으로 나누지 않도록 데이터를 수정하는 것은 예외처리가 아님
		try {
		System.out.println(num / num2); //예외 발생 예상 코드
		//try 문 내에서 예외 발생 지점부터 아래쪽의 모든 문장들은
		//실행되지 못하고 바로 catch 블록으로 이동함
		System.out.println("try문 종료");
		}catch(ArithmeticException e){
			//ArithmeticException 예외 발생 시에 자동으로 실행되는 부분
			//=>ArithmeticException 예외가 발생하지 않으면 실행되지 못함
			System.out.println("0으로 나눌 수 없다");
		}
		//예외 발생 여부와 관계없이 실행되는 코드들
		System.out.println("프로그램 종료");
		
		System.out.println("---------------------------------");
		
		//두 가지 이상의 예외가 발생할 가능성이 있는 경우
		//1. 두 가지 이상의 예외를 각각의 catch 블록에서 처리
		//=>두 개 이상의 catch 블럭을 작성하여 각 예외를 별도로 처리
		//		단, 예외 발생 시 윗쪽 catch 블럭부터 아래쪽으로 순서대로 탐색
		System.out.println("프로그램 시작");
		
		try {
			System.out.println(num / num2);
			
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 만 처리");
		}catch(NullPointerException e){
			System.out.println("NullPointerException 만 처리");
		}
		
		System.out.println("프로그램 종료");
		
				//두 가지 이상의 예외가 발생할 가능성이 있는 경우
				//2. 두 가지 이상의 예외를 하나의 catch 블록에서 처리
				//2-1. 하나의 catch 블럭에 2개 이상의 예외클래스를 모두 지정할 경우
				// =>OR 기호(|)를 사용하여 예외 클래스끼리 묶어줌
				System.out.println("프로그램 시작");
				
				try {
					System.out.println(num / num2);
					
					String str = null;
					System.out.println(str.length());
				} catch (ArithmeticException | NullPointerException e) {
					System.out.println("ArithmeticException과 NullPointerException 만 처리");
				}
				
				System.out.println("프로그램 종료");
				
				//두 가지 이상의 예외가 발생할 가능성이 있는 경우
				//2. 두 가지 이상의 예외를 하나의 catch 블록에서 처리
				//2-2. 하나의 catch 블럭에 상위 예외 클래스를 사용하여 처리
				System.out.println("프로그램 시작");
				
				try {
					System.out.println(num / num2);
					
					String str = null;
					System.out.println(str.length());
				} catch(RuntimeException e) {
					System.out.println("RuntimeException 계열만 처리");
				}
				
				System.out.println("프로그램 종료");
				
				System.out.println("--------------------------");
				
				System.out.println("프로그램 시작");
				
				try {
					System.out.println(num / num2);
					
					String str = null;
					System.out.println(str.length());
				} catch (Exception e) {
					System.out.println(" Exception 계열 처리");
				}
				
				System.out.println("프로그램 종료");
				
				//여러개의 예외 클래스를 사용할 경우
				//위에서 부터 차례대로 예외클래스를 탐색하므로
				//예외 클래스 간의 상속관계에서 하위클래스 타입부터
				//역순으로 처리해야 한다. 그렇지 않을 경우 상위 예외가 모든 예외를 처리하게 되어
				//하위 예외 처리 catch 블럭이 실행될 수 없게 된다.
				
	}

}
