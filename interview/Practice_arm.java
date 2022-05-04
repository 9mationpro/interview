package interview;

public class Practice_arm {

	

	public static void main(String[] args) {
		int num=153,i,sum=0;
		int t=num;
		while( num>0){
			  i=num%10;
			
			sum=sum+(i*i*i);
			num=num/10;
		}
			if(t==sum)
			{
				System.out.println("armstrong");
				
				
			}
			else
			{
				System.out.println("invalid");
			}
		

	}
	

}
