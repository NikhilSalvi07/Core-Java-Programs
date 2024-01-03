package demo_java;

public class DemoPrException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignException2 ae = new AssignException2(1,"Rushi");
		try {
			ae.ApplyForLicense(20);
		} catch (AssignException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("You r not eligible for License your age is "+e.getAge());
		}
				
	}

}
