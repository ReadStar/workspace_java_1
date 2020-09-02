
public class test {

	public static void main(String[] args) {
		SpiderMan sp = new SpiderMan();
		sp.isSpider = true; //모드 설정
		sp.jump(); //SpiderMan 클래스의 점프 기능 호출
		
		sp.isSpider = false;
		sp.jump(); //SpiderMan 클래스의 jump() aptjemdptj
						 //슈퍼클래스인 Person 클래스의 점프 기능이 호출됨
	}

}


class Person{
	String name;
	int age;
public void eat(){
	System.out.println("먹기");
}
public void jump() {
	System.out.println("일반인의 점프");
	}
}

class SpiderMan extends Person{
	//스파이더맨 모드 여부를 저장하는 boolean 타입 isSpider 선언
	boolean isSpider;

public void fireWeb() {
	System.out.println("거미줄 발사");
	}
//Person 클래스의 jump() 오버라이딩

@Override
public void jump() {
	//스파이더모드(isSpider)가 true 일 때 (스파이더모드)
	//"스파이더맨의 점프"출력하고,
	//아니면(false) Person 클래스의 jump() 메서드를 호출
	if(isSpider) {//isSpider == true 와 동일
			System.out.println("스파이더맨의 점프");
	}else {
		//슈퍼클래스의 jump() 메서드 호출
		//=>은닉되어 있으므로 레퍼런스 supe를 사용하여 접근
		super.jump();
	}

}

}