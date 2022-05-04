package interview;

public class Missing_no {

	public static void main(String[] args) {
		
			int[] a = { 2, 1, 3, 5 };
			System.out.println(findDisappearedNumbers(a));
		}
		// Java program to find missing Number

			public static int findDisappearedNumbers(int[] nums)
			{
				int n=nums.length;
				int sum=((n+1)*(n+2))/2;
				for(int i=0;i<n;i++)
				sum-=nums[i];
				return sum;
			}
			
		

	}

