package test1030;


public class 빅데이터_200713_서청빈_3 {

	public static void main(String[] args) {
	Account accinfo = new Account();
	accinfo.accountNo = "123-45-6789";
	accinfo.ownerName = "홍길동";
	accinfo.balance = 10000;
	accinfo.deposit(5000); //입금금액
	accinfo.withdraw(5000);//출금금액
	}
}

class Account {
	String accountNo;
	String ownerName;
	int balance;
//입금금액
	public void deposit(int amount) {
		//현재잔고
		balance += amount;
		System.out.println("입금금액 : " + amount + "원" + " 현재잔고 : " + balance + "원");
	}
//출금금액
	public int withdraw(int amount) {
		if (balance < amount) {
			System.out.println( "현재잔고 : " + balance + "원"+", 출금할 금액 : " + amount + "원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		} else {
			System.out.println( "현재잔고 : " + balance + "원"+ ", 출금할 금액 : " + amount + "원" );
			balance -= amount;
			System.out.println(amount + "원이 출금 되었습니다 (현재 잔고 : "+balance+"원)" );
		}
		return amount;
	}
}