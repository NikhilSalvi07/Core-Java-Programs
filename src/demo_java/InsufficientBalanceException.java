package demo_java;

public class InsufficientBalanceException extends Exception{
	int bal = 100;

	public InsufficientBalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public InsufficientBalanceException(int bal) {
		super();
		this.bal = bal;
	}



	public int getBalance() {
		return bal;
	}
	
	
}
