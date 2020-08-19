
public class test3 {

	public static void main(String[] args) {
		Calculator3 c = new Calculator3();
		c.calc('+', 10, 20);
		c.calc('+', 10, 20, 30);
		c.calc('+', 10, 20, 30, 40);
		
		c.calc('-', 100, 10);
		c.calc('-', 100, 10, 20);
		c.calc('-', 100, 10, 20, 30);
		
		c.calc('*', 10, 20);
		c.calc('*', 10, 20, 30);
		
		c.calc('/', 100, 10);
		c.calc('/', 100, 10, 2);

	}

}

class Calculator3{
	public void calc(char opr, int...nums) {
		int result = nums[0]; //연산 누적 변수
		//이미 0번 인덱스 데이터는 result변수에 전다했으므로
		//if문으로 연산자 판별 후 1번 인덱스부터 마지막까지 반복 수행
				if (opr == '+') {
					for (int i = 1; i < nums.length; i++) {
				result += nums[i];
					}
				}else if (opr == '-') {
				for (int i = 1; i < nums.length; i++) {
				result -= nums[i];
				}
			}else if (opr == '*') {
				for (int i = 1; i < nums.length; i++) {
				result *=nums[i];
				}
			}else if(opr == '/') {
				for (int i = 1; i < nums.length; i++) {
				result /=nums[i];
				}
			}
				System.out.println(result);
		}
	}