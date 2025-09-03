package fExam;

import java.util.ArrayList;
import java.util.List;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class EWallet {
    private String walletID;
    private String owner;
    private int balance;
    private List<String> transactionHistory;
    private int minBalance = 1000; // 최소 잔액
    private double transferFeeRate = 0.01; // 송금 수수료 1%

    // 기본 생성자
    public EWallet() {
        this.walletID = "W000";
        this.owner = "Unknown";
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    // 모든 필드 초기화 생성자
    public EWallet(String walletID, String owner, int balance) {
        this.walletID = walletID;
        this.owner = owner;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    // 소유자만 초기화 생성자
    public EWallet(String owner) {
        this.walletID = "W000";
        this.owner = owner;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    // 입금
    public void deposit(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금 금액은 0보다 커야 합니다.");
        }
        balance += amount;
        transactionHistory.add("입금 " + amount);
    }

    // 출금
    public void withdraw(int amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        }
        if (balance - amount < minBalance) {
            throw new InsufficientBalanceException("잔액이 부족합니다. 최소 잔액 유지 필요.");
        }
        balance -= amount;
        transactionHistory.add("출금 " + amount);
    }

    // 송금
    public void transfer(int amount, EWallet otherWallet) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("송금 금액은 0보다 커야 합니다.");
        }
        int fee = (int) Math.round(amount * transferFeeRate);
        int totalAmount = amount + fee;
        if (balance - totalAmount < minBalance) {
            throw new InsufficientBalanceException("잔액이 부족하여 송금 불가 (수수료 포함).");
        }
        balance -= totalAmount;
        otherWallet.balance += amount;
        transactionHistory.add("송금 " + amount + " -> " + otherWallet.owner + " (수수료 " + fee + ")");
        otherWallet.transactionHistory.add("수신 " + amount + " <- " + this.owner);
        System.out.println(owner + " 지갑에서 " + otherWallet.owner + " 지갑으로 " + amount + " 송금 완료 (수수료 " + fee + ")");
    }

    // 잔액 조회
    public int getBalance() {
        return balance;
    }

    // 거래 내역 출력
    public void printTransactionHistory() {
        System.out.println(owner + " 거래 내역:");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
        System.out.println();
    }

    // 지갑 정보 출력
    public void printWalletInfo() {
        System.out.println("지갑ID: " + walletID + ", 소유자: " + owner + ", 잔액: " + balance);
    }
}



public class Ex09EWallectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            // 2개의 지갑 생성
	            EWallet aliceWallet = new EWallet("W001", "Alice", 5000);
	            EWallet bobWallet = new EWallet("W002", "Bob", 3000);

	            // 지갑 정보 출력
	            aliceWallet.printWalletInfo();
	            bobWallet.printWalletInfo();

	            // 송금 테스트
	            aliceWallet.transfer(2000, bobWallet);

	            // 지갑 정보 재출력
	            aliceWallet.printWalletInfo();
	            bobWallet.printWalletInfo();

	            // 거래 내역 출력
	            aliceWallet.printTransactionHistory();
	            bobWallet.printTransactionHistory();

	            // 출금 테스트
	            bobWallet.withdraw(1000);
	            bobWallet.printWalletInfo();
	            bobWallet.printTransactionHistory();

	        } catch (InsufficientBalanceException e) {
	            System.out.println("거래 실패: " + e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println("거래 실패: " + e.getMessage());
	        }

	}

}
