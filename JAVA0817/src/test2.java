
public class test2 {

	public static void main(String[] args) {
		//정수 또는 실수 2개를 전달받아 덧셈 결과를 출력하는 프로그램
		//=>메서드 오버로딩 활용
		PlusClass pc = new PlusClass();
		pc.plus(10, 20); // 30
		pc.plus(1.5, 1.5);//3.0
	}

}
class PlusClass{
	public void plus(int x, int y) {
			int result = x + y;
			System.out.println(x +"+"+ y + "=" + result );
	}
	public void plus(double x, double y) {
			System.out.println(x + y);
	}
	public void plus(float x, float y) {
		System.out.println(x + y);
	}
}