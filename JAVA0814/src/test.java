
public class test {

	public static void main(String[] args) {
		/*
		 * Account 인스턴스 생성 후 다음과 같이 데이터 저장 후 출력
		 * 계좌번호 : 1111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 100000원
		 */
		Account a1 = new Account();
		a1.accountNo = "111-1111-111";
		a1.ownerName = "홍길동";
		a1.balance = 100000;
		System.out.println("계좌번호 : " + a1.accountNo);
		System.out.println("예금주명 : " + a1.ownerName);
		System.out.println("현재잔고 : " + a1.balance + "원");
		a1.deposit(5000);
		a1.withdraw(5000);
		a1.withdraw(5000000);
		//withdraw() 메서드를 호출하여 출금할 금액 전달 후
		//출금 성공 시 출금된 금액을 리턴받기
			int myMoney = a1.withdraw(5000);
			System.out.println("출금된 금액 : " + myMoney);
			System.out.println("---------------------------------------");
		Account a2 = new Account();
		a2.accountNo = "222-2222-222";
		a2.ownerName = "이순신";
		a2.balance = 1000000;
		System.out.println("계좌번호" + a2.accountNo);
		System.out.println("예금주명 : " + a2.ownerName);
		System.out.println("현재잔고" + a2.balance);
		a2.deposit(50000);
		a2.withdraw(1000000);
		a2.withdraw(100);
	}

}
class Account{
	String accountNo;
	String ownerName;
	int balance;
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금된 금액 : "+amount+"원");
		System.out.println("현재잔고 : "+ balance + "원");
	}
	public int withdraw(int amount) {
		if (balance<amount) {
			System.out.println("출금불가(잔액부족)");
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance);
			//현재 메서드에서 작업 수행을 종료한 후 메서드를 빠져나감
//			return 0;
			amount = 0; //if문 외부에서 한번에 리턴을 수행할 경우
			//->출금금액을 0으로 만들어서 리턴
		}else {
			balance -= amount;
			System.out.println("출금한 금액 : " + amount + "원, 현재 잔고 : " + balance);
		}return amount;
	}
}
/*
*은행계좌(Account)클래스 정의
*멤버변수
*1)계좌번호(accountNo, 문자열) ex)111-1111-111
*2)예금주명(ownerName, 문자열) ex)홍길동
*3)현재잔고(balance, 정수) ex) 10000
*
*메서드 정의
*1)입금 (deposit)
*	-매개변수 1개(정수형 amount)
*	-리턴값 없음
*	-입금할 금액(amount)를 전달받아 현재잔고 (balance)에 누적 후 출력
*		입금된 금액 : xxxx원
*		현재잔고 : xxxxx원
*2)출금 (withdraw)
*	-매개변수 1개(정수형 amount -출금할 금액)
*	-리턴값 있음(int -출금된 금액)
*	-출금할 금액(amount)를 전달받아 현재잔고(balance)와 비교
*		=>만약, 현재잔고보다 금액이 클 경우 출금 불가능하므로
*			"출금 불가(잔액부족)"
*			"출금할 금액 : xxxx원, 현재잔고 : xxxx원" 출력 후 메서드 종료
*			=>아니면(현재잔고보다 출금할 금액이 크지 않을 경우) 출금 가능하므로
*				출금할 금액만큼 현재잔고(balance)에서 차감한 후
*				출금할 금액만큼 리턴
*
*/