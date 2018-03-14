
public class Customer {
	

	private String name;
	private String address;
	private int accountNumber;

//	public Customer() {
//		this("Default Name", "Default Address", 1000);
//		System.out.println("Empty constructor called");
//		
//	}
	
	public Customer(String name, String address, int accountNumber) {
		System.out.println("Customer constructor with parameters called");
		this.name = name;
		this.address = address;
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void details() {
		System.out.println("Customer Details");
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Account Number: " + getAccountNumber());
	}
}
