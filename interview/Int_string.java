package interview;

public class Int_string {

	public static void main(String[] args) {
		//integer to string
        int x = 5;  
        //1st way  
        String str = Integer.toString(x); // using Integer.toString()  
        System.out.println(str);  
   
        //2nd way  
        String str2 = String.valueOf(x); // using String.valueOf()  
        System.out.println(str2);  
  
    
//ConvertStringToInteger 
      
        //1st way  
        String str11 = "5";  
        int result = Integer.parseInt(str11); // Using Integer.parsrInt()  
        System.out.println(result);  
   
        //2nd way  
        String str22 = "5";  
        Integer result2 = Integer.valueOf(str22); // Using Integer.valueOf()  
        System.out.println(result2);  
   
    }  
}  

