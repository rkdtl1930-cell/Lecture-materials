package homework02;

public class BankAccount {
	private int accountNumber;
	private String owner;
	private int balance;
	
	public BankAccount() {}
	public BankAccount(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	public int deposit(int amount) {
		return balance += amount;
	}
	public int withdraw(int amount) {
		if(balance < amount)
			System.out.println("잔액이 부족합니다.");
		else if(balance >= amount)
			balance -= amount;
		return amount;
	}
	public int getBalance() {
		return balance;
	}
	public int transfer(int amount, BankAccount otherAccount) {
		if(balance < amount)
			System.out.println("잔액이 부족합니다");
		else {
			balance -= amount;
			otherAccount.deposit(amount);
			System.out.println(amount + "원이 성공적으로 송금되었습니다.");
		}
		return amount;
	}
}
