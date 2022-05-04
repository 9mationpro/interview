package interview;

public class No_string {

		
	    
	    static public void main(String[] args)
	    {
	        // Saving the input in a string
	        String str = "LLp";
	 
	        // Function returns 1 if all elements
	        // are in range '0 - 9'
	        if (isNumber(str))
	            System.out.println("Integer");
	 
	        // Function returns 0 if the
	        // input is not an integer
	        else
	            System.out.println("String");
	    }
	
	static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }
}
	 