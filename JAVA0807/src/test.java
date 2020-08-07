
public class test {

	public static void main(String[] args) {
		/*
		 * 5명의 학생 점수를 저장하는 배열 생성 후
		 * 해당 점수의 총점과 평균을 계
		 */

		
		
		//1. 5명 학생의 점수(100, 80, 77, 90, 60)를갖는 배열 생성 후 출
		
		int[] score = {100, 80, 77, 90, 60};
		for(int i =0;  i<score.length; i++) {
			System.out.println((i+1)+"번 학생 : "+score[i] + "");
		}
		
		
	System.out.println("----------------------");
	//2. for문을 사용하여 5명 학생의 점수를 총점에 누적 후 출력
	int total = 0; 
	for (int i = 0; i < score.length; i++) {
		total += score[i];
	}
	System.out.println(total);
	
	//3. 5명 학생의 점수 평균을 계산 후 출력
	double avg =  (double)total / score.length;
	System.out.println(avg);
	}

}
