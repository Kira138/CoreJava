package Arrays;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter five integers:");

        int e1 = s.nextInt();
        int e2 = s.nextInt();
        int e3 = s.nextInt();
        int e4 = s.nextInt();
        int e5 = s.nextInt();
        

        int[] a = {e1, e2, e3, e4, e5};

         int sum=0;
        System.out.println("The Array elements are:");
        for (int i = 0; i < a.length; i++)
        {
        	 System.out.println(a[i]);
        	 if(a[i]%2==0)
            {
          
            sum+=a[i];
          
            }
        }
            
            System.out.println("Sum of the even elements is: " + sum);
          
        }
	}

        
        
    



		
	
	


	
