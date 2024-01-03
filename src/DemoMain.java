
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer_Data cd;
		cd = new Customer_Data();//Object created memory allocated
		
		//injecting the properties with values
		cd.custId=10;
		cd.custName="java";
		//invoking the method
		cd.showData();
	}

}
