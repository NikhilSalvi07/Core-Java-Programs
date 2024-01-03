package com.collection;

import java.util.HashSet;

public class DemoSet2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		StudentData1 sd0=new StudentData1(1,"Java");
		StudentData1 sd1=new StudentData1(1,"Java");
		StudentData1 sd2=sd1;
		StudentData1 sd3=new StudentData1(4,"Java");
		
		System.out.println("sd0 equals sd1 ? "+sd0.equals(sd2));
		System.out.println("sd1 equals sd2 ? "+sd1.equals(sd3));
		System.out.println("sd1==sd2 ?"+(sd1==sd2) );

		System.out.println("Memory location of sd0" +sd0.hashCode());
		System.out.println("Memory location of sd0" +sd0.hashCode());
		System.out.println("Memory location of sd0" +sd0.hashCode());
		System.out.println("Memory location of sd0" +sd0.hashCode());
		
		HashSet<StudentData1>hs=new HashSet<>();
		hs.add(sd0);
		hs.add(sd1);
		hs.add(sd2);
		hs.add(sd3);
		System.out.println(hs   );
	}

}
class StudentData1{
	private int stdId;
	private String stdName;
	//cons
	public StudentData1() {
		// TODO Auto-generated constructor stub
	}
	public StudentData1(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "StudentData1 [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	@Override
	public int hashCode() {
		return stdId+1;
		}
	@Override
	public boolean equals(Object obj) {
		//check whether the std id is equal to the id that is being added
		if((obj  instanceof StudentData1) && (((StudentData1)obj).stdId == this.stdId))
        return true;
        return false;
		
	}

//Override hash code and equals methods
	      
}