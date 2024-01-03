package demo_java;

public class Assignment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}*/
		
		/*
		System.out.println("1st Assignment:");
		for(int a=1;a<=10;a++) {
			int i=9;
			System.out.println(i+"*"+a+"="+ i*a);
		}
		*/
		
		/*
		System.out.println("2nd Assignment:");
		for(int i=0;i<args.length;i++) {			
			System.out.println(args[0]+"+"+args[1]+"="+args[0]+args[1]);
		}
		
		for(int i=0;i<args.length;i++) {
        	System.out.println("Table of :"+args[i]);
        	}
        	for(int j=1;j<=10;j++) {
        		for (int i = 0; i < args.length; i++) {
                	int num = Integer.parseInt(args[i]);
        			System.out.println(num+ "*" +j+"="+(num*j));
        		}
        }*/

		/*
		//Trignometric Operations
		System.out.println("3rd Assignment:");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		
		}
		double value = Double.parseDouble(args[0]);			//Converting string arguments value to double value

		System.out.println("Value of Sin(90) = "+Math.sin(value));		//Using Math function calculating value of sin
		System.out.println("Value of cos(90) = "+Math.cos(value));		//Using Math function calculating value of sin
		System.out.println("Value of tan(90) = "+Math.tan(value));		//Using Math function calculating value of sin
		System.out.println("Value of Sin(90) = "+Math.cot(value));
		System.out.println("Value of Sin(90) = "+Math.sec(value));
		System.out.println("Value of Sin(90) = "+Math.cosec(value));
        	
        */	
        System.out.println("3rd Assignment: calculation of numbers");
        	for(int i=0;i<args.length;i++) {
    			System.out.println(args[i]);
    		}
    		int no1=Integer.parseInt(args[0]);
    		int no2=Integer.parseInt(args[1]);
    		
    		// Add
            int sum = no1 + no2;
            System.out.println(no1 + " + " + no2 + " = " + sum);
            
            //Sub
            int sub = no1 - no2;
            System.out.println(no1 + " - " + no2 + " = " + sub);
            
          //Mul
            int mul = no1 * no2;
            System.out.println(no1 + " * " + no2 + " = " + mul);
            
          //Div
            int div = no1 / no2;
            System.out.println(no1 + " / " + no2 + " = " + div);
            
	}

}
