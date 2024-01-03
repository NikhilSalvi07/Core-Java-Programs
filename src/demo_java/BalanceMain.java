package demo_java;

public class BalanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBalance ie = new CheckBalance(1,"Rushi");
		
		try {
			ie.checkBalance(10);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//int withdraw ;
			System.out.println("Transaction successfull and Your remaining Balance is "+ (100 - e.getBalance()));
		}
	}

}
