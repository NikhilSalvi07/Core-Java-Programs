
public class DemoStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDataCapture sd = new StudentDataCapture(1, "Rushi", 90, 83);
		//int totMks = sd.getTotalMks();
		//System.out.println(totMks);
		//USE Following instead of this 2 lines
		
		System.out.println("Total Makrs are : "+sd.getTotalMks());
		System.out.println("Total Percentage is : "+sd.getPercentage());
		System.out.println("Grade is : "+sd.getGrade());
		System.out.println("Result is : "+sd.getResult());
		
	}

}
