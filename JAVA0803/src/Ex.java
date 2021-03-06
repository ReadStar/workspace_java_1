
public class Ex {
	public static void main(String[] args) {
		/*
		 * 배열(Array)
		 * 1. 같은 타입의 여러 데이터를 하나의 묶음으로 다루는 것
		 *   = 동일한 데이터타입 변수들의 집합
		 * 2. 배열은 메모리 상의 연속된 공간에 생성됨
		 *   => 따라서, 한 번 생성한 배열의 크기를 변경할 수 없다!
		 * 3. 기본 데이터타입과 참조 데이터타입 모두를 배열로 생성 가능
		 * 4. 저장된 데이터들은 배열명(변수명)을 사용하여 관리
		 * 5. 배열의 크기는 배열명.length 속성을 사용하여 알아낼 수 있다
		 * 6. 배열 생성 시 각 데이터 저장공간에는 인덱스(첨자)라는 번호가 붙는다
		 *    => 인덱스 번호는 0부터 시작함!
		 *       (따라서, 배열의 인덱스 범위는 0 ~ 배열크기-1 까지 자동 부여됨)
		 * 7. 배열을 사용하려면 배열 선언 -> 생성 -> 초기화 단계를 거쳐야한다!
		 *    (단, 배열을 생성하면 기본값으로 자동으로 초기화 일어남)
		 *    => 기본값 : byte&short&int = 0, long = 0L, float = 0.0f, double = 0.0
		 *                boolean = false, char = '\u0000' 또는 0
		 *                참조형(String 등)의 기본값은 무조건 null
		 *                
		 * < 배열 선언 기본 문법 >
		 * 데이터타입[] 변수명;
		 * => 단, 배열 선언만 했을 경우 데이터 저장 불가! (배열 생성 전이므로)
		 * => 배열이 생성된 주소값을 저장하는 변수 선언
		 * 
		 * < 배열 생성 기본 문법 >
		 * 변수명 = new 데이터타입[배열크기];
		 * => 메모리(Heap)에 실제 데이터 저장이 가능하도록 공간을 할당받음
		 * 
		 * < 배열 접근 기본 문법 >
		 * 변수명[인덱스]
		 * 
		 * < 배열 초기화 기본 문법 >
		 * 변수명[인덱스] = 데이터;
		 * 
		 * < 배열 선언 및 생성을 동시에 수행하는 문법 >
		 * 데이터타입[] 변수명 = new 데이터타입[배열크기];
		 * 
		 * < 배열 선언, 생성, 초기화를 동시에 수행하는 문법 >
		 * 데이터타입[] 변수명 = {데이터1, 데이터2, ..., 데이터n};
		 * => 배열 크기를 지정하지 않아도 데이터 갯수만큼의 배열이 자동으로 생성됨
		 *    (단, 배열 내의 데이터가 모두 준비된 경우에만 가능한 문법)
		 *    
		 * <배열 크기 조회>
		 * 배열명.length 속성 사용하여 크기 전달 받을 수 있음
		 * => 출력문에 배열명.length 사용 또는 변수에 배열명.length저장
		 */
		
		//int형 정수를 저장하는 변수 num
		int num;
		num = 10;
		num = 20; //만약 20을 저장하게되면 기존의 정수 10은 제거됨
				System.out.println(num);
				
		int score1 = 80, score2 = 60, score3 = 70, score4 = 100, score5 = 10;
		System.out.println("1벅 학생 점수 :" + score1);
		
		//int형 정수 10개를 저장하기 위한 배열 변수 arr 선언
		
		//배열 선언 : 데이터타입[] 배열명;
//		int[] arr ; //int형 정수 저장을 위한 배열 공간의 이름을 arr로 선언
		//=>정수를 저장할 수 있는 메모리 공간은 아직 생성되지 않았음
		//	배열에 데이터 저장은 불가
		//배열 생성 : 배열명 = new 데이터타입[]	
//		arr = new int[3];
		//실제 데이터 저장이 가능한 메모리 공간 3개가 연속적으로 생성됨
		//이 때, 배열이 생성되면 자동으로 배열 내부 공간의 데이터가
		//	 기본 데이터 타입으로 초기화 됨
		
		//위의 배열 선언 및 배열 생성 코드를 한문장으로 결합
		int[]arr = new int[3]; // 0 ~ 2번 인덱스를 갖는 배열 공간 생성
		
		//배열의 각 인덱스에 접근하여 저장된 데이터 출력
		System.out.println("배열 arr의 0번 인덱스: " + arr[0]);
		System.out.println("배열 arr의 1번 인덱스: " + arr[1]);
		System.out.println("배열 arr의 2번 인덱스: " + arr[2]);
//		System.out.println("배열 arr의 0번 인덱스: " + arr[3]); // 존재하지 않는 인덱스 
		//java.lang.ArrayIndexOutOfBoundsException예외 발생
		
		//배열 arr의 0번 인덱스에 정수 10을 저장
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("배열 arr의 0번 인덱스: " + arr[0]);
		System.out.println("배열 arr의 1번 인덱스: " + arr[1]);
		System.out.println("배열 arr의 2번 인덱스: " + arr[2]);
		arr[2] = 100;
		System.out.println(arr[2]);
		
		System.out.println("----------------------------------");
		
		//배열 선언, 생성, 초기화를 한꺼번에 수행
		//= 리터럴을 사용하여 배열을 직접 생성하는 문법 사용
		// 데이터타입[] 배열명 = {값1, 값2, ..... 값n}
		// =>n개 만큼의 배열이 자동으로 생ㅅ어되며 0 ~ n-1 까지 인덱스 부여
		// 1) int형 배열 5개 생성하면서 1, 2, 3, 4, 5로 초기화
		int[]nums = {1, 2, 3, 4, 5}; // 0 ~ 4번 인덱스 까지 자동부여
		System.out.println("배열 nums의 0번 인덱스: " + nums[0]);
		System.out.println("배열 nums의 1번 인덱스: " + nums[1]);
		System.out.println("배열 nums의 2번 인덱스: " + nums[2]);
		System.out.println("배열 nums의 3번 인덱스: " + nums[3]);
		System.out.println("배열 nums의 4번 인덱스: " + nums[4]);
		
		//학생 3명의 이름을 배열로 갖는 names 배열 생성
		//=>홍길동, 이순신, 강감찬으로 초기화
		String[]names = {"홍길동", "이순신", "강감찬"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println("------------------------");
		System.out.println("배열 names의 크기(길이) : " + names.length);
		System.out.println("배열 nums의 크기(길이) : " + nums.length);
		
		System.out.println("------------------------------------");
		
		//변수를 인덱스 번호로 활용하여 배 내의 모든 데이터에 접근하는 방법
			int index = 0;
			System.out.println("배열 names 의 0번 인덱스 "+ names[index]);
			System.out.println("배열 names 의 1번 인덱스 "+names[index]);
			System.out.println("배열 names 의 2번 인덱스 "+names[index]);
			
			//반복문을 사용하여 배열 내의 모든 데이터에 접근
			
			//names 배열의 모든 이름 출력
			for (int i = 0; i < 3 ; i++) {
//				System.out.println(names[i]);
				System.out.printf("배열 names의 %d번 인덱스 : %s\n", i, names[i]);
			}
			//nums 배열의 모든 정수 출력
			for (int j = 0; j < 5; j++) {
				System.out.printf("배열 nums의 %d번 인덱스 : %d\n",j,nums[j]);
			}
			System.out.println("-------------------------------------------------------------");
			
			//반복문을 사용하여 배열 내의 모든 데이터에 접근
			//=>단, 조건식에 배열 크기를 직접 지정하지 않고
			//	배열명.length 속성을 사용하여 동적으로 변경될 수 있도록 지정
			for (int i = 0; i < names.length ; i++) {
//				System.out.println(names[i]);
				System.out.printf("배열 names의 %d번 인덱스 : %s\n", i, names[i]);
			}
			//nums 배열의 모든 정수 출력
			for (int j = 0; j < nums.length; j++) {
				System.out.printf("배열 nums의 %d번 인덱스 : %d\n",j,nums[j]);
			}
			
		
	}
}
