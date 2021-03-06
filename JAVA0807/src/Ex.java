 public class Ex {
 
	public static void main(String[] args) {
		// 배열 기초 복습
		// int형 배열(arr) 5개짜리 공간을 생성하여, 1, 2, 3, 4, 5 로 초기화
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		// 배열 생성 및 초기화를 동시에 수행
		int[] arr = {1, 2, 3, 4, 5};
		// 이미 생성된 배열을 버리고 새로 생성된 배열을 변수에 할당하는 경우
//		arr = {10, 20, 30, 40, 50}; // 문법에 맞지 않음
		arr = new int[]{10, 20, 30, 40, 50};
		// => 주의! int[] 내부에 배열 크기를 지정하지 않도록 한다!
		// for문을 사용하여 배열 내의 모든 데이터 출력
		// => 배열 인덱스 0 ~ 4 까지 차례대로 반복
//		for(int i = 0; i < 5; i++) {} // 배열의 마지막 인덱스를 직접 지정
		for(int i = 0; i < arr.length; i++) { // 배열 크기 arr.length 사용
			System.out.println(arr[i]);
		}
		System.out.println("=======================");
		// 기본 데이터타입으로 배열을 생성할 경우 
		// 각 타입의 기본값으로 자동 초기화가 이루어지며
		// 참조 데이터타입으로 배열을 생성할 경우
		// 참조형의 기본값인 null 값이 자동으로 초기값으로 지정됨
		// (null 은 참조하는 주소값이 없다는 의미의 특수 데이터)
		String[] sArr = new String[3];
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		System.out.println("=======================");
		// 주의사항!!
		int[] a1, b1; // a1 과 b1 모두 배열 타입 변수로 선언되지만
		int a2, b2[]; // a2 는 기본형 변수, b2 만 배열 타입 변수로 선언됨
		System.out.println("=======================");
		int n1 = 10, n2 = 20;
		n1 = n2; // n2 의 값을 n1 에 복사하면, 기존 n1 의 값(10)은 제거됨
		// 배열 주소값 복사 시 주의 사항!
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] c = {7, 8, 9};
		b = a; // 배열 a(1,2,3)의 주소값을 배열 b에 전달(복사)
		// => 변수 b는 새로운 배열인 a(1,2,3)의 주소를 함께 참조하므로 
		// 이 때, 기존에 b 가 가리키던 배열(4,5,6)은 더이상 참조되지 못함
		// 따라서, 배열 4,5,6 은 가비지 컬렉터에 의한 제거 대상이 됨
		a = c; // 배열 c(7,8,9)의 주소값을 배열 a에 전달(복사)
		// => 변수 a는 기존 배열(1,2,3) 대신 새 배열(7,8,9)를 가리키지만
		//    여전히 변수 b에 의해 배열(1,2,3)이 참조되고 있으므로
		//    가비지 컬렉터에 의한 제거 대상이 아니다!
	}
 
}
 
 
 
 
 
 
 
 
 
 
 
 