
public class Ex6 {

	public static void main(String[] args) {
		/*
		 * try ~ catch ~ finally 블록
		 * -try 블록에서 예외 발생 여부와 관없임
		 * 	 무조건 실행해야하는 문장들은 finally 블록 내에 기술함
		 * -예외가 발생하거나 발생하지 않아도 무조건 실행되며
		 * 	 심지어 return문을 만나 메서드 실행이 종료될 때도
		 * 	 finally 블록 내의 코드를 실행한 후 종료
		 * -주로, 자원 반환을 위한 코드를 기술
		 * 	 (ex. DB접속 종료, 입출력 스트림 종료 등)
		 * 
		 * <기본 문법>
		 * try{
		 * 		//예외 발생 예쌍 코드들
		 * }catch{
		 * 		//해당 예외 발생 시 수행할 코드들
		 * }finally
		 * 		//예외 발생 여부와 관계없이 수행할 코드들
		 * }
		 */
		
		System.out.println("프로그램시작");
		int  num1 = 10, num2 = 0;
		String str = null;
		
		try {
//			System.out.println(num1/num2);
//			System.out.println(str.length());
			System.out.println("예외 없음");
		} catch (Exception e) {
			System.out.println("모든 예외 처리");
			e.printStackTrace();
		}finally {
			System.out.println("예외 발생 여부와 관계없이 무조건 실행");
		}
		System.out.println("프로그램 종료");
		
		System.out.println("---------------------------------------");
		
		System.out.println("메서드 호출 시작");
		execeptionMethod(1);
		System.out.println("메서드 호출 종료");
		
	}
public static void execeptionMethod(int num) {
	/*
	 * 예외가 발생할 경우 실행되는 코드 순서
	 * 1 -> 3 -> 4 -> 5 -> 메서드 종료
	 * (return 문을 만나지 않으므로 try 블록 바깥 코드도 실행됨)
	 * 
	 * 예외가 발생하지 않을 경우 실행되는 코드 순서
	 * 1 -> 2 -> return -> 4(finally) -> 메서드 종료
	 * (return 문을 만나더라도 finally 블록을 우선 실행함)
	 */
	try {
		System.out.println("Code1 - num :" + num);
		int total = 1 / num;
		System.out.println("Code2 : 예외발생 없음");
		return;
		//메서드 실행 도중 return 문을 만나면
		//메서드를 호출한 곳으로 즉시 되돌아 가지만,
		//finally 블록 내의 코드가 있을 경우 해당 코드를 실행한 후
		//메서드를 호출한 곳으로 돌아감
	} catch (Exception e) {
		System.out.println("Code3 예외 발생 후 처리 완료");
	}finally {
		System.out.println("Code4 예외 발생 여부와 관계없이 항상 실행");
	}
	System.out.println("Code5 : try문 종료 후 실행");
}
	
}