
public class Ex {

	public static void main(String[] args) {
		//배열 기초 복습
		//int형 배열(arr) 5개 짜리 공간을 생성하여 1, 2, 3, 4, 5로 초기화
//		int [] arr = new int[5];
//				arr[0]=1;
//				arr[1] = 2;
//				arr[2] = 3;
//				arr[3] = 4;
//				arr[4] = 5;
		//배열 생성 및 초기화를 동시에 수행
		int[] arr = {1, 2, 3, 4, 5};
		
		//이미 생성된 배열을 새로 생성하여 변수에 활용하는 경우
//		arr = {10, 20, 30, 40, 50};
		arr = new int[] {10, 20, 30, 40, 50}; 				
				
				
		//for문을 사용하여 배열 내의 모든 데이터를 출력
		//=>배열 인덱스 0 ~ 4까지 차례대로 반복
//		for(int i = 0; i<5; i++) {} //배열의 마지막 인덱스를 직접 지
		for(int i = 0; i<arr.length; i++) {//배열 크기 arr.length사용
			System.out.println(arr[i]);
		}
		

	}

}
