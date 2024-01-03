
public class StudentDataCapture {
	
	int stdId;
	String stdName;
	int mks_cse,mks_mm;
	//result, percentage, grade;
	public StudentDataCapture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDataCapture(int stdId, String stdName, int mks_cse, int mks_mm) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.mks_cse = mks_cse;
		this.mks_mm = mks_mm;
	}
	
	//get the total marks
	int getTotalMks() {
		//int totalMks = mks_cse + mks_mm;
		//return totalMks;						//Instead of this both line use following
		
		return(mks_cse + mks_mm);		
	}
	
	int getPercentage() {
		//int avg = getTotalMks()/2;
		//return avg;					//Instead of this both line use following
		
		return (getTotalMks()/2);
	}
	
	//get the grade
	char getGrade() {
		//int per = getPercentage();
		if(getPercentage() >= 90)
			//System.out.println("Grade A");	//or use
			return 'A';
		else
			//System.out.println("Grade B");	//or use
			return 'B';
	}
	
	//get the Result
	String getResult() {
		if(getPercentage() > 40)
			return "Pass";
		else
			return "fail";
	}

}
