
public class Main {
	public static void main(String args[]) throws InterruptedException {
		BankAccount a = new BankAccount(1000);
		Thread kunde1 = new Customer(a, +10);
		Thread kunde2 = new Customer(a, -10);
		kunde1.start(); 
		kunde2.start();
		kunde1.join(); 
		kunde2.join();
		System.out.println(a.getBalance());
		}
}
