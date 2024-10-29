package Arrays;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter five integers:");

        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int p3 = s.nextInt();
        int p4 = s.nextInt();
        int p5 = s.nextInt();
        int p6 = s.nextInt();

        int[] a = {p1, p2, p3, p4, p5,p6};
        int product = 1;

        System.out.println("The Array elements are:");
        for (int i = 0; i < a.length; i++) {
            product *= a[i]; 
        }

        System.out.println("The product of array elements is: " + product);
    }



		
	}
	

