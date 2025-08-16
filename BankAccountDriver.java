public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Sakshi", "SBI", 4765867338L, 1234, "Ten27637828", 10000);
		b1.setPin(4765867338L, 1234, 123456);
		b1.credit(4765867338L, 123456, 5000);
		b1.debit(4765867338L, 123456, 2000);
		System.out.println("Final Balance: " + b1.getBalance(4765867338L, 123456));
	}
}
