package homework02;

public class BankAccountEx extends BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(1, "홍길동", 1000000);
		BankAccount b2 = new BankAccount(2, "김길동", 200000);
		b1.deposit(1000);
		b2.withdraw(300000);
		System.out.println(b1.getBalance());
		b1.transfer(100000, b2);
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
		b2.transfer(500000, b2);
		System.out.println(b2.getBalance());
		System.out.println(b1.getBalance());
	}

}
