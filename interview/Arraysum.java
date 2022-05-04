package interview;

public class Arraysum {

	public static void main(String[] args) {
double sum=0;
		int[]a= {2,5,8,7,5};
		
		for(int i=0;i<a.length;i++) {
			
			 sum=sum+a[i];
			
		}
		
		
		
		System.out.println(" "+sum);
		double average =sum/a.length;
		System.out.println(average);
	}

}
