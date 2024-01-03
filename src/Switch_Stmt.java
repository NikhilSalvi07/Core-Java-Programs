import java.util.Scanner;

public class Switch_Stmt {
	
	int ch;

	public Switch_Stmt() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Switch_Stmt(byte ch) {
		super();
		this.ch = ch;
	}

	void getChoice() {
		System.out.println("1. Data Types");
		System.out.println("2. Class");
		System.out.println("3. Overloading");
		System.out.println("4. Static");
		System.out.println("5. Exit");
		System.out.println("Enter Your Choice : ");
		//System.in.read();
		Scanner sc = new Scanner(System.in);	
		ch = sc.nextInt();		
	
	 switch(ch)  
	    {  
	        case 1:   
	            System.out.println("Int = 4 byte, int a = 10");  
	            break;  
	        case 2:   
	            System.out.println("A class is the blueprint from which individual objects are created");  
	            break;  
	        case 3:   
	            System.out.println("Overloading means a class has more than one method of the same name and their parameters are different");  
	            break;
	        case 4:   
	            System.out.println("The static keyword in Java is mainly used for memory management");  
	            break;
	        case 5:   
	            System.out.println("Exit");
	        	break;
	        
	    }        
	}
	
}
