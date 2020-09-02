
public class test4 {

	public static void main(String[] args) {
		ItwillBank4 ib = new ItwillBank4();
		ib.accountNo = "111-1111-111";
		ib.ownerName = "홍길동";
		ib.contract("자동차보험");
		
		ib.printAccountInfo();
		System.out.println("-----------------------");
		
		KakaoBank kb = new KakaoBank();
		kb.accountNo = "222-2222-222";
		kb.ownerName = "김길동";
		kb.deposit(10000);
		kb.withdraw(5000);
		kb.KakaoPayBalance = 99999;
		kb.printAccountInfo();
	}

}

class Account4 {
	String accountNo;
	String ownerName;
	int balance;

	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금된 금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	public void printAccountInfo() {
		//계좌 기본 정보를 출력하는 메서드
		System.out.println("계좌 번호 : " + accountNo);
		System.out.println("예금주" + ownerName);
		System.out.println(("현재잔고 : " + balance));
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
class ItwillBank4 extends Account4 {
	String InsureName;

	public void contract(String InsureName) {
		this.InsureName = InsureName;
		System.out.println("계약하신 보험명" + InsureName +"입니다");
	}
		//Account4 클래스의 printAccountInfo()메서드를 오버라이딩하여
		//계좌번호, 예금주명, 현재잔고, 보험명을 출력

	@Override
	public void printAccountInfo() {
		System.out.println("계좌 번호 : " + accountNo);
		System.out.println("예금주" + ownerName);
		System.out.println(("현재잔고 : " + balance));
		System.out.println(("보험명 : " + InsureName));
	}
}


//kakaobank 클래스 정의 - Account4 클래스 상속
//=>멤버변수 : int형 kakaopaybalance 변수
//=> printAccountinfo() 메서드 오버라이딩 하여
// 		계좌번호, 예금주명, 현재잔고, 카카오페이잔고 출력
class KakaoBank extends Account4{
	int KakaoPayBalance;

	@Override
	public void printAccountInfo() {
		System.out.println("계좌 번호 : " + accountNo);
		System.out.println("예금주" + ownerName);
		System.out.println(("현재잔고 : " + balance));
		System.out.println("카카오페이잔고 : " +KakaoPayBalance);
	}	
	}
