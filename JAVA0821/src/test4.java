 
public class test4 {
 
	public static void main(String[] args) {
		Account4 acc = new Account4();
		acc.print();
//		
		System.out.println("-----------------------------");
		Account4 acc2 = new Account4("222-2222-222");
		acc2.print();
		System.out.println("-----------------------------");
		Account4 acc3 = new Account4("222-2222-222", "이순신");
		acc3.print();
		System.out.println("-----------------------------");
		Account4 acc4 = new Account4("222-2222-222", "이순신", 100000);
		acc4.print();
	}
 
}
 
/*
 * Account4 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(accountNo, 문자열)
 *   2) 예금주명(ownerName, 문자열)
 *   3) 현재잔고(balance, 정수)
 *   
 * - 기본생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 : "111-1111-111"
 *   예금주명 : "홍길동"
 *   현재잔고 : 0
 *   => Account4(String, String, int) 생성자를 호출하여 대신 초기화 수행
 * 
 * - 계좌번호(accountNo)를 전달받는 생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 : 입력받은 계좌번호
 *   예금주명 : "홍길동"
 *   현재잔고 : 0
 *   => Account4(String, String, int) 생성자를 호출하여 대신 초기화 수행
 *   
 * - 계좌번호(accountNo), 예금주명(ownerName)을 전달받는 생성자 정의 
 *   계좌번호 : 입력받은 계좌번호
 *   예금주명 : 입력받은 예금주명
 *   현재잔고 : 0
 *   => Account4(String, String, int) 생성자를 호출하여 대신 초기화 수행
 *   
 * - 계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance)를 전달받는 생성자 정의 
 *   계좌번호 : 입력받은 계좌번호
 *   예금주명 : 입력받은 예금주명
 *   현재잔고 : 입력받은 현재잔고
 *   
 */
 
class Account4 {
	String accountNo;
	String ownerName;
	int balance;
	public Account4() {
		// 로컬변수가 없으므로 모든 변수에 this 생략 가능
//		this.accountNo = "111-1111-111";
//		this.ownerName = "홍길동";
//		this.balance = 0;
		// Account4(String, String, int) 생성자 호출하여 대신 초기화 수행
		this("111-1111-111", "홍길동", 0);
		System.out.println("Account4() 생성자 호출됨!");
	}
	public Account4(String accountNo) {
		// accountNo 로컬변수는 이름이 중복되므로 
		// 멤버변수 accountNo 에 레퍼런스 this 생략 불가
//		this.accountNo = accountNo;
//		this.ownerName = "홍길동"; // this 생략 가능
//		this.balance = 0; // this 생략 가능
		// Account4(String, String, int) 생성자 호출하여 대신 초기화 수행
		this(accountNo, "홍길동", 0);
		System.out.println("Account4(String) 생성자 호출됨!");
	}
	public Account4(String accountNo, String ownerName) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = 0;
		// Account4(String, String, int) 생성자 호출하여 대신 초기화 수행
		this(accountNo, ownerName, 0);
		System.out.println("Account4(String, String) 생성자 호출됨!");
	}
	// 다른 생성자로부터 데이터를 전달받아 초기화 작업을 수행하는 생성자
	public Account4(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("Account4(String, String, int) 생성자 호출됨!");
	}
	public void print() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
}