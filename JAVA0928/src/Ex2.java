
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Character 클래스를 활용한 문자 처리
		 * -character 클래스의 메서드를 활용하여
		 *   문자데이터에 대한 다양한 처리 가능
		 * -isXXX()메서드를 활용하여 문자에 대한 비교를 수행하고
		 *   toXXX()메서드를 활용하여 문자에 대한 변환을 수행 할 수 있다.
		 */
		
		char ch = ' ';
		System.out.println("ch 는 대문자 인가?" + Character.isUpperCase(ch));
		System.out.println("ch 는 소문자 인가?" + Character.isLowerCase(ch));
		System.out.println("ch 는 문자 인가?"+ Character.isLetter(ch));
		System.out.println("ch 는 숫자인가?" + Character.isDigit(ch));
		
		System.out.println("ch 는 공백문자인가?" + Character.isSpace(ch));
		//=>deprecated 처리된 메서드로 다른 메서드가 제공되거나 보안상 사용X
		System.out.println("ch 는 공백문자인가?" + Character.isWhitespace(ch));
		
		System.out.println("================================");
		
		char ch2 = 'a';
		System.out.println(ch2+"->대문자로 변환" +Character.toUpperCase(ch2) );
		ch2='A';
		System.out.println(ch2+"->소문자로 변환" +Character.toLowerCase(ch2) );
	}

}
