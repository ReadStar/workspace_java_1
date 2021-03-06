
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 중첩 While문
		 * - 중첩 for문과 마찬가지로  while 내에 while문을 기술하는 것
		 * - 바깥쪽 while 문이 1번 반복할 동안 while문이 여러번 반복
		 * <기본 문법>
		 * 초기식1:
		 * 
		 * while(조건식1){//바깥쪽 while문
		 * 
		 * 		초기식2:
		 * 
		 * 		while(조건식2){//안쪽while문
		 * 	}
		 * }
		 */
		int i = 1; //초기식1
		
		while(i<=3) {//조건식1, 바깥쪽 while문
			System.out.println("i =" + i);
			int j = 1;//초기식2
			//=>주의점. 바깥쪽 while 문 안쪽에,
			//	안쪽 while문보다 윗쪽에 위치해야함
			
				while(j <= 5) {//조건식2, 안쪽 while문
				//안쪽 while문 반복횟수 = j 5번 * i 3번 => 15번
				System.out.println("--------> j =" + j);
				j++;
			}
			System.out.println("---------------------------------");
			i++;
		}
			
	}

}

