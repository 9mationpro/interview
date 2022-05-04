package interview;

public class Seperatezeros {

	public static void main(String[] args) {
		String s3="gopal khandare";
		System.out.println("Actual String: "+s3);
		String str[]=s3.split(" ");
		String temp="";

		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
		}
		System.out.println("reverse statement: "+temp);	
		
		
		int[] arr1= new int[8];
		int[] arr= {0,1,0,0,1,0,1,1,1};
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.print(" "+arr[i]);
			}
			
		}
		for(int j=0;j<arr.length;j++) {
		if(arr[j]==1) {
				System.out.print(" "+arr[j]);
			}
		
		
		//System.err.println("hel");
		}
		
		
		
		
	}

}
