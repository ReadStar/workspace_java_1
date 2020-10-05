
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 인터페이스의 필요성(장점)
		 * 4. 모듈간 독립적 프로그래밍으로 개발 시간 단축
		 * 		-여러 모듈간에 공통된 기능을 구현할 메서드를
		 * 		인터페이스 내의 추상메서드로 제공하여 모듈간 통일성 부여
		 * 		-각 모듈에서 추상메서드 구현을 농해 각자에게 필요한 기능을
		 * 		  따로 작업한 후 차후 결합 시 쉽게 결합 가능
		 * 		-따라서, 상대방의 작업 진행 상황과 관계없이 개발이 가능하므로
		 * 		  개발 비용이 줄어드는 효과를 가져오게 된다
		 * 
		 * 
		 * 숫자 2개를 입력하여 합을 계산 후 결과를 화면에 출력하는 프로그램
		 * =>디자이너(A)- 개발자(B) 협업 수행 가정했을 때
		 * 		A는 입력받은 데이터를 B에 전달하고 결과값을 기다린 후
		 * 		B가 리턴하는 결과를 전달받아 화면에 출력해야하며,
		 * 		B는 A가 입력받은 데이터를 전달했을 때, 해당 데이터의
		 * 		합계를 계산한 후 다시 A 에게 리턴해야하단다.
		 * 		이 때, 서로 상대방의 작업이 완료되지 않으면 다음 작업 수행이
		 * 		불가능하므로 상호간에 작업 내용이 같이 진행되어야 한다.
		 * 		따라서, 한 쪽에서 작업이 지연되면 다른 쪽도 함께 지연되므로
		 * 		작업에 소요되는 비용이 증가하게 됨
		 * =>이를 해결하기 위해 인터페이스 적용 가능
		 * 		A입장 : "숫자 두 개 전달 시, 하나의 결과값(숫자) 리턴받음"
		 * 		B입장 : "숫자 두 개 전달 받아 계산 후 하나의 숫자 리턴"
		 * 
		 */
		
		//디자이너 입장에서의 코드(파라미터 및 리턴) 확인
		CalculatorDesigner designer = new CalculatorDesigner();
		designer.add();
		
		//개발자 입장에서의 코드 확인
		CalculatorDeveloper developer = new CalculatorDeveloper();
		int result = developer.add(100, 200);
		System.out.println("리턴 값 :" + result);
	}

}

interface Calculator{
	//디자이너와 개발자 모두 사용할 공통 메서드를 추상메서드로 정의
	public int add(int a, int b);
}
//디자이너 입장에서의 코드
class CalculatorDesigner{
	public void add() {
		//외부로부터 두 개의 숫자를 입력받았다고 가정
		int a=10, b = 20;
	//개발자에게 두 정수를 전달한 뒤, 결과값으로 정수 1개 리턴받아 출력
	//=>현재 개발자 코드가 완성되지 않았더라도
	// 		개발자가 사용할 메서드를 미리 구현한 클래스를 대신 사용 가능
		CalculatorDesignerDev cal = new CalculatorDesignerDev();
		int result = cal.add(a, b); //입력받은 두 정수 전달 후 결과 리턴
		System.out.println(a + "+" + b + "=" + result);
		
		//----------------------------------------
		//차후 개발자의 코드가 완성되면 해당 객체를 통해 add()메서드 호출
	}
}
//디자이너가 개발자에게 구현될 코드를 미리 간단히 작성하여 테스트 가능
class CalculatorDesignerDev implements Calculator{

	@Override
	public int add(int a, int b) {
		//디자이너 입장에서는 전달받은 두 수를
		//어떻게 계산할 지는 중요하지 않으며, 단지 확인만 수행하면 됨
		System.out.println("전달된 파라미터 확인  a=" + a + ",b=" + b);
		return 0;
	}
	
}

//----------------------------------------------------------------
//개발자 입장에서의 코드
//외부로부터 정수를 입력받는 코드는 중요하지 않고
//전달받은 2개의 정수에 대한 덧셈을 수행한 후 리턴이 잘 되는지 확인만 필요
class CalculatorDeveloper implements Calculator{

	@Override
	public int add(int a, int b) {
		System.out.println("전달받은 파라미터 : " + a + "," + b);
		return a + b;
	}

}