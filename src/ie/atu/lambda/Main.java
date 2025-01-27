package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        StringOperation toUpperCase = new ToUpperCase(); // Create instance of ToUpperCase
        String result = toUpperCase.apply("hello world!"); // Test with a string
        System.out.println("Result: " + result); // Output: HELLO WORLD!
    }
    
}

