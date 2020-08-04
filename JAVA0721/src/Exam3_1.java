
public class Exam3_1 {

    public static void main(String[] args) {
        // [3-1] 다음 연산의 결과를 적으시오.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        
        System.out.println(1 + x << 33);
        // 1 + x = 3 이므로 3 << 33 이 된다.
        // 이 때, 좌측 33 쉬프트는 33 - 32 = 1 쉬프트와 동일하므로
        // 3 << 1 = 3 * 2 = 6
        
        System.out.println(y >= 5 || x < 0 && x > 2); //true
        //||연산자보다 &&연산자가 우선
        System.out.println(y += 10 - x++); // 13
        //1) 10 - x++ : 10-x 수행 후 3으로 변경
//        	=> 10-2=8, x++ -> x=3
        //2)10-x = 8 + y(5) = 13
        System.out.println(x += 2); // 5
        
        System.out.println( !('A' <= c && c <='Z') ); //false
        //c >= 'A' && c<='Z'연산에 의해 A가 true이므로
        //NOT연산자 !에 의해 false
        System.out.println('C' - c); //2
        
        System.out.println('5' - '0'); //5
        
        System.out.println(c + 1); //66
        
        System.out.println(++c); //B
        
        System.out.println(c++); //B
        
        System.out.println(c); // C
    }

}









