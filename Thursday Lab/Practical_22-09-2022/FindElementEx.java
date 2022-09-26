import java.util.Scanner;

public class FindElementEx
{
	public static void main(String[]args)
	{
		int n;
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) 
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Highest value is : " +arr[1]);
		System.out.println("Second Smallest value is : " +arr[n-2]);
			
	}
}
