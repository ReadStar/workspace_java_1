
public class test2 {

	public static void main(String[] args) {
		// 중첩 for문을 활용하여 시계의 분침, 초침구현
		
			
		//분침
		for(int min = 0; min <=59; min++) {//밖
//			System.out.print(min + "분 ");
			//초침
			for(int sec = 0; sec <=59; sec++) {//안
				System.out.println(min + "분 " + sec + "초");
			}
		}
		System.out.println("--------------------------------");
		
		//100m 운동장을 10바퀴 돌도록 중첩 for문 사용하여 구현
		//ex) 1바퀴 - 1m 
		//ex) 1바퀴 - 2m
		//ex) 2바퀴 - 1m
		int total = 0;
		for(int a = 1; a <=10; a++) {
			for(int b = 1; b <= 100; b++) {
				System.out.println(a + "바퀴" + b + "m");
				total++;
			}
		}
		System.out.println("총 이동거리 : " +total + "m");

		System.out.println("-----------------------------");
		
		
		for(int j = 1; j<=9; j++) {
			System.out.println("<" + j + "단>");
			for(int i = 1; i<= 9; i++) {
				System.out.println(j + "x" + i + "=" + (j*i));
			}			
			System.out.println();//줄바꿈
		}
		
	}
}
