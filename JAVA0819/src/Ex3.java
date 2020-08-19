
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 가변인자(비정형 인자, Variable Arguments)
		 * -메서드 정의 시 파라미터(매개변수)에 전달되는 인자의 갯수가
		 * 	 유동적일 때 일정 갯수가 정해져 있지 않으므로 변수 선언이 어렵다.
		 * 	 따라서, 이렇게 유동적인 인자의 갯수를 모두 처리할 수 있도록
		 * 	 가변인자를 사용하여 변수를 선언하면
		 * 	 동일한 타입의 갯수가 제한이 없는 인자를 모두 전달받을 수 있음
		 * -가변인자 형태로 선언되는 매개변수는 전달받은 데이터를
		 * 	 해당 이름을 가진 배열 형태로 관리함
		 *-가변인자에 전달될 데이터는 0개부터 자유롭게 전달 가능
		 *
		 *<주의 사항>
		 * 가변인자는 마지막 파라미터로 단 한 번만 사용 가능하다
		 *
		 * <가변 인자를 사용한 메서드 정의 기본 문법>
		 * [제한자] 리턴타입 메서드명 (데이터타입... 변수명){
		 * 		=> 전달되는 데이터들이 가변인자 변수명의 배열로 관리됨
		 * }
		 */
			VariableArguments va = new VariableArguments();
//			va.print();
//			va.print(10);
			va.print(10, 20);
			va.print(10, 20, 30);
			va.varargsPrint(10, 20, 30, 40);
			va.varargsPrint(10, 20, 30, 40, 50);
			//가변인자를 사용한 메서드 호출 시 전달할 파라미터 갯수 제한 없음
			
	}

}

class VariableArguments{
			//가변인자(비정형인자)를 활요한 메서드 오버로딩
			//	=>하나의 메서드 정의만으로 갯수가 다른 파라미터를 모두 처리 가능
	public void varargsPrint(int...nums) {
		//외부로부터 전달되는 정수형 데이터는 갯수 제한 없이
		//모두 nums 이름은 갖는 배열에 저장됨
		//=>반복문을 사용하여 배열 내의 모든 데이터에 접근하여 저당된 데이터 사용
		//1) 일반 for문
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
		//2) 향상된 for문
		for(int num : nums) {
			System.out.println(num + " ");
		}
	}
	//--------------------------------------------
	//주의사항
	//가변인자는 마지막 인자로 단 한 번만 사용 가능
	public void varargsPrin2t(String title, int...nums) {}
	//=>가변인자 앞에 다른 매개변수가 있더라도, 마지막이 가변인자면 ok
//	public void varargsPrint2(int...nums, String title) {}
	//=>가변인자 뒤에 다른 매개변수가 올 수 없다
//	public void varargsPrint2(int...nums, String...title) {}
	//=>가변인자가 얼마나 쓰일지 모르기 때문에 가변인자 뒤에는 다른 매개변수가 올 수 없으니 2개 이상의 가변인자 사용도 불가능하다
	
	//정수 2개를 전달받아 출력하는 print()메서드 정의
	public void print(int num1, int num2) {
		System.out.println(num1 + "," + num2);
	}
	//정수 3개를 전달받아 출력하는 print()메서드 정의
	
	public void print(int num1, int num2, int num3) {
		System.out.println(num1 + "," + num2 + "," + num3);
	}
//	=>전달되는 데이터가 2개 또는 3개의 경우에만 메서드가 호출되고
//		 0개, 1개, 4개 이상의 경우에는 일치하는 매개변수가 없으므로
//		 호출되지 못하고 오류가 발생
}