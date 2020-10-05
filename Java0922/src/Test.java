
public class Test {

	public static void main(String[] args) {
		Account ac = new Account("111-1111-111", "뫄뫄", 10000);
		System.out.println(ac);
		System.out.println("ac의 정보" +  ac.getClass());
		System.out.println("ac의 해시코드 : " + ac.hashCode());
		Account ac2 = new Account("222-2222-222" , "솨솨", 20000);
		
		if(ac == ac2) {
			System.out.println("일치");
		}else {
			System.out.println("다름");
		}
	}

}
/*
*Account 클래스 정의
*-멤버변수
*1)계좌번호(문자열, accountNo)
*2)예금주명(문자열, ownerName)
*3)현재잔고(정수, balance)
*-생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
*-toString()	메서드와 equals() 메서드 오버라이딩
*/

class Account{
	String accountNo;
	String ownerName;
	int balance;
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + balance;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (balance != other.balance)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
}