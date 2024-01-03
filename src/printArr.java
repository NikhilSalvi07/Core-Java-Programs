
public class printArr {
	public static void printArray(int arr[]) {		//condition to find array
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[] = {100,96,1,97,3,5,4,6,2,98};	//Problem statement
	
	for(int i=0; i<arr.length-1; i++) {
		for(int j=0; j<arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;				
			}
			
		}
	}
	printArray(arr);
	System.out.println("2nd Highest number is :"+(arr[8]));
	
	}
}

