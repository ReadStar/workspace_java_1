
public class Test3 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문을 사용하여 구구단 2단 ~ 9단까지 출력
		 */
		int dan = 2;//초기식1
		while (dan<=9) {//조건식1
			int soo = 1;//초기식2
			while (soo<=9) {//조건식2
				System.out.println(dan+"x"+ soo + "=" + (dan*soo));
				soo++;//증감식2
			}dan++;//증감식1
		}
	}
}
