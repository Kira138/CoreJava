package method;

public class MainClassInsta {

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println(Instagram.followers); // Outputs: 0
        
        // Calling static method
        Instagram.login(); // Outputs: Login via Facebook
        
        // Creating an instance of Instagram class
        Instagram i = new Instagram();
        
        // Accessing instance variable
        System.out.println(i.id); // Outputs: null (default value for String)
        
        // Calling instance method
        i.reels(); // Outputs: Reels are not allowed
    }
}
