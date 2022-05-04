package interview;

import java.util.Arrays;

public class Array_equal {

	public static void main(String[] args) {
		//defining arrays to be compare   
		int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};   
		int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8}; 
		//Object a3[]= {a1};
		//Object a4[]= {a2};
		//comparing references using == operator  
		//works the same as a1.equals(a2)   
		if (Arrays.equals(a1, a2)) { 
		System.out.println("Arrays are equal.");   
		}
		else {   
		System.out.println("Arrays are not equal.");   
		}
		diff_ref();
		deep_equals();
		} 
	


//if(a1==a2) will compare the objects and their reference so they will not compare content of array
//if (Arrays.equals(a1, a2)) but this method compares the content in array
//but if we store our array in different ref or object and compare then
//it will give false answer  so we have to use deepequals method in below example

public static void diff_ref() {
	//defining arrays to be compare   
			int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};   
			int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8}; 
			Object a3[]= {a1};
			Object a4[]= {a2};
			//comparing references using == operator  
			//works the same as a1.equals(a2)   
			if (Arrays.equals(a3, a4)) { 
			System.out.println("Arrays are equal.");   
			}
			else {   
			System.out.println("Arrays are not equal.");   
			}
			} 

public static void deep_equals() {
	//defining arrays to be compare   
			int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};   
			int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8}; 
			Object a3[]= {a1};
			Object a4[]= {a2};
			//comparing references using == operator  
			//works the same as a1.equals(a2)   
			if (Arrays.deepEquals(a3, a4)) { 
			System.out.println("Arrays are equal.");   
			}
			else {   
			System.out.println("Arrays are not equal.");   
			}
			} 
	
}
