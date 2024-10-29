package method;

public class Example {

	public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // A method that prints a message
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Example example = new Example();
        
        // Calling the add method
        int result = example.add(5, 3);
        System.out.println("Sum: " + result);

        // Calling the printMessage method
        example.printMessage("Hello, World!");
    }
}