
public class Ex1 {

	public static void main(String[] args) {
		//while 문을 사용한 구구단
		int dan = 2; //단
		int soo = 1; //초기식
		System.out.println("<"+dan+"단>");
		while (soo <= 9) {
				System.out.println(dan + "*" + soo + "=" +(dan*soo));
				soo++;
			}
		System.out.println("--------------------------------------");
		//1 ~ 10까지 정수의 합산
		int i = 1;
		int total = 0;
		while(i<=10) {
			System.out.println(i);
			total += i;
			i++;
		}
		System.out.println(total);
		
		System.out.println("---------------------------------------");
		
		//1 ~ 10 까지 홀수의 합(oddTotal), 짝수의 합(evenTotal)
		int a = 1;
		int oddTotal = 0;
		int evenTotal = 0;
		while(a<=10) {
			if(a%2 ==1) {
				oddTotal +=a;
			}else {
			evenTotal +=a;}
			System.out.println(a);
				a++;
		}System.out.println("홀수의 합" + oddTotal + "짝수의 합" + evenTotal);
	}

}
