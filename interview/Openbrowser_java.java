package interview;

import java.io.IOException;

public class Openbrowser_java {

	public static void main(String[] args)  {
		
	    
	        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
	 
	        String[] s = new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://javaconceptoftheday.com/"};
	 
	        try
	        {
	            runtime.exec(s);        //opens "https://javaconceptoftheday.com/" in chrome browser
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	}
}