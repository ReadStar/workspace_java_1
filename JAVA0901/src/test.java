
public class test {

	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank();
		ib.accountNo = "111 - 1111 - 111";
	ib.ownerName = "홍길동";
	ib.deposit(100000);
	System.out.println("출금된 금액" + ib.withdraw(50000));
	
	ib.contract("자동차 보험");
			ib.print();

	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;

	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금된 금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}

	public int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("출금불가(잔액부족)");
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance);
			// 현재 메서드에서 작업 수행을 종료한 후 메서드를 빠져나감
//			return 0;
			amount = 0; // if문 외부에서 한번에 리턴을 수행할 경우
			// ->출금금액을 0으로 만들어서 리턴
		} else {
			balance -= amount;
			System.out.println("출금한 금액 : " + amount + "원, 현재 잔고 : " + balance);
		}
		return amount;
	}
}

//Account 클래스를 상속받는 ItwillBank 클래스 정의
class ItwillBank extends Account {
	String InsureName;

	public void contract(String InsureName) {

	}

public void print() {
	System.out.println("계좌 번호 : " + accountNo);
	System.out.println("예끔주" + ownerName);
	System.out.println(("현재잔고 : " + balance));
	System.out.println("보험명 : " + InsureName);
	}
}

//보험명(InsureName, 문자열 )변수 선언
//보험계약(contaract())  변수 선언
//=>파라미터 문자열(oinsureName), 리턴값 없음
//	=>전달받은 보험명(insureName)을 멤버변수에 전달하고
//				"계약하신 보험명 : XXXd입니더다") 출력