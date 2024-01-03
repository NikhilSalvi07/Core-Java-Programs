
public class Customer_Data {
// properties
	int custId; // alternative way     Integer custId;
	String custName;
	// generate constructor    ---     default / overloaded
	public Customer_Data() {   // default or zero arg constructor
		//super();
		// TODO Auto-generated constructor stub
	}
	// overloaded constructor    ---   parameterised constructor
	public Customer_Data(int custId, String custName) {
		//super();
		this.custId = custId;
		this.custName = custName;
	}
	
	
	// method   ----   used to
	void showData() {
		System.out.println("customer data is "+ custId + " "+ custName);
	}
}