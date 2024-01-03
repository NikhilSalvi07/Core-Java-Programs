
public class StudInfo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDataCapture_obj sd = new StudentDataCapture_obj(1, "java", 99, 30);
		ProcessStudData psd = new ProcessStudData();
		int totMks = psd.calcTotMks(sd);
			System.out.println("Total  marks is = "+ totMks);
	}

}
