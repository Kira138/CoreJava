package Arrays;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter five integers:");

        int o1 = s.nextInt();
        int o2 = s.nextInt();
        int o3 = s.nextInt();
        int o4 = s.nextInt();
        int o5 = s.nextInt();
        

        int[] a = {o1, o2, o3, o4, o5};


        System.out.println("The Array elements are:");
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]%2!=0)
            {
            System.out.println(a[i]);
            }
        }
	}
}
        
        
    



		
	
	


	
