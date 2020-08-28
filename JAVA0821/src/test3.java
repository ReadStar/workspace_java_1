 public class test3 {
 
	public static void main(String[] args) {
		Account3 acc = new Account3();
		acc.print();
//		
		System.out.println("-----------------------------");
		Account3 acc2 = new Account3("222-2222-222");
		acc2.print();
		System.out.println("-----------------------------");
		Account3 acc3 = new Account3("222-2222-222", "이순신");
		acc3.print();
		System.out.println("-----------------------------");
		Account3 acc4 = new Account3("222-2222-222", "이순신", 100000);
		acc4.print();
	}
}
 
/*
 * Account3 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(accountNo, 문자열)
 *   2) 예금주명(ownerName, 문자열)
 *   3) 현재잔고(balance, 정수)
 *   
 * - 기본생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 : "111-1111-111"
 *   예금주명 : "홍길동"
 *   현재잔고 : 0
 * 
 * - 계좌번호(accountNo)를 전달받는 생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 : 입력받은 계좌번호
 *   예금주명 : "홍길동"
 *   현재잔고 : 0
 *   
 * - 계좌번호(accountNo), 예금주명(ownerName)을 전달받는 생성자 정의 
 *   계좌번호 : 입력받은 계좌번호
 *   예금주명 : 입력받은 예금주명
 *   현재잔고 : 0
 *   
 * - 계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance)를 전달받는 생성자 정의 
 *   계좌번호 : 입력받은 계좌번호
 *   예금주명 : 입력받은 예금주명
 *   현재잔고 : 입력받은 현재잔고
 *   
 */
 
class Account3 {
	String accountNo;
	String ownerName;
	int balance;
	public Account3() {
		// 로컬변수가 없으므로 모든 변수에 this 생략 가능
		this.accountNo = "111-1111-111";
		this.ownerName = "홍길동";
		this.balance = 0;
	}
	public Account3(String accountNo) {
		// accountNo 로컬변수는 이름이 중복되므로 
		// 멤버변수 accountNo 에 레퍼런스 this 생략 불가
		this.accountNo = accountNo;
		this.ownerName = "홍길동"; // this 생략 가능
		this.balance = 0; // this 생략 가능
	}
	public Account3(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = 0;
	}
	public Account3(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void print() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
}