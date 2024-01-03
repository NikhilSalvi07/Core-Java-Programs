
public class StudData {
	
	int id,marks,m1,m2,m3;
	String sname,grade;
	float percent;
	

	public StudData(int id, String sname) {
		//super();
		this.id = id;
		this.sname = sname;
		//m1=80;
		//m2=85;
		//m3=90;		
		marks = m1+m2+m3;
		percent = marks / 3;
				
	}
	
	

	void showData() {
		
		System.out.println("Id : "+id+"\nName= "+sname);		
		System.out.println("Marks of 3 subjects: "+marks);
		System.out.println("Percentage : "+percent+"%");
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<args.length;i++) {
			System.out.println("marks of m1,m2,m3 are : "+args[i]);
		}
		
		int m1 = Integer.parseInt(args[0]);
		int m3 = Integer.parseInt(args[1]);
		int m2 = Integer.parseInt(args[2]);
		
		StudData sd = new StudData(1, "Rushi");
		sd.showData();
	}

}
