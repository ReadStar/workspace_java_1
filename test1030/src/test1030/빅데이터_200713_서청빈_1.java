package test1030;

public class 빅데이터_200713_서청빈_1 {

	public static void main(String[] args) {
		int pee = 50000;
		int age = 22;
		if(age<1 ||age > 100) {
			System.out.println("나이 범위 오류 1~100 사이 값으로 입력");
		}else if(age>=5 && age<=19) {
			System.out.println("나이가"+age+"세 이므로 입장료는" +(int)(pee*0.7)+ "원 입니다");
		}else if(age>=65 || age<5) {
			System.out.println("나이가"+age+"세 이므로 입장료는" +(int)(pee*0.5)+ "원 입니다");
		}else {
			System.out.println("나이가"+age+"세 이므로 입장료는" +(pee)+ "원 입니다");
		}
	}

}
