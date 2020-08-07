
public class Ex {

	public static void main(String[] args) {
		/*
		 * for문과 if문의 조합
		 * -for문 내에서 if문을 사용하여 반복 과정에서
		 *  특정 조건을 만족하면 지정된 문장을 실행하거나 실행하지 않음
		 */
		
		
		//for문을 사용하여 정수 i가 1 ~ 10까지 1씩 증가하면서 반복 =>i 출력
		for(int i = 1; i<=10; i++) {
			//1 ~ 10 까지 정주 숭 i값이 5일때 출력
//			if(i==5) {
//				System.out.println("i=" + i);
			if(i<5) {
				System.out.println("i=" + i);
			}
			
		}
		System.out.println("---------------------------");
		//for문을 사용하여 i가 1 ~ 10까지 1씩 증가 반복
		//=>i값이 짝수일 때 i = x 짝수 출력
		//	i값이 홀수일 때 i = x 홀수 출력
		for(int i = 1; i<=10; i++) {
			if(i %2 == 0) {
				System.out.println("i=" + i + "짝수");
			}else {
				System.out.println("i=" + i + "홀수");
			}
		}
	}

}
