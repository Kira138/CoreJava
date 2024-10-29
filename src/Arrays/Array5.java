package Arrays;

import java.util.Scanner;

public class Array5 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		//declaration and instantiation
		int[]a=new int[size];
		System.out.println("Enter array elements");
		//initialization
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("the array elements are");
		//utilization
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
