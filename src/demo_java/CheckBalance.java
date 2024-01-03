package demo_java;

public class CheckBalance{
	int id;
	String name;
	public CheckBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckBalance(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void checkBalance(int bal) throws InsufficientBalanceException {
		if(bal<100) {
			throw new InsufficientBalanceException(bal);
		}
		else if(bal > 100) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println("Transaction Successful and Balance is "+(100-bal));
		}
	}
	
}
