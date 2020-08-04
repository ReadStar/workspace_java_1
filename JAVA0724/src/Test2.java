
public class Test2 {

	public static void main(String[] args) {
	/*
	 * for문을 사용한 구구단 출력
	 * -단을 저장할 정수형 변수 dan을 선언하고 초기화
	 * 	<출력 예시>
	 * ex)dan = 3일 때
	 * <2단>
	 * 2*1=2
	 * 2*2=4 . . . . .
	 */
		int dan = 3;
			System.out.println("<"+dan+"단>");
		System.out.println(dan +" * 1 = 3");
		System.out.println(dan +" * 2 = 6");
		System.out.println(dan +" * 3 = 9");
		System.out.println(dan +" * 4 = 12");
		System.out.println(dan +" * 5 = 15");
		System.out.println(dan +" * 6 = 18");
		System.out.println(dan +" * 7 = 21");
		System.out.println(dan +" * 8 = 24");
		System.out.println(dan +" * 9 = 27");
		//변수 dan과 i를 사용하여 구구단 계싼 결과를 대체
		//변수 i를 1씩 증가시켜 구구단 계산을 1 ~ 9 까지 진행
////		int i = 1;
//		System.out.println("<"+dan+"단>");
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
//		System.out.println(dan +" * "+i+" = "+(dan * i));
//		i++;
		
		//for문을 사용하여 i가  1 ~ 9 까지 1씩 증가하면서 반복
		System.out.println("<"+dan+"단>");
		for (int i=1 ;i <= 9; i++) {
			System.out.println(dan +" * "+i+" = "+(dan * i));
		}
		

	}

}
