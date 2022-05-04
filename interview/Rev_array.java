package interview;

public class Rev_array {

	public static void main(String[] args) {

		
		
				int[] a1= {2,4,7,18,17,15};
				
				
				for(int i=0;i<a1.length;i++) {
					
					for(int j=i+1;j<a1.length;j++) {
						if(a1[i]<a1[j]) {
							
							int temp=a1[i];
							a1[i]=a1[j];
							a1[j]=temp;
							
							
						}
						
						
						
					}
				
				
				
				
				
				
				
				}
				
				for(int i=0;i<a1.length;i++) {
					
				
				System.out.print(" "+a1[i]);
				
			
				
				
				
				
				}
			}

		

		
		
		
		
		
		
	}

