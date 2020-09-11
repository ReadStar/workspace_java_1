import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Exam {
	public static void main(String[] args) {
		Unit u = new GroundUnit();
//		//GroundUnit => Unit 업캐스팅
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
//		//AirCraft Unit의 서브클래스이므로 업캐스팅 가능
		u = (Unit)ac;
//		u = ac; //형변환 연산자 생략도 가능(자동형변환  = 업캐스팅)
//		//GroundUnit 은 Unit의 서브클래스이며
//		//참조변수 u 에는 GroundUnit의 인스턴스가 업캐스팅 되어있음
//		//따라서, u-> GroundUnit으로 다웈내스팅 해도 문제없음
		GroundUnit gu = (GroundUnit)u;
//		//AirCraft 는 AirUnit의 서브클래스이므로 업캐스팅 가능
		Airunit au = ac;
//		//u에 저장된 GroundUnit은 Tankdml tbvjzmffotmdlamfh 
//		//GroundUnit->Tank로 다운캐스팅 할수 없다
//		t = (Tank) u;	
	if(u instanceof Tank) { //u is a Tank
			System.out.println();
			t = (Tank)u;
		}else {
			System.out.println("u->Tank로 변환 불가능");
		}
//		//GroundUnit 은 Tank의 슈퍼클래스이므로
//		//Tank -> GroundUnit 으로 업캐스팅 가능
//		GroundUnit gu = t;
		

	}
}
class Unit{}
class Airunit extends Unit{}
class GroundUnit extends Unit{}
class Tank extends GroundUnit{}
class AirCraft extends Airunit{}
