package interview;

public class Muteable_String {

	public static void main(String[] args) {
            String st1 = "Java";  
            String st2 = "Java";  
            System.out.println("Before Modification in st1");  
            ProveStringImmutable.referenceCheck(st1, st2);  
            st1 = "ava";  
            System.out.println("After Modification");  
            ProveStringImmutable.referenceCheck(st1, st2);  
        } 
	}
	     class ProveStringImmutable {  
	        public static void referenceCheck(Object x, Object y) {  
	            if (x == y) {  
	                System.out.println("Both pointing to the same reference");  
	       
	            } else {  
	                System.out.println("Both are pointing to different reference");  
	            }  
	        }  
	        
	    
}
