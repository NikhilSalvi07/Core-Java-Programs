
public class StudentInfo {
	int sId[];
	String sName[];
	/*int m1[] = {85,75,90};
	int m2[] = {60,70,80};
	int m3[] = {60,75,85};
	*/
	
	int m1[],m2[],m3[];
	
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInfo(int[] sId, String[] sName, int[] m1, int[] m2, int[] m3) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	int getTotal() {
		return(m1[0] + m2[0] +m3[0]);		
	}
	int getPercent() {
		return (getTotal()/2);
	}
	
	
	
}
