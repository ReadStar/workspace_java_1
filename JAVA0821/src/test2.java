
public class test2 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		acc.print();

		Account2 acc2 = new Account2("222-2222-222");
		acc2.print();
		
		Account2 acc3 = new Account2("222-2222-222", "이길동");
		acc3.print();
		
		Account2 acc4 = new Account2("333-3333-333", "김길동", 0);
		acc4.print();
		
	}

}

/*
*Account클래스 정의
*-멤버변수
*계좌번호 (accountNo. String)
*예금주명(ownerName, String)
*현재잔고(balance, int)
*기본생성자 정의 및 다음 데이터로 초기화
*계좌번호 : "111-1111-111"
*예금주명 : "홍길동"
*현재잔고 : 0
*/
class Account2{
	String accountNo;
	String ownerName;
	int balance;
	public Account2() {
		System.out.println("Account2() 생성자 호출");
		accountNo = "111-1111-111";
		ownerName="홍길동";
		balance =0;
	}
	//계좌번호(accountNo)를 전달받아 초기화 하는 생성자 정의
	//예금주명 : "홍길동, 현재잔고 : 0 으로 직접 초기화
	public Account2(String accountNo) {
		super();
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	//계좌번호(accountNo), 예금주명(ownerName)을 전달받아 초기화 하는 생성자 정의
	//현재잔고 0으로 직접 초기화
	public Account2(String accountNo, String ownerName) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}
	//계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance)를 전달받아 초기화 하는 생성자 정의
	public Account2(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
		public void print() {
			System.out.println("계좌번호 : " + accountNo );
			System.out.println("예금주명 : " + ownerName );
			System.out.println("현재잔고 : " + balance);
		}
	
	
}