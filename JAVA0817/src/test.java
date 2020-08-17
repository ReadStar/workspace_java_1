
public class test {

	public static void main(String[] args) {
		/*
		 * account클래스의 인스턴스 생성 및 다음과 같은 데이터 저장
		 * 계좌번호 111- 1111- 111
		 * 예금주명  홍길동
		 * 현재잔고 100000원
		 */
		Account a = new Account();
		a.setAccountNo("111-1111-111"); 
		a.setOwnerName("홍길동");
//		a.setBalance(100000); //private 메서드는 외부에서 접근 불가
		//=>대신 deposit() 또는 withdraw()메서드로 입/출금 기능 활용
		System.out.println("계좌번호 : "  + a.getAccountNo());
		System.out.println("예금주명 : " + a.getOwnerName());
		System.out.println("현재잔고 :" + a.getBalance());
		
		
	}

}
/*
* Account 클래스 정의
* -멤버변수
* 		1)계좌번호(accountNo, String)
* 		2)예금주명(ownerName, String)
* 		3)현재잔고(balace, int)
* 
*/
class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	//은행계좌에서 현재잔고를 직접 수정하는 것은 좋지 못하므로
	//setBalance() 메서드를 제외하거나, private으로 선언하면 된다
	private void setBalance(int balance) {
		this.balance = balance;
	}
	
	//멤버변수들에 대한 Getter/Setter 정의
	
//	public String getAccountNo() {
//		return accountNo;
//	}
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;
//	}
//	public String getOwnerName() {
//		return ownerName;
//	}
//	public void setOwnerName(String newOwnerName) {
//		ownerName = newOwnerName;
//	}
//	public int getBalance() {
//		return balance;
//	}
//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
	
	
	
}