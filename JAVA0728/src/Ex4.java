
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 반복문에서 제어변수의 활용
		 * - 반복문에서 제어변수의 초기식, 조건식, 증감식 등에
		 *   다른 변수(제어변수 포함)를 조합하여 사용 가능
		 *   => 특히, 계속 변화하는 제어변수를 조건식 등에 사용할 경우
		 *      반복 횟수가 동적으로 변하는 반복문을 구현할 수 있다!
		 */
		
		/*
		 * 반복 횟수가 고정인 중첩 for문
		 * *****    i = 1, j = 1 ~ 5
		 * *****    i = 1, j = 1 ~ 5
		 * *****    i = 1, j = 1 ~ 5
		 * *****    i = 1, j = 1 ~ 5
		 * *****    i = 1, j = 1 ~ 5
		 */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
			
		}
		
		System.out.println("================");
		/*
		 * 안쪽 for문의 반복횟수가 바깥쪽 for문의 제어변수에 영향을 받는 for문
		 * *      i = 1, j = 1 ~ 1
		 * **     i = 2, j = 1 ~ 2
		 * ***    i = 3, j = 1 ~ 3
		 * ****   i = 4, j = 1 ~ 4
		 * *****  i = 5, j = 1 ~ 5
		 * => j 값의 조건식(최대값)이 i값과 동일함
		 *    따라서, j 반복의 조건식에 i값을 사용하여 
		 *    조건식을 동적으로 변화시킬 수 있다!
		 */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
			
		}
		
		System.out.println("--------------");
		for(int i = 5; i >= 1; i--) {
			
			// 초기식에 변수를 활용할 수도 있다!
			for(int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
			
		}
		
		System.out.println("====================");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
			
			for(int j = 1; j <= i; j++) {
				System.out.println("----------- j = " + j);
			}
			
			System.out.println("------------------");
			
		}
		
		
	}

}















