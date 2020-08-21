
public class test {

	public static void main(String[] args) {
//		Account ac = new Account("111-1111-111", "홍길동", 0);
		Account ac = new Account();
		System.out.println("계좌번호 :" + ac.accountNo + " 예금주명 : " + ac.ownerName + " 현재 잔고 : " + ac.balance);
		System.out.println("----------------------------------------");
		// 파라미터 생성자 호출
		Account acc = new Account("222-2222-222", "이길동", 5000);
		System.out.println(acc.accountNo + acc.ownerName + acc.balance);
	}

}

/*
 * Account클래스 정의 -멤버변수 계좌번호 (accountNo. String) 예금주명(ownerName, String)
 * 현재잔고(balance, int) 기본생성자 정의 및 다음 데이터로 초기화 계좌번호 : "111-1111-111" 예금주명 : "홍길동"
 * 현재잔고 : 0
 */
class Account {
	String accountNo;
	String ownerName;
	int balance;

	// 기본생성자 정의 및 멤버변수 초기화
	public Account() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
//	public Account(String accountNo, String ownerName, int balance) {
	}

	// 생성자 오버로딩을 사용하여 파라미터 생성자 정의
	// =>계좌번호, 예금주명, 현재잔고를 전달받아 초기화 수행
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
	}
}