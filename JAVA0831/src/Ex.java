
public class Ex {
	public static void main(String[] args) {
		/*
		 * 상속(Inheritance)
		 * -슈퍼클래스(부모클래스, 상위클래스)가 가진 멤버(변수, 메서드)를
		 *   서브클래스(자식클래스, 하위클래스)가 물려받아
		 *   선언없이 사용할 수 있도록 하는 것
		 * -서브클래스를 정의할 때 물려받을 슈퍼클래스를 지정하여 표현
		 * -Is-a관계라고도 함
		 * -상속을 통해 슈퍼클래스의 멤버를 물려받기 때문에
		 * 	 직접 메서드 또는 변수를 생성할 필요가 없어서 코드 중복 최소화됨
		 *  또한, 슈퍼클래스의 멤버를 수정하면 서브클래스에서는
		 *  슈퍼클래스에서 수정된 내용이 그대로 적용되므로 유지보수가 용이
		 * -Private 접근제한자 적용된 멤버나 생성자는 상속 불가
		 * -아무 클래스도 상속받지 않은 클래스는 자동으로 Object 클래스를 상속
		 *  =>즉 모든 클래스의 최상위 클래스가 Object 클래스 이다
		 * 
		 * <상속 적용 기본 문법>
		 * class 서브클래스명 extends 슈퍼클래스명{}
		 * 
		 */
		//child클래스 인스턴스 생성
		Child c = new Child();
		//child인스턴스를 통해 접근 가능한 메서드 : 2개
		c.childPrn();	//서브클래스에서 직접 정의한 메서드
		c.parentPrn(); //슈퍼클래스로부터 상속받은 메서드
	
		System.out.println("--------------------------------------------------");
		//IronMan 인스턴스 생성
		IronMan i = new IronMan();
		//IronMan 인스턴스를 통해 접근 가능한 메서드 : 4개
		//상속받은 메서드 2개
		i.eat();
		i.jump();
		//직접 정의한 메서드 2개
		i.fly();
		i.shootBeam();
		//Person 클래스(슈퍼클래스)로부터 상속받은 멤버변수 1개
		i.name ="토니 스타크";
		System.out.println(i.name);
		
		//SpidseMan 클래스 인스턴스 생성 및 변수와 메서드 접근
		SpiderMan s = new SpiderMan();
		s.fireWeb();
		s.eat();
		s.jump();
		s.name ="피터 파커";
		System.out.println(s.name);
		
		System.out.println("--------------할아버지---------------------");
		//할아버지 인스턴스 생성
		할아버지 할아버지 = new 할아버지();
		//접근가능한 멤버 :2개
		할아버지.singWell();
		System.out.println(할아버지.house);
		System.out.println("-----------아버지----------------------------");
		아버지 아버지 = new 아버지();
		아버지.drawWell();//직접
		System.out.println(아버지.car);//직접
		아버지.singWell();//상속
		System.out.println(아버지.house);//상속
		System.out.println("-----------------나--------------------------");
		나 나 = new 나();
		나.singWell();//상속
		나.drawWell();//상속
		나.noting();//직접
		System.out.println(나.house);//상속
		System.out.println(나.car);//상속
	}
}





//슈퍼클래스 person 정의
class person {
	String name;
	
	public void eat() {
		System.out.println("밥먹기");
	}
	public void jump() {
		System.out.println("Jump");
	}
}

//서브클래스 IronMan 클래스 정의 => 슈퍼클래스인 Person 클래스 상속
class IronMan extends person{
	//person 클래스를 상속받았으므로 person 클래스가 가진 멤버를
	//IronMan 클래스 내에서 아무런 선언없이도 접근하여 사용 가능
	public void fly() {
		System.out.println("날다");
	}
	public void shootBeam() {
		System.out.println("빔쏘기");
	}
}

//서브클래스 SpiderMan 클래스 정의 => 슈퍼클래스인 Person 클래스 상속
class SpiderMan extends person{
	public void fireWeb() {
		System.out.println("거미줄");
	}
}


//-----------------------------
class 할아버지{
	String house ="이층집";
	public void singWell() {
		System.out.println("노래를 잘한다");
	}
}
//할아버지 클래스를 상속받는 아버지 클래스 정의
//=>멤버변수 : car ("스포츠카")
//=>메서드 : drawWell() - "그림을 잘 그린다"
class 아버지 extends 할아버지{
	String car = "스포츠카";
	public void drawWell() {
		System.out.println("그림을 잘 그린다");
	}
}
//-----------------------------
//아버지 클래스를 상속받는 나 클래스 정의
class 나 extends 아버지{
		public void noting() {
			System.out.println("백수다");
		}
}