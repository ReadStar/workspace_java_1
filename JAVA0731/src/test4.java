
public class test4 {

	public static void main(String[] args) {
		/*
		 * 1부터 1씩 증가하는 값을 차례대로 누적하여
		 * 누적합계가 1000보다 클 때 i 값을 출력
		 */
		int i = 1;
		int sum = 0;
		while (sum<=1000) {
			sum += i;
			System.out.println("i =" + i + " sum = " + sum);
			i++;
		}System.out.println("종료 후 i 값" + i);
		
		System.out.println("-----------------------------------------");
		sum = 0;
		i = 1;
		//무한반복 진행하면서 break 문을 사용하여 동일하게 구현
		while (true) {
			sum += i;
			System.out.println("i =" + i + " sum = " + sum);
			//누적 변수의 값이 1000보다 클 때 반복문 종료
			if(sum>1000) {
				break;
			}
			i++;
		}System.out.println("종료 후 i 값" + i);
		
		
		
		
		
	}

}
