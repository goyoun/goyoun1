package Bank;

public class BankDTO {
	
	String name;
	String accountNumber;
	int clientNumber;
	int balance;
	

	public BankDTO(String name, String accountNumber, int clientNumber, int balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.clientNumber = clientNumber;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankDTO [name=" + name + ", accountNumber=" + accountNumber + ", clientNumber=" + clientNumber
				+ ", balance=" + balance + "]";
	}
	
	
}