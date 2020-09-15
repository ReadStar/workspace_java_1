
public class Ex2 {

	public static void main(String[] args) {
		Person p = new Person("홍길동", "1111111-2222222");
		System.out.println("국적 : " + p.nation);
		System.out.println("이름" + p.name);
		System.out.println("주민번호" + p.ssn);
		
//		p.nation =" 대한민국"; //인스턴스를 통해서도 final 변수 변경은 불가능
	}

}

class Person{
//	final String nation; //파이널 변수는 초기화 하지않으면 오류 발생
	final String nation="KOREA";
	
	String name;
	
	final String ssn; //만약, final 변수 선언 시 초기화 하지 않을 경우
	//생성자에서 초기화를 수행하면 오류가 발생하지 않음
	//이 때, 변수 선언 시 초기화하지 않은 final 변수를 blank final 변수라고 함

	public Person(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn; //blank final 변수를 초기화 했으므로 변수 선언에서 발생한 오류가 사라짐
		
		//한 번 초기화 된 fianl 변수는 더 이상 값 변경 불가
//		nation = "대한민국";
//		this.ssn="1111111-2222222"; // 오류
		
	}
}