package Arrays;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		char []ch=new char[size];
		System.out.println("Enter array elements");
		for(int i=0;i<ch.length;i++){
			ch[i]=s.next().charAt(0);
			
		}
		System.out.println("the array elements are");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
