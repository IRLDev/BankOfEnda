public class Account extends Customer {

		private double balance;
		private double deposit;
		private double withdraw;
		
		
		public Account(String name, String address, int accountNumber, double balance, double deposit, double withdraw) {
			super(name, address, accountNumber);
			System.out.println("Account constructor called");
			this.balance = balance;
			this.deposit = deposit;
			this.withdraw = withdraw;
		}
		
		public void balance(double balance) {
			this.balance = balance;
			System.out.println("Current Balance = " + balance);
		}
	
		public void deposit(double Amount) {
			this.balance += Amount;
			System.out.println("Deposit of " + Amount + "New balance = " + this.balance);
		}
	
		public void withdrawal(double withdrawalAmount) {
			if(this.balance - withdrawalAmount <0) {
				System.out.println("Only " + this.balance + " available. Withdrawal not processed");
			} else {
				this.balance -= withdrawalAmount;
				System.out.println("Withdrawal of " + withdrawalAmount + " process. Remaining balance = " + this.balance);
			}
		}

		public double getBalance() {
			return balance;
		}

		public double getDeposit() {
			return deposit;
		}

		public double getWithdraw() {
			return withdraw;
		}
		
		

}

