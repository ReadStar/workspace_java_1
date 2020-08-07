
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 향상된 for문(ForEach문)
		 * -배열  등의 객체 반복을 위해 for문 사용 시	
		 * 	조건식, 증감식 등이 없는 단순한 for문 
		 * -지정된 배열 내의 모든 데이터를 하나씩 꺼내서
		 * 	좌변에 선언된 변수에 저장 반복하고 자동 종료
		 * -단, 특정 범위만 반복할 수 없고, 인덱스 사용 불가
		 * 
		 * <기본 문법>
		 * for(변수선언 : 배열){
		 * 
		 * }
		 */
	int[] arr = {1, 2, 3, 4, 5};
	//기존 for문 사용 
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	향상된 for문 사용 
	for(int num : arr) {
		//배열 arr내의 데이터를 차례대로 꺼내서 num에 저장 반
		System.out.println(num);
	}
	}

}
