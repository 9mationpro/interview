package interview;

import java.io.IOException;

public class Open_notepad {

	public static void main(String[] args) {
	    {
	        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
	 
	        try
	        {
	            runtime.exec("notepad.exe");        //opens "sample.txt" in notepad
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	}


