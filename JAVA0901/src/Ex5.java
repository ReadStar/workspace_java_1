import javax.swing.JFrame;

public class Ex5 {

	public static void main(String[] args) {
		
		MyFrame MF = new MyFrame();
		
	}

}

// javax.swing.JFrame 클래스를 상속받는 MyFrame 클래스를 정의
class MyFrame extends JFrame{
	//JFrame 클래스에 존재하는 다양한 멤버에 접근하여
	//프레임 관련 기능 활용이 가능해진다.
	public MyFrame() {
		showFrame();
	}
	public void showFrame() {
		//JFrame 클래스의 setTitle() 메서드를 호출하여
		//문자열 전달 => 프레임 제목 표시줄 내용 설정
		setTitle("Title");
		
		//JFrame 클래스의 setSize()메서드를 호출하여
		//정수 2개 전달 => 프레임의 크기(가로, 세로) 설정
		setSize(300,200);

		//JFrame 클래스의 setVisible() 메서드를 호출하여
		//논리형 데이터 1개 전달 => 화면 표시 여부 설정
		setVisible(true);
	}
}