public class Test {

	public static void main(String[] args) {
		/*
		 * 정수 5개를 저장하는 배열을 생성하고
		 * 10, 20, 30, 40, 50 으로 초기화 한 후 출력
		 * 정수형 변수 total에 배열 내의 정수의 합을 누적한 뒤 결과 값 출력
		 * 
		 */
		int total = 0; //합계 누적 변수  
		int[]nums = {10, 20, 30, 40, 57}; //인덱스 선언
		System.out.println("배열 nums의 0번 인덱스: " + nums[0]);
		System.out.println("배열 nums의 1번 인덱스: " + nums[1]);
		System.out.println("배열 nums의 2번 인덱스: " + nums[2]);
		System.out.println("배열 nums의 3번 인덱스: " + nums[3]);
		System.out.println("배열 nums의 4번 인덱스: " + nums[4]);
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
			
		}
		System.out.println("배열 내의 모든 정수 합 : " + total);

		double avg = (double)total / nums.length;
		System.out.println("정수의 평균값 : " + avg);
	}

}
