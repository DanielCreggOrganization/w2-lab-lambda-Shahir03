package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        StringOperation toUpperCase = (String input) -> input.toUpperCase(); // Create instance of ToUpperCase
        String result = toUpperCase.apply("hello world!"); // Test with a string
        System.out.println("Result: " + result); // Output: HELLO WORLD!
        
        //part 3
        Runnable helloRunnable = () -> System.out.println("Hello from the thread");
        Thread thread = new Thread(helloRunnable);
        thread.start(); 
    }
    
}

