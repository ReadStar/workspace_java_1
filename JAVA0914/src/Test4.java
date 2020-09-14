
public class Test4 {

	public static void main(String[] args) {
		SingletonTest st1 = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
		
		System.out.println(st1.num+"," + st2.num);
		
		//인스턴스 내의 인스턴스 변수 값을 변경하면 나머지도 공유됨
		st1.num=100;
		System.out.println(st1.num+"," + st2.num);
		
		JavaTeacher jt1 = JavaTeacher.getInstance();
		JavaTeacher jt2 = JavaTeacher.getInstance();
		System.out.println(jt1.num+",."+jt2.num);
		jt1.num=200;
		System.out.println(jt1.num+",."+jt2.num);
	}

}

//1. SingletonTest 클래스 정의 -> 싱글톤 디자인 패턴 적용
class SingletonTest{
	private SingletonTest() {}
	static SingletonTest instance =new SingletonTest();
	public static SingletonTest getInstance() {
		return instance;
	}
	//싱글톤 패턴으로 생성된 객체 확인을 위한 인승턴스 변수 1개 선언
	int num = 10;
}
//2. JavaTeacher 클래스 정의 => 싱글톤 패턴 적용
class JavaTeacher{
	//	접근제한자 private 선언
	private JavaTeacher() {}
	//자신의 클래스 내에서 인스턴스선언하여 참조변수에 저장
	static JavaTeacher instance = new JavaTeacher();
	//Getter 선언
	public static JavaTeacher getInstance() {
		return instance;
	}
	int num = 20;
}