
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * this 키워드
		 * -자신의 현재 인스턴스 주소가 저장되어 있는 참조변수
		 * 	(자신의 인스턴스를 가르키는 목적으로 사용됨)
		 * -객체(인스턴스)생성 시 참조변수 this에 
		 * 	 자동으로 인스턴스 주소가 저장됨
		 * 
		 * 1.레퍼런스 this
		 * 		-자신의 인스턴스 주소가 저장되는 참조변수
		 * 		-모든 인스턴스에 자동으로 생성되는 변수이며
		 * 		  객체(인스턴스) 생성 시 자동으로 자신의 인스턴스 주소가 저장됨
		 * 		-인스턴스 변수와 로컬변수의 이름이 같을 때,
		 * 		  로컬변수가 선언된 메서드 내에서 인스턴스 변수를 가리키는 용도
		 * 		-메서드 내에서 인스턴스 변수와 이름이 중복되는 변수가 없으면
		 * 	     레퍼런스 this를 생략할 수 있다
		 * <기본 사용 문법>
		 * this.인스턴스변수 또는 this.인스턴스메서드()
		 */
		Person3 p = new Person3("홍길동", 20);
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		
		Person3 p2 = new Person3("홍길동", 20);
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
	}

}

class Person3{
	String name;
	int age;
		public Person3(String name, int age) {
			//매개변수로 int형 로컬변수 name, age 선언
			//=>로컬변수와 멤버변수(인스턴스변수)의 이름이 같을 때
			//		로컬변수가 선언된 메서드 내에서 해당 이름을 지정하면
			//	  로컬변수를 가리키게 된다
			name = name; //로컬변수의 데이터를 다시 로컬변수(자신)에 저장
			age = age; //따라서, 아무런 효과가 없는 코드가 된다
			//=>The assignment to variable name has no effect 오류
			
			//멤버변수와 로컬변수의 이름이 같을 때 멤버변수를 지정하기 위해서
			//레퍼런스 this를 사용하여 멤버변수를 지정해야 한다
			//=>일반참조변수와 동일하게 사용하되
			//	   자신의 인스턴스 주소가 무조건 저장되어 있음
			//=>인스턴스를 생성할 때마다 각 인스턴스 주소가
			//	   각 인스턴스 내의 this에 저장되므로 각각 다른 주소를 갖게 된다
			this.name = name; //인스턴스 변수 name에 로컬변수 name값 저장
			this.age = age; //인스턴스 변수 age에 로컬변수 age값 저장
			
		}
		//Getter / Setter 정의
		//Getter메서드는 로컬변수 선언이 없는 경우가 많으므로
		//인스턴스변수에 레퍼런스 this를 생략해도 된다
		public String getName() {
			return name;
		}
		//Setter 메서드도 인스턴스 변수와 로컬변수 이름이 동일하므로
		//인스턴스 변수(좌변)에 레퍼런스 this를 사용한다
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
}