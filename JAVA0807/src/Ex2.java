
public class Ex2 {

	public static void main(String[] args) {
		/*
		 *다차원 배열
		 *- 1차원 배열을 여러겹 중첩시킨 형태의 배열
		 *	 (일반적인 다차원 배열은 2차원 까지만 사용)
		 *-2차원 배열은 행열의 형태를 지닌다 
		 *
		 *<기본 문법>
		 *데이터타입[][] 변수명 = new 데이터타입[행크기][열크기];
		 */

		//2차원 배열 변수 score선언
//		int[][] score;
		//2차원 배열 5행3열 크기를 갖는 int형 배열 생성
//		score = new int[5][3];
		//위의 두 문장을 하나로 결합하여 배열 선언 및 생성을 동시에 수행
		int[][] score = new int[5][3];
		
		
		/*
		 * 다음과 같은 데이터로 초기화
		 * ----------
		 * 80(0,0) 80(0,1) 80(0,2)
		 * 90(1,0) 90(1,1) 90(1,2)
		 * 100(2,0) 80(2,1) 60(2,2)
		 * 100(3,0) 100(3,1) 100(3,2)
		 * 77(4,0) 88(4,1) 90(4,2)
		 * ----------
		 */
		score[0][0] =80;
		score[0][1] =80;
		score[0][2] =80;
		score[1][0] =90;
		score[1][1] =90;
		score[1][2] =90;
		score[2][0] =100;
		score[2][1] =80;
		score[2][2] =60;
		score[3][0] =100;
		score[3][1] =100;
		score[3][2] =100;
		score[4][0] =77;
		score[4][1] =88;
		score[4][2] =90;
		System.out.printf("1번 학생 : %3d %3d %3d\n",
				score[0][0],score[0][1],score[0][2]);
		System.out.printf("2번 학생 : %3d %3d %3d\n",
				score[1][0],score[1][1],score[1][2]);
		System.out.printf("3번 학생 : %3d %3d %3d\n",
				score[2][0],score[2][1],score[2][2]);
		System.out.printf("4번 학생 : %3d %3d %3d\n",
				score[3][0],score[3][1],score[3][2]);
		System.out.printf("5번 학생 : %3d %3d %3d\n",
				score[4][0],score[4][1],score[4][2]);
		
	}

}
