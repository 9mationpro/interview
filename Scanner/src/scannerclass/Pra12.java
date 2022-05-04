package scannerclass;

import java.util.Scanner;

public class Pra12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	String s= "this is me at infosys";
		
		Scanner n1=new Scanner(s);
		
		System.out.println(" bollean result  :"+n1.hasNext());
		System.out.println(" String  "+n1.nextLine());
		
		n1.close();
		
		
		System.out.println("***********Enter your details**********");
		
		Scanner n2=new Scanner(System.in);
		
		System.out.print("enter your name   :");
		String name=n1.next();
		System.out.print("Name :"+name);
		
		System.out.print("enter your age  :");
		int age=n1.nextInt();
		System.out.print("Age  :"+age);
		
		System.out.println("Enter your salary  :");
		double salary=n1.nextDouble();
		System.out.println("Salary  :"+salary);
		n2.close();
		
		
		
		
		

	}

}
