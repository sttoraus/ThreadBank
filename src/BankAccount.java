class BankAccount {
	private int balance;

	public BankAccount(int initialBalance) {
		balance = initialBalance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
}