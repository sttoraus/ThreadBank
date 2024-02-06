
class Customer extends Thread{
	private BankAccount account;
	private int amount;

	public Customer(BankAccount a, int d) {
		account = a;
		amount = d;
	}

	public void run() {
		for (int i = 0; i < 1000; i++)
			account.deposit(amount);
	}
}