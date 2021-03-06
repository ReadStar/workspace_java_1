
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 2. while문
		 * - for문과 마찬가지로 특정 문장(또는 블록)을 반복 실행하는 반복문
		 * - for문과 달리 조건식의 위치만 정해져 있고, 
		 *   초기식과 증감식 위치는 원하는 위치에 배치하는 형태로 
		 *   문장 구조가 for문과 다름
		 * - for문은 주로 반복 횟수가 정해져 있는 경우에 사용하며,
		 *   while문은 주로 반복 횟수가 정해져 있지 않은 경우에 사용
		 * - for문과 while문은 상호 전환이 자유롭다.
		 *   
		 * < 기본 문법 >
		 * for(초기식; 조건식; 증감식) {
		 * 		// 조건식 결과가 true 일 때 반복 실행할 문장들...
		 * }
		 * 
		 * 초기식; // 조건식보다 위(앞)에 위치해야함
		 * 
		 * while(조건식) {
		 * 		증감식; // 실행 문장보다 먼저 오거나
		 * 		// 조건식 결과가 true 일 때 반복 실행할 문장들...
		 * 		증감식; // 실행 문장 뒤에 올 수 있다(for문과 동일하게 실행되는 위치)
		 * }
		 * 
		 * 
		 */
		
		for(int i = 1; i<=10; i++) {
			System.out.println("hello world");
		}
		
		int i = 1; //초기식
		while (i <= 10) {//조건식
			//증감식
			System.out.println(i + ": Hello world");//실행문
			i++; //증감식
		}
		
		System.out.println("------------------------------------------");
		
		int a = 0;
		while (a <= 10) {
			++a;
			System.out.println(a + ":Hello, World");
		}
		System.out.println("----------------------------------");
		
		//1 ~ 10 까지 i 값을 1씩 증가시키면서 출력
		i = 1;
		while (i<=10) {
			System.out.print(i);
			i++;		
			}
		System.out.println("");
		System.out.println("-------------------------");
		//1 ~ 10 까지 i 값을 2씩 증가시키면서 출력
		i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i+=2;
		}System.out.println("");
		//2 ~ 10 까지 i 값을 2씩 증가시키면서 출력
		i = 2;
		while(i<=10){
			System.out.print(i + " ");
			i+=2; }System.out.println("");
		//10 ~ 1 까지 i 값을 1씩 감소 시키면서 출력
		i = 10;
		while(i>=1) {
			System.out.print(i + " ");
			i--;
		}
	}

}
