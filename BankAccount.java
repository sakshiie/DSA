 public class BankAccount {

		private String username;
		private String bankName;
		private long accno;
		private int pin;
		private String ifsc;
		private double balance;
		
		BankAccount(String username, String bankName, long accno, int pin, String ifsc, double balance){
		this.username = username;
		this.bankName=bankName;
		this.accno=accno;
		this.pin=pin;
		this.ifsc=ifsc;
		this.balance=balance;
		}
		
	public String getUserName() {
			return username;
		}
	public String getBankName() {
		return bankName;
	}
	public long getAccno() {
		return accno;
		
	}
	public void setPin(long accno, int oldPin, int newPin) {
		if(this.accno==accno && pin==oldPin) {
			this.pin=newPin;
			System.out.println("Pin updated");
		}
		else {
			System.out.println("Inavlid credentials");
		}
	}
	public String getIFSC() {
		return ifsc;
	}
	public double getBalance(long accno, int pin) {
		if(this.accno==accno && this.pin==pin) {
			return balance;	
		}
		else {
			System.out.println("Invalid ");
		return 0;	
		}	
	}
	public void credit(long accno, int pin,  double amt) {
		if(this.accno==accno && this.pin==pin) {
			if(amt>0) {
				balance+=amt;
				System.out.println("Amount credited !");
			}
			else {
				System.out.println("Inavlid amount");
			}
		}
		else {
			System.out.println("inavlid cred");
		}
	}
	
	public void debit(long accno, int pin,  double amt) {
		if(this.accno==accno && this.pin==pin) {
			if(amt>0) {
			  if(balance-amt>1000) {
				  balance-=amt;
				  System.out.println("Amount debited !");
			  }	
			else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("inavlid cred");
		}
	}
	}
}
