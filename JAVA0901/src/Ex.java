
public class Ex {

	public static void main(String[] args) {
//		Point2D p = new Point2D();
//		p.print2d();
		Point3D p2 = new Point3D();
		p2.print3D();
		//만약 2차원 좌표를 사용해야할 경우
		//별도로 Point2D 클래스의 인스턴스 생성 없이
		//상속받는 메서드 호출만으로 사용 가능
		
		
	}

}

//2차원 좌표를 관리하는 Point2D 클래스 정의
class Point2D {
	//x,y축 좌표 정보를 저장하는 인스턴스 변수 선언
	int x = 10;
	int y = 20;
	//x,y축 좌표 정보를 출력하는 메서드 정의
	public void print2d() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

//3차원 좌표를 관리하는 Point3D 클래스 정의
//=> 2차원 좌표 관리는 이미 print2D클래스에서 수행중이므로
//		/Point2D 클래스에서 x, y좌표를 관리하므로 z 좌표만 추가
class Point3D extends Point2D{
	//x, y, z 축 좌표 정보를 저장하는 인스턴스 변수 선언
//	int x = 10;
//	int y = 20; // 이미 Point 클래스에서 x,y좌표를 관리하므로 z 좌표만 추가
	int z = 30;
	public void print3D() {
		//서브클래스 메서드 내에서 슈퍼클래스로부터 상속받은 변수나 메서드에 자유롭게 접근 가능
		System.out.println("3차원 좌표 x = " + x + ", y = " + y + ",z =" + z);
	}
}