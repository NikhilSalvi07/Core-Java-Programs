package com.elec.billing;

public class main {
	public static void main(String args[]) {		
		ElectricTariff a = new DomesticElectric_Bill_Impl();
		GST b = new DomesticElectric_Bill_Impl();
		int temp = a.getBill(75);
		System.out.println("Total bill with GST : "+(b.cal_gst(temp)+temp));
	}
}