
public class Exam3_4_3_5_3_6 {

    public static void main(String[] args) {
        /*
         * [3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 
         * 만일 변수 num의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. 
         * (1)에 알맞은 코드를 넣으시오.
         */
        int num = 456;
        System.out.println(num/100*100);
        
        /*
         * [3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 
         * 만일 변수 num의값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
         */
        int num2 = 333;
        System.out.println(num2/10*10+1);
        
        /*
         * 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 
         * 변수 num의 값을 뺀 나머지를 구하는 코드이다. 
         * 
         * 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 
         * 19의 경우 20이고, 81의 경우 90이 된다. 
         * 
         * 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. 
         * (1)에 알맞은 코드를 넣으시오. 
         * [Hint] 나머지 연산자를 사용하라.
         * 
         * ex) 30 - 24 = 6    20 - 19 = 1    90 - 81 = 9   120 - 111 = 9
         */
        int num3 = 24;
        System.out.println(10 - (num3%10));
        System.out.println((num3 / 10 + 1)*10 - num3);
        //10의 자리까지 추출을 위해 10으로 나누고
//        	원래 수보다 큰 가장 가까운 10의 배수 계산을 위해 +1 * 10 수행
//        	계산된 수에서 원래 수를 뺌
    }

}
















