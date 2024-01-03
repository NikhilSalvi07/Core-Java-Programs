
public class PracticeStud1 {
	int mks_cse=90;
	int mks_mm=85;

	public PracticeStud1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PracticeStud1(int mks_cse, int mks_mm) {
		super();
		this.mks_cse = mks_cse;
		this.mks_mm = mks_mm;
	}

	int getTotalMks() {
		return (mks_cse + mks_mm);
	}
	
	int getPercent() {
		return (getTotalMks()/2);
	}

	char getGrade() {
		if(getPercent() >= 90)
			return 'A';
		else
			return 'B';
	}
	
	String getResult() {
		if(getPercent() > 40)
			return "Pass";
		else
			return "fail";
	}
	
	
	
}
