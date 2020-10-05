import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Randmo 클래스
		 * -난수 관련 기능을 제공하는 클래스
		 * -math 클래스의 randmo() 메서드와 달리
		 *   객체 생성 후 메서드 호출을 통해 난수 발생
		 *   =>nextXXX?() 메서드 사용 (XXX :데이터타입)
		 */
		Random r = new Random();
		
		for (int i = 1; i <= 10; i++) {
			//1.Boolean 타입 범위의 난수발생
//			System.out.println(r.nextBoolean());
			//2. Double 타입 범위의 난수 발생
//			System.out.println(r.nextDouble());
			//3. int타입 범위의 난수
//			System.out.println(r.nextInt());
			//4. int타입 범위 중 0 ~ x-1까지의 난수
//			System.out.println(r.nextInt(10));
			//+1시 10까지
			System.out.println(r.nextInt(10)+1);
		}
	}

}
