package method;

import java.util.Scanner;

public class FacebookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				System.out.println("Enter uname");
				String uname=s.next();
				System.out.println("Enter pwd");
				  int pwd = s.nextInt();
				 System.out.println("Enter age");
			        int age = s.nextInt();
                 System.out.println("Enter mobile number:");
			        long mnum = s.nextLong();

			       
			        Facebook f = new Facebook(uname, pwd, age, mnum);

			      
			        f.Profile();

			       
			        System.out.println("Username: " + f.getuname());
			        System.out.println("Password: " + f.getpwd());
			        System.out.println("Mobile Number: " + f.getmnum());
			        // Update the details using setter methods
			        s.nextLine(); // Consume the leftover newline
			        System.out.println("\nUpdate the details:");
			        System.out.println("Enter new username:");
			        String newUname = s.nextLine();
			        f.setuname(newUname);

			        System.out.println("Enter new password:");
			        int newPwd = s.nextInt();
			        f.setpwd(newPwd);

			        System.out.println("Enter new mobile number:");
			        long newMnum = s.nextLong();
			        f.setmnum(newMnum);

			        // Print the updated details using getters
			        System.out.println("Updated Username: " + f.getuname());
			        System.out.println("Updated Password: " + f.getpwd());
			        System.out.println("Updated Mobile Number: " + f.getmnum());
			        

					
	}

}
